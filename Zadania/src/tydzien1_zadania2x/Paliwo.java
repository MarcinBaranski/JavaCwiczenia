package tydzien1_zadania2x;

public class Paliwo {
	private String typPaliwa;
	private double cenaZaLitr;
	
	
	
	public Paliwo() {
		super();
	}

	


	public Paliwo(String typPaliwa, double cenaZaLitr) {
		super();
		this.typPaliwa = typPaliwa;
		this.cenaZaLitr = cenaZaLitr;
	}



	public String getTypPaliwa() {
		return typPaliwa;
	}



	public void setTypPaliwa(String typPaliwa) {
		this.typPaliwa = typPaliwa;
	}



	public double getCenaZaLitr() {
		return cenaZaLitr;
	}



	public void setCenaZaLitr(double cenaZaLitr) {
		this.cenaZaLitr = cenaZaLitr;
	}
	
	
	
	
	
}
