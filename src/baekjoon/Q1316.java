package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1316 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int test = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i=0; i<test; i++) {
			String str = br.readLine();
			if(check(str) == true) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
	
	public static boolean check(String str) {
		//문자열이 중복되었는지 확인하는 배열
		boolean[] check = new boolean[26];
		
		//이전의 문자를 저장하는 변수
		int prev = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			//이전 문자와 현재의 문자가 같지 않을때
			if(prev != str.charAt(i)) {
				//지금의 문자가 이전에 나왔던 적이 없다면
				if(check[str.charAt(i) - 'a'] == false) {
					//해당 문자가 위치하는 배열을 true로 바꿔줌
					check[str.charAt(i) - 'a'] = true;
					//이전 문자를 현재문자로 저장
					prev = str.charAt(i);
				}else {
					//지금의 문자가 이미 나왔었다면 false를 return
					return false;
				}
				
			}
			
		}
		//for문을 다 돌고도 false를 return 하지 않는다면 true를 리턴
		return true;
	}
}
