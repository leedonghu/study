package javaStudy.Object.NotifyAndWait;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThreadTest03 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("수 2개를 입력해 주세요 : ");
		StringTokenizer st;
		int a;
		int b;
		try {
			st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			CalcThread01 th1 = new CalcThread01("th1", a, b);
			int a1 = th1.getA();
			int b1 = th1.getB();
			CalcThread02 th2 = new CalcThread02("th2", a1, b1);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main 쓰레드 종료");
	}
}
