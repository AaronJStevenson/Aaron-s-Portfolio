
public class RomanNum {
	
	// private field
	private String romNum;
	private int userInput;
	
	// constructor
	public RomanNum() {
		
	}

	// getters and setters
	public String getRomNum() {
		return romNum;
	}

	public void setRomNum(int num) {
		// switch 
		switch(num){
		case 1:
			romNum = "I";
			break;
		case 2:
			romNum = "II";
			break;
		case 3:
			romNum = "III";
			break;
		case 4:
			romNum = "IV";
			break;
		case 5:
			romNum = "V";
			break;
		case 6:
			romNum = "VI";
			break;
		case 7:
			romNum = "VII";
			break;
		case 8:
			romNum = "VIII";
			break;
		case 9:
			romNum = "IX";
			break;
		case 10:
			romNum = "X";
			break;
		default:
			romNum = "You did not enter a valid number!";
			
	}
	}

	public int getUserInput() {
		return userInput;
	}

	public void setUserInput(int UserInput) {
		this.userInput = UserInput;
	}

}
