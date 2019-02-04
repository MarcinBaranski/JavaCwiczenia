package tydzien2_zadania4x;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LogikaKonwertera {

	public static BigDecimal przeliczJednostke(BigDecimal iloscJednostkaWejsciowa, String jednostkaWejsciowa) {

		switch (jednostkaWejsciowa) {
		case "cm": return iloscJednostkaWejsciowa.multiply(BigDecimal.valueOf(0.39)).setScale(3,RoundingMode.HALF_UP);
		case "m":  return iloscJednostkaWejsciowa.multiply(BigDecimal.valueOf(3.28)).setScale(3,RoundingMode.HALF_UP);
		case "km": return iloscJednostkaWejsciowa.multiply(BigDecimal.valueOf(0.62)).setScale(3,RoundingMode.HALF_UP);
		case "kg": return iloscJednostkaWejsciowa.multiply(BigDecimal.valueOf(2.2)).setScale(3,RoundingMode.HALF_UP);
		case "stCelcjusza": return iloscJednostkaWejsciowa.multiply(BigDecimal.valueOf(33.8)).setScale(3,RoundingMode.HALF_UP);
		case "cale": return iloscJednostkaWejsciowa.divide(BigDecimal.valueOf(0.39),3,RoundingMode.HALF_UP);
		case "stopy":return iloscJednostkaWejsciowa.divide(BigDecimal.valueOf(3.28),3,RoundingMode.HALF_UP);
		case "mile": return iloscJednostkaWejsciowa.divide(BigDecimal.valueOf(0.62),3,RoundingMode.HALF_UP);
		case "funty":return iloscJednostkaWejsciowa.divide(BigDecimal.valueOf(2.2),3,RoundingMode.HALF_UP);
		case "stFarenhaita":return iloscJednostkaWejsciowa.divide(BigDecimal.valueOf(33.8),3,RoundingMode.HALF_UP);
		default: return BigDecimal.valueOf(0.0);
		}


	}

}
