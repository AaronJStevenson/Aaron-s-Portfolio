
public class TeamLeader extends ProductioinWorker {

	private double monthlyBonus; // this is a bonus the team leader receives monthly
	private int requiredTrain; // this is the amount of training hours required
	private int trainHours; // these are the hours they trained
	
	public TeamLeader(int eshift, String hireDate, String name, int empNum, double erate, 
			int trainHours, int requiredTrain, double monthlyBonus) {
		super(eshift, hireDate, name, empNum, erate);// passing the values through the constructor
		this.monthlyBonus = monthlyBonus;
		this.requiredTrain = requiredTrain;
		this.trainHours = trainHours;
		
		
	}

	public double getMonthlyBonus() {
		monthlyBonus = 1500;
		return monthlyBonus;
	}

	public void setMonthlyBonus(double monthlyBonus) {
		this.monthlyBonus = monthlyBonus;
	}

	public int getRequiredTrain() {
		requiredTrain = 10;
		return requiredTrain;
	}

	public void setRequiredTrain(int requiredTrain) {
		this.requiredTrain = requiredTrain;
	}

	public int getTrainHours() {
		return trainHours;
	}

	public void setTrainHours(int trainHours) {
		this.trainHours = trainHours;
	}

}
