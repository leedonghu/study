package algorithm.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class PhysExamSearch {
	static class PhyscData{
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		//오름차순으로 정렬하기 위한 comparator
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1: (d1.height < d2.height) ? -1 : 0;
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PhyscData[] x = {
				new PhyscData("이나령", 162, 0.3),
				new PhyscData("유지훈", 168, 0.4),
				new PhyscData("김한결", 169, 0.8),
				new PhyscData("홍준기", 171, 1.5),
				new PhyscData("전서현", 172, 0.7),
				new PhyscData("이호연", 174, 1.2),
				new PhyscData("이수민", 175, 2.0),
		};
		
		int end = 0;
		do {
			System.out.print("몇 cm 인 사람을 찾고있나요?");
			int height = Integer.parseInt(br.readLine());
			int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER); //배열 x에서 키가 height인 요소를 HEIGHT_ORDER에 의해 검색
			
			if(idx < 0) {
				System.out.println("요소가 없습니다.");
			}else {
				System.out.println("x[" + idx + "] 에 있습니다.");
				System.out.println("찾은 데이터 : " + x[idx]); //오버라이드 한toString 메소드에 의해 보여짐
				end = 1;
			}
		}while(end != 1);
	}
}
