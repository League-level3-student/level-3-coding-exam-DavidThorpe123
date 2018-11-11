import java.util.ArrayList;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		// TODO Auto-generated method stub
		int votes1 = 0;
		int votes2 = 0;
		for (int i = 0; i < votes.size(); i++) {
			if (votes.get(i).charAt(0) == 'p' || votes.get(i).charAt(0) == 'P') {
				votes1++;
			}
			if (votes.get(i).charAt(0) == 'e' || votes.get(i).charAt(0) == 'E') {
				votes2++;
			}
		}
		if (votes1 > votes2) {
			String winner = "pope francis";
			return winner;
		}
		if (votes1 == votes2) {
			String winner = "TIE";
			return winner;
		}
		return null;
	}

}
