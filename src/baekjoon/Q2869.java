package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		//최대 하루 도달거리
		int day = (v - b) / (a - b); //최대 높이에서 내려가는 만큼을 빼준것을 올라가는 높이(a-b)로 나눠주면 일수가 나옴
		if((v - b) % (a - b) != 0) { //나머지가 있다면 잔여길이가 있다는 뜻, 하루를 더 소요해야함
			day++;
		}
		
		System.out.println(day);
	}
}
