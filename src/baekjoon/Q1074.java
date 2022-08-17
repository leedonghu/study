package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1074 {
	static int n, r, c, answer = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		int size =(int) Math.pow(2, n);
		solution(0,0,size);
		
		
		
	}
	
	static void solution(int x, int y, int size) {
		
		if(size == 1) {
			System.out.println(answer);
			return;
		}
		
		
		//1,2,3,4 사분면중에 어디 있는지 확인
		//size가 4이고 1,1의 값을 찾는다고 하면
		//1,1이 몇 사분면에 있는지 찾아야함
		
		
		int newSize = size/2;
		
		//1사분면
		if(r < x+newSize && c <y+newSize) {
			solution(x,y,newSize);
		}
		//2사분면
		if(r< x+newSize && c >= y+newSize) {
			answer += (size*size) / 4;
			solution(x, y+newSize, newSize);
		}
		//3사분면
		if(r>= x+newSize && c<y+newSize) {
			answer += (size*size)/4 *2;
			solution(x+newSize, y, newSize);
		}
		//4사분면
		if(r>= x+newSize && c>= y+newSize) {
			answer +=(size*size)/4*3;
			solution(x+newSize, y+newSize, newSize);
		}
	}
}
