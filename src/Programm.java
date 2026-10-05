import java.util.ArrayList;

public class Programm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Kunde> kunden = DBService.liesKundenAusDB();
		
		for (int i = 0; i < kunden.size(); i++) {
			Kunde kunde = kunden.get(i);

			System.out.println(kunde);
		}
	}

}
