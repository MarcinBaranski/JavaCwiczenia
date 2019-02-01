package tydzien2_zadania4x;

public class LogikaKonwertera {

	public static double przeliczJednostke(double iloscJednostkaWejsciowa, String jednostkaWejsciowa) {

		switch (jednostkaWejsciowa) {
		case "cm": return iloscJednostkaWejsciowa * 0.39;
		case "m":  return iloscJednostkaWejsciowa * 3.28;
		case "km": return iloscJednostkaWejsciowa * 0.62;
		case "kg": return iloscJednostkaWejsciowa * 2.2;
		case "stCelcjusza": return iloscJednostkaWejsciowa * 33.8;
		case "cale": return iloscJednostkaWejsciowa / 0.39;
		case "stopy":return iloscJednostkaWejsciowa / 3.28;
		case "mile": return iloscJednostkaWejsciowa / 0.62;
		case "funty":return iloscJednostkaWejsciowa / 2.2;
		case "stFarenhaita":return iloscJednostkaWejsciowa / 33.8;
		default: return 0.0;
		}


	}

}
