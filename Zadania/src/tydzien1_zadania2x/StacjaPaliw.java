package tydzien1_zadania2x;

public class StacjaPaliw {

//	private static Paliwo PB95 = new Paliwo("PB95", 5.00);
//	private static Paliwo PB98 = new Paliwo("PB98", 5.00);
//	private static Paliwo ON = new Paliwo("ON", 5.00);

	private double cenaPB95;
	private double cenaPB98;
	private double cenaON;

	private double iloscPB95;
	private double iloscPB98;
	private double iloscON;

	public StacjaPaliw() {
		super();
	}

	public StacjaPaliw(double cenaPB95, double cenaPB98, double cenaON) {
		super();
		this.cenaPB95 = cenaPB95;
		this.cenaPB98 = cenaPB98;
		this.cenaON = cenaON;
	}

	public StacjaPaliw(double cenaPB95, double cenaPB99, double cenaON, double iloscPB95, double iloscPB98,
			double iloscON) {
		super();
		this.cenaPB95 = cenaPB95;
		this.cenaPB98 = cenaPB99;
		this.cenaON = cenaON;
		this.iloscPB95 = 0.0;
		this.iloscPB98 = 0.0;
		this.iloscON = 0.0;
	}

	public double getCenaPB95() {
		return cenaPB95;
	}

	public void setCenaPB95(double cenaPB95) {
		this.cenaPB95 = cenaPB95;
	}

	public double getCenaPB99() {
		return cenaPB98;
	}

	public void setCenaPB99(double cenaPB99) {
		this.cenaPB98 = cenaPB99;
	}

	public double getCenaON() {
		return cenaON;
	}

	public void setCenaON(double cenaON) {
		this.cenaON = cenaON;
	}

	public double getIloscPB95() {
		return iloscPB95;
	}

	public void setIloscPB95(double iloscPB95) {
		this.iloscPB95 = iloscPB95;
	}

	public double getIloscPB98() {
		return iloscPB98;
	}

	public void setIloscPB98(double iloscPB98) {
		this.iloscPB98 = iloscPB98;
	}

	public double getIloscON() {
		return iloscON;
	}

	public void setIloscON(double iloscON) {
		this.iloscON = iloscON;
	}

	@Override
	public String toString() {
		return "StacjaPaliw [cenaPB95=" + cenaPB95 + ", cenaPB99=" + cenaPB98 + ", cenaON=" + cenaON + ", iloscPB95="
				+ iloscPB95 + ", iloscPB98=" + iloscPB98 + ", iloscON=" + iloscON + "]";
	}

	public void dostawa(String typPaliwa, int iloscDostarczona) {

		if (iloscDostarczona <= 0) {
//			System.out.println("Błędna ilość dostarczonego paliwa");
			throw new IllegalArgumentException("Błędna ilość dostarczonego paliwa");
		}

		if (typPaliwa.equals("PB95")) {
			iloscPB95 += iloscDostarczona;
//			System.out.println("Dostarczono " + iloscDostarczona + " " + typPaliwa);
		} else if (typPaliwa.equals("PB98")) {
			iloscPB98 += iloscDostarczona;
//			System.out.println("Dostarczono " + iloscDostarczona + " " + typPaliwa);
		} else if (typPaliwa.equals("ON")) {
			iloscON += iloscDostarczona;
//			System.out.println("Dostarczono " + iloscDostarczona + " " + typPaliwa);
		} else {
//			System.out.println("Błędna nazwa typu paliwa. Dostawa paliwa nie udana.");
			throw new IllegalArgumentException("Błędna nazwa typu paliwa. Dostawa paliwa nie udana.");
		}

		System.out.println("Dostarczono " + iloscDostarczona + " litrów " + typPaliwa);
	}

	public void ustawCene(String typPaliwa, double nowaCena) {

		if (nowaCena <= 0) {
//			System.out.println("Podano błędną nową cenę paliwa.");
			throw new IllegalArgumentException("Podano błędną nową cenę paliwa.");
		}

		if (typPaliwa.equals("PB95")) {
			setCenaPB95(nowaCena);
		} else if (typPaliwa.equals("PB98")) {
			setCenaPB99(nowaCena);
		} else if (typPaliwa.equals("ON")) {
			setCenaON(nowaCena);
		} else {
//			System.out.println("Błędna nazwa typu paliwa. Cena nie zmieniona.");
			throw new IllegalArgumentException("Podano błędną nazwę typu paliwa.");
		}

		System.out.println("Nowa cena paliwa " + typPaliwa + " zmieniona na: " + nowaCena + " zł.");
	}

	public double tankuj(String typPaliwa, double iloscPaliwa) {
		if (iloscPaliwa <= 0) {
//			System.out.println("Próba zatankowania błędnej ilości paliwa.");
			throw new IllegalArgumentException("Podano błędną ilość paliwa do zatankowania.");
		}

		if (typPaliwa.equals("PB95")) {
			if (iloscPB95 < iloscPaliwa) {
				System.out.println("Stacja ma za mało paliwa.");
		
			} else {
				iloscPB95 = iloscPB95 - iloscPaliwa;
				System.out.println("Zatankowano " + iloscPaliwa + " litrów paliwa typu " + typPaliwa + ". Do zaplaty: "+ (iloscPaliwa * cenaON) + " zł.");
				return iloscPaliwa * cenaPB95;
			}
		} else if (typPaliwa.equals("PB98")) {
			if (iloscPB98 < iloscPaliwa) {
				System.out.println("Stacja ma za mało paliwa.");
			} else {
				iloscPB98 = iloscPB98 - iloscPaliwa;
				System.out.println("Zatankowano " + iloscPaliwa + " litrów paliwa typu " + typPaliwa + ". Do zaplaty: "+ (iloscPaliwa * cenaON) + " zł.");
				return iloscPaliwa * cenaPB98;
			}
		} else if (typPaliwa.equals("ON")) {
			if (iloscON < iloscPaliwa) {
				System.out.println("Stacja ma za mało paliwa.");
				
			} else {
				iloscON = iloscON - iloscPaliwa;
				System.out.println("Zatankowano " + iloscPaliwa + " litrów paliwa typu " + typPaliwa+ ". Do zaplaty: "+ (iloscPaliwa * cenaON) + " zł." );
				return iloscPaliwa * cenaON;
			}
		} else {
//			System.out.println("Błędna nazwa typu paliwa. Cena nie zmieniona.");
			throw new IllegalArgumentException("Podano błędną nazwę typu paliwa.");
		}
		
		
		return 0.0;
	}

}
