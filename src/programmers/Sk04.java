package programmers;

public class Sk04 {
	public static void main(String[] args) {
		String[] grid = {"..FF", "###F", "###."};
		int k = 4;
		solution(grid, k);
		//1
		
		//
//		["..FF", "###F", "###."], 5
//		
//		0
//		
//
//[".F.FFFFF.F", ".########.", ".########F", "...######F", "##.######F", "...######F", ".########F", ".########.", ".#...####F", "...#......"], 6
//
//3
	}
	
	static int solution(String[] grid, int k) {
		String[][] grids = new String[grid.length][grid.length];
		
		for(int i=0; i<grid.length; i++) {
			grids[i] = grid[i].split("");
		}
		int x = 0;
		int y = 0;
		int t = 0;
		while(!(x==grid.length && y==grid.length)) {
			
			if(y<grid.length) {
				
				if(grids[x][y+1].equals(".") || grids[x][y+1].equals("F")) {
					y++;
				}else if(grids[x][y+1].equals("#")) {
					x++;
				}
				
			}
			t++;
		}
		System.out.println(t);
		
		return 0;
	}
}
