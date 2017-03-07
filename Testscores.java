public class Testscores {
	// fields
	private double score1;
	private double score2;
	private double score3;
	
	public Testscores() {	
	}
// getters and setters...properties of the fields
	public double getScore1() {
		return score1;
	}

	public void setScore1(double Score1) {
		this.score1 = Score1;
	}

	public double getScore2() {
		return score2;
	}

	public void setScore2(double Score2) {
		this.score2 = Score2;
	}

	public double getScore3() {
		return score3;
	}

	public void setScore3(double Score3) {
		this.score3 = Score3;
	}
	
	public double averageScore(){
		return (score1 + score2 + score3) / 3;
	}

}
