package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Q1759 {
	static boolean[] check;
	static String[] arr;
	static int l,c;
	static List<String> list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		l = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		arr = new String[c];
		check = new boolean[c];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<c; i++) {
			arr[i] = st.nextToken();
		}
		
		Arrays.sort(arr);
		
		
		dfs(0,0);
	}
	
	static void dfs(int start, int length) {
		
		if(length == l) {
			int a = 0;
			int b = 0;
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<c; i++) {
				
				if(check[i]) {
					sb.append(arr[i]);
					
					if(arr[i].equals("a")  ||arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")) {
						
						a++;
					}else {
						
						b++;
					}
				}
			}
			
			if(a>=1 && b>=2) {
				
				System.out.println(sb);
			}
		}
		
		for(int i=start; i<c; i++) {
			check[i] = true;
			dfs(i+1, length+1);
			check[i] = false;
		}
	}
}
