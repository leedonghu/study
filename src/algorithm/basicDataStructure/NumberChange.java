package algorithm.basicDataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberChange {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//10진수 정수를 n진수 정수로 변환하려면 정수를 n으로 나눈 나머지를 구하는 동시에
		//그 몫에 대해 나눗셈을 반복해야함
		//몫이 0이 될때까지 반복하고 구한 나머지를 거꾸로 늘어놓은 숫자가 변환한 숫자
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int no; // 변환하는 정수
		int cd; // 기수
		int dno; //변환 후의 자릿수
		int retry; //다시한번?
		char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자의 배열
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수:");
				no = Integer.parseInt(br.readLine());
			}while(no<0); //음수를 넣으면 계속 반복하게
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) :");
				cd = Integer.parseInt(br.readLine());
			}while(cd<2 || cd > 36); //2진수부터 36진수가 아닌것을 넣었을때 계속 반복
			
			dno = cardConvR(no, cd, cno);
			
			System.out.print(cd + "진수로는 ");
			for(int i=dno-1; i>=0; i--) { //윗자리부터 차례로 나타냄
				
				System.out.println(cno[i]);
			}
			System.out.print("입니다.");
			System.out.print("한번 더 할까요?(1.예/2.아니요) :");
			retry = Integer.parseInt(br.readLine());
		}while(retry == 1);
	}
	
	static int cardConvR(int x,int r, char[] d) { //정숫값 x, r진수
		int digits = 0; // 변환된 수의 자릿수 체크
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //X를 r으로 나누었을때 나머지가 가질 문자, 36진수까지 표현가능
		
		do {
			d[digits++] = dchar.charAt(x%r);//r로나눈 나머지를 배열에 저장
			x /= r; //x를 r로 나눈 몫
		}while(x != 0 ); //x가 0이 될때까지
		
		return digits;
	}
}
