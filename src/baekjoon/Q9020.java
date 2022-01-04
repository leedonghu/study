package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9020 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int test = Integer.parseInt(br.readLine());
		int t = 0;
		
		while(t < test) {
			int n = Integer.parseInt(br.readLine());
//			int[] answer = solution(n);
//			sb.append(answer[0] + " " + answer[1]).append("\n");
//			int[] answer = solution02(n);
//			sb.append(answer[0] + " " + answer[1]).append("\n");
			int[] answer = solution03(n);
			sb.append(answer[0] + " " + answer[1]).append("\n");
			t++;
		}
		
		System.out.println(sb.toString());
	}
	
	public static int[] solution(int n) {
		int[] arr = new int[n];
		int cnt = 0;
		
		for(int i=2; i<=n; i++) {
			boolean check = true;
			for(int j=2; j*j<=i; j++) {
				if(i%j == 0) {
					check = false;
					break;
				}
			}
			if(check == true) {
				arr[cnt] = i;
				cnt++;
			}
		}
		
		int[] answer = findGoldbachNumber(arr, n);
		
		return answer;
		
	}

	private static int[] findGoldbachNumber(int[] arr, int n) {
		int[] answer = new int[2];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				break;
			}
			for(int j=i; j<arr.length; j++) {
				if(arr[i] + arr[j] == n) {
					answer[0] = arr[i];
					answer[1] = arr[j];
				}
			}
		}
		
		return answer;
		
	}
	
	public static int[] solution02(int n) {
		int[] arr = new int[10000];
		
		int cnt = 0;
		for(int i=2; i<=10000; i++) {
			boolean check = true;
			for(int j=2; j*j<=i; j++) {
				if(i%j == 0) {
					check = false;
					break;
				}
			}
			if(check == true) {
				arr[cnt] = i;
				cnt++;
			}
		}
		
		int[] answer = new int[2];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0 || arr[i] >= n) {
				break;
			}
			for(int j=i; j<arr.length; j++) {
				if(arr[i] + arr[j] == n) {
					answer[0] = arr[i];
					answer[1] = arr[j];
				}
			}
		}
		
		return answer;
		
	}
	
	public static int[] solution03(int n) {
		int[] arr = new int[2];
		int dev01 = n / 2; //차이가 가장 적은값을 구해야 함으로 n을 절반부터 시작
		int dev02 = n - dev01;
		
		while(true) {
			if(isPrime(dev01) && isPrime(dev02)) {
				break;
			}else {
				dev01--;
				dev02++;
			}
		}
		arr[0] = dev01;
		arr[1] = dev02;
		return arr;
		
	}

	private static boolean isPrime(int n) {
		boolean check = true;
		for(int i=2; i*i<=n; i++) {
			if(n%i == 0) {
				check = false;
				break;
			}
		}
		return check;
	}
}
