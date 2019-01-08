package tydzien1_zadania2x;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ogloszenie {

//	private String typOgl;
	private String tytul;
	private String opis;
	private double cena;
	private int nrTel;

	public static final String OGL_STANDARD = "Ogloszenie Standardowe";
	
	public Ogloszenie() {
		super();
	}
	
	

	public Ogloszenie(double cena, int nrTel) {
		super();
		this.cena = cena;
		this.nrTel = nrTel;
	}

	public Ogloszenie(/*String typOgl,*/ String opis, String tytul, double cena, int nrTel) {
		super();
//		this.typOgl = typOgl;
		this.tytul = tytul;
		this.opis = opis;
		this.cena = cena;
		this.nrTel = nrTel;
	}

//	public String getTypOgl() {
//		return typOgl;
//	}
//
//	public void setTypOgl(String typOgl) {
//		this.typOgl = typOgl;
//	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public int getNrTel() {
		return nrTel;
	}

	public void setNrTel(int nrTel) {
		this.nrTel = nrTel;
	}

	@Override
	public String toString() {
		return typOgloszenia()+" "+ tytul + " " + opis + ". Cena: " + cena + " zł. Numer telefonu: " + nrTel + ".";
	}

	public String typOgloszenia() {
		return OGL_STANDARD;
	}
	
	
}
