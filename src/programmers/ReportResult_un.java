package programmers;

public class ReportResult_un {
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		solution(id_list, report, k);
	}
	
	static int[] solution(String[] id_list, String[] report, int k) {
		
		String[] sortReport = new String[report.length];
		
		int a = 0;
		for(int i=0; i<report.length; i++) {
			for(int j=0; j<=a; j++  ) {
				if(sortReport[j] != (report[i])) {
					sortReport[a] = report[i];
					a++;
				}
			}
		}
		
		for(String s : sortReport) {
			System.out.println(s);
		}
		
		return null;
	}
}
