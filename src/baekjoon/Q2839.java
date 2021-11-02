package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2839 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int kg = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int x = 0;
		
		while(kg>0) {
			if(kg % 5 == 0) { //5의 배수가 나오면 몫을 더해주고 멈춤
				x += kg/5;
				break;
			}
			kg -= 3; //3을 빼줌
			x++;
		}
		
		if(kg < 0) { //kg가 0보다 작아지면 3과 5로 만들수 없는 수
			sb.append(-1);
		}else {
			sb.append(x);
		}
		System.out.println(sb.toString());
	}
}
