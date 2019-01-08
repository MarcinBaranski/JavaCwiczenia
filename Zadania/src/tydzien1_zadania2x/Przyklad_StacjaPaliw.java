package tydzien1_zadania2x;

public class Przyklad_StacjaPaliw {

	public static void main(String[] args) {
		StacjaPaliw orlen = new StacjaPaliw(5.00, 5.50, 5.20);
		orlen.dostawa("PB95", 100);
		orlen.dostawa("PB98", 100);
		orlen.dostawa("ON", 100);
		
		orlen.tankuj("ON", 30);
		
		orlen.ustawCene("ON", 4.50);
		
		orlen.tankuj("ON", 30);
		

	}

}
