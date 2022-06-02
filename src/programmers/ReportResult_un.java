package programmers;

import java.util.Arrays;
import java.util.HashSet;

public class ReportResult_un {
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		solution(id_list, report, k);
	}
	
	static int[] solution(String[] id_list, String[] report, int k) {
		
		int[] arr1 = new int[id_list.length];
		int[] arr2 = new int[id_list.length];
		HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
		String[] resultArr = hashSet.toArray(new String[0]);
		String[][] reReport = new String[resultArr.length][2];
		
		for(int i=0; i<resultArr.length; i++) {
			String[] split = resultArr[i].split(" ");
			reReport[i][0] = split[0];
			reReport[i][1] = split[1];
		}
		
		for(int i=0; i<reReport.length; i++) {
			for(int j=0; j<id_list.length; j++) {
				if(reReport[i][1].equals(id_list[j])) {
					arr1[j]++;
					
				}
			}
		}
		
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] >= k) {
				for(int j=0; j<reReport.length; j++) {
					if(reReport[j][1].equals(id_list[i])) {
						for(int f=0; f<id_list.length;f++) {
							if(reReport[j][0].equals(id_list[k])) {
								arr2[k]++;
							}
						}
					}
				}
			}
		}
		
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr2[i]);
		}
		return null;
	}
}
