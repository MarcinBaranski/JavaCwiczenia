package tydzien1_zadania2x;

public class OgloszenieMieszkaniowe extends Ogloszenie {

	private String miejscowosc;
	private int metraz;
	private int liczbaPokoi;
	private int nrPietra;
	private int rokBudowy;
	
	public static final String OGL_MIESZKANIOWE = "Ogloszenie Mieszkaniowe";

	public OgloszenieMieszkaniowe() {
		super();
	}


	public OgloszenieMieszkaniowe(String opis, String tytul, double cena, int nrTel) {
		super(opis, tytul, cena, nrTel);
	}

	public OgloszenieMieszkaniowe(String miejscowosc, int metraz, int liczbaPokoi, int nrPietra, int rokBudowy,double cena, int nrTel) {
		super(cena,nrTel);
		this.miejscowosc = miejscowosc;
		this.metraz = metraz;
		this.liczbaPokoi = liczbaPokoi;
		this.nrPietra = nrPietra;
		this.rokBudowy = rokBudowy;
	}

	public String getMiejscowosc() {
		return miejscowosc;
	}

	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}

	public int getMetraz() {
		return metraz;
	}

	public void setMetraz(int metraz) {
		this.metraz = metraz;
	}

	public int getLiczbaPokoi() {
		return liczbaPokoi;
	}

	public void setLiczbaPokoi(int liczbaPokoi) {
		this.liczbaPokoi = liczbaPokoi;
	}

	public int getNrPietra() {
		return nrPietra;
	}

	public void setNrPietra(int nrPietra) {
		this.nrPietra = nrPietra;
	}

	public int getRokBudowy() {
		return rokBudowy;
	}

	public void setRokBudowy(int rokBudowy) {
		this.rokBudowy = rokBudowy;
	}

	@Override
	public String toString() {
		if (miejscowosc != null) {
			return typOgloszenia()+" Miejscowość: " + miejscowosc + ". Ilośc metrów: " + metraz
					+ "m kwadratowych. Liczba pokoi: " + liczbaPokoi + ". Numer piętra:" + nrPietra + ". Rok budowy: "
					+ rokBudowy +". Cena: " + getCena() +" zł. Nr Tel: "+ getNrTel() + ".";
		} else {
			return super.toString();
		}
	}

	@Override
	public String typOgloszenia() {
		return OGL_MIESZKANIOWE;

	}

}
