package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2577 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int multi = 1;
		for(int i=0; i<3; i++) {
			multi *= Integer.parseInt(br.readLine());
		}
		
		String multiple = String.valueOf(multi);
		
		String[] arr = multiple.split("");
		int[] count = {0,0,0,0,0,0,0,0,0,0};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("0")) {
				count[0]++;
			}else if(arr[i].equals("1")) {
				count[1]++;
			}else if(arr[i].equals("2")) {
				count[2]++;
			}else if(arr[i].equals("3")) {
				count[3]++;
			}else if(arr[i].equals("4")) {
				count[4]++;
			}else if(arr[i].equals("5")) {
				count[5]++;
			}else if(arr[i].equals("6")) {
				count[6]++;
			}else if(arr[i].equals("7")) {
				count[7]++;
			}else if(arr[i].equals("8")) {
				count[8]++;
			}else {
				count[9]++;
			}
		}
		
		for(int i=0; i<count.length; i++) {
			sb.append(count[i]).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
