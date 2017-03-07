
public class CDcollection {
	// aggrogate= instance of a field value in another class
	// this is an aggrogate
	private CD cd;
	public CDcollection() {
		// TODO Auto-generated constructor stub
	}

	public CDcollection(CD cd){
		this.setCd(new CD(cd));
	}
	// return cd

	public CD getCd(){
		return new CD(cd);
	}

	public void setCd(CD cd) {
		this.cd = new CD(cd);
	}
	
	public String toString(){
		String str;
		str = "Title: " + cd.getTitle() + "\n" +
		"Artist : " + cd.getArtist() + "\n" +
		"Price: " + cd.getPrice();
		
		return str;
	}
}

