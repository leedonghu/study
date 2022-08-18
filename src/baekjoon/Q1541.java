package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		String[] arr1 = str.split("-");
		int sum = 0;
		for(int i=0; i<arr1.length; i++) {
			int sum2 = 0;
			String[] arr2 = arr1[i].split("\\+");
			for(int j=0; j<arr2.length; j++) {
				sum2 += Integer.parseInt(arr2[j]);
			}
			
			if(i == 0) {
				sum += sum2;
			}else {
				sum -= sum2;
			}
		}
		
		System.out.println(sum);
	}
}
