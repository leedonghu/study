package algorithm.stringSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BFmatch {
	static int bfMatch(String txt, String pat) {
		int pt = 0; //txt커서
		int pp = 0; //pat커서
		
		while(pt != txt.length() && pp != pat.length()) {
			if(txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			}else{
				pt = pt - pp +1; //txt커서 한칸 전진
				pp = 0; //pat커서 초기화
			}
		}
		
		if(pp == pat.length()) { //패턴이 일치하면 패턴과 일치하는 문자열의 시작 인덱스 리턴
			return pt - pp;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("텍스트: ");
			String s1 = br.readLine();
			System.out.print("패턴: ");
			String s2 = br.readLine();
			
			int idx = bfMatch(s1, s2);
			if(idx == -1) {
				System.out.println("텍스트에 패턴이 없습니다.");
			}else {
				//일치하는 문자 바로 앞까지의 길이구함
				int len = 0;
				for(int i=0; i<idx; i++) {
					len += s1.substring(i, i+1).getBytes().length;
					
				}
				len += s2.length();
				
				
				
				System.out.println((idx+1) + "번째 문자부터 일치합니다.");
				System.out.println("텍스트: " + s1);
				System.out.printf(String.format("패턴 : %%%ds\n", len), s2);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
