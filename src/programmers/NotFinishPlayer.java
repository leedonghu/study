package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NotFinishPlayer {
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(solution2(participant, completion));
		
	}
	
	public static String solution(String[] participant, String[] completion) {
		
		
		List<String> part = new ArrayList<>();
		List<String> comp = new ArrayList<>();
		for(String pname : participant) {
			part.add(pname);
		}
		for(String cname : completion) {
			comp.add(cname);
		}
		for(int i=0; i<comp.size(); i++) {
			part.remove(comp.get(i));
		}
		return part.get(0);
	}
	
	public static String solution2(String[] participant, String[] completion) {
		StringBuilder sb = new StringBuilder();
		String[] comp = Arrays.copyOf(completion, participant.length);
		
		comp[participant.length-1] = "";
		Arrays.sort(participant, Collections.reverseOrder()); //내림차순정렬
		Arrays.sort(comp, Collections.reverseOrder());
		
		
		
		for(int i=0; i<participant.length; i++) {
			if(!participant[i].equals(comp[i])) { //정렬된 배열에서 서로다른 값이 나올떄의 participant 값
				sb.append(participant[i]);
				break;
			}
		}
		
		
		
		return sb.toString();
	}
	
	
}
