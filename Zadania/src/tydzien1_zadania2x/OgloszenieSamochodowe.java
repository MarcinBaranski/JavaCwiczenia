package tydzien1_zadania2x;

public class OgloszenieSamochodowe extends Ogloszenie {

	private String marka;
	private String model;
	private int rokProd;
	private int pojemnosc;
	private int przebieg;
	private int moc;
	private String rodzajPaliwa;
	
	public static final String OGL_SAMOCHODOWE = "Ogloszenie Samochodowe";

	public OgloszenieSamochodowe() {
		super();
	}

	public OgloszenieSamochodowe( String opis, String tytul, double cena, int nrTel) {
		super(opis, tytul, cena, nrTel);
	}

	public OgloszenieSamochodowe(String marka, String model, int rokProd, int pojemnosc, int przebieg, int moc,
			String rodzajPaliwa,double cena, int nrTel) {
		super(cena,nrTel);
		this.marka = marka;
		this.model = model;
		this.rokProd = rokProd;
		this.pojemnosc = pojemnosc;
		this.przebieg = przebieg;
		this.moc = moc;
		this.rodzajPaliwa = rodzajPaliwa;
		 
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRokProd() {
		return rokProd;
	}

	public void setRokProd(int rokProd) {
		this.rokProd = rokProd;
	}

	public int getPojemnosc() {
		return pojemnosc;
	}

	public void setPojemnosc(int pojemnosc) {
		this.pojemnosc = pojemnosc;
	}

	public int getPrzebieg() {
		return przebieg;
	}

	public void setPrzebieg(int przebieg) {
		this.przebieg = przebieg;
	}

	public int getMoc() {
		return moc;
	}

	public void setMoc(int moc) {
		this.moc = moc;
	}

	public String getRodzajPaliwa() {
		return rodzajPaliwa;
	}

	public void setRodzajPaliwa(String rodzajPaliwa) {
		this.rodzajPaliwa = rodzajPaliwa;
	}

	@Override
	public String toString() {
		if (marka != null) {
			return typOgloszenia()+" Marka " + marka + ". Model " + model + ". Rok produkcji: " + rokProd + ". Pojemnosc: "
					+ pojemnosc + " cm sześciennych. Przebieg: " + przebieg + " km. Moc: " + moc + "KM. RodzajPaliwa: "
					+ rodzajPaliwa+". Cena: " + getCena() + " zł. Nr Tel: " + getNrTel()+".";
		} else {
			return super.toString();
		}
	}

	@Override
	public String typOgloszenia() {
		return OGL_SAMOCHODOWE;
	}

}
