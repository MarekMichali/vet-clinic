package pl.kurs.restauracja;

import java.util.ArrayList;
import java.util.List;

public class Zupa {
	List<Skladnik> skladniki = new ArrayList<Skladnik>();
	
	String nazwa;

	public Zupa(String nazwa) {
		this.nazwa = nazwa;
	}


	public void przygotujRosol() {
		System.out.println("Przygotowanie zupy ze sk�adnik�w: "+skladniki);
		System.out.println("Nalewam wod� do garnka");
		System.out.println("Wrzucam kostk� roso�ow�");
		nazwa = "ros�";
		for(Skladnik skladnik:skladniki) {
			if(skladnik instanceof Marchewka) {
				Marchewka marchewka = (Marchewka)skladnik;
				marchewka.obierz();
				marchewka.pokroj();
			}
			if(skladnik instanceof Makaron) {
				Makaron makaron = (Makaron)skladnik;
				makaron.gotuj();
			}
			if(skladnik instanceof Ryz) {
				Ryz ryz = (Ryz)skladnik;
				ryz.gotuj();
			}
			
		}
			
	}

	public void przygotujZupePomidorowa() {
		System.out.println("Przygotowanie zupy ze sk�adnik�w: " + skladniki);
		System.out.println("Nalewam wod� do garnka");
		System.out.println("Wrzucam koncentrat pomidorowy");
		nazwa = "ros�";
		for (Skladnik skladnik : skladniki) {
			if (skladnik instanceof Marchewka) {
				Marchewka marchewka = (Marchewka) skladnik;
				marchewka.obierz();
				marchewka.pokroj();
			}
			if (skladnik instanceof Makaron) {
				Makaron makaron = (Makaron) skladnik;
				makaron.gotuj();
			}
			if (skladnik instanceof Ryz) {
				Ryz ryz = (Ryz) skladnik;
				ryz.gotuj();
			}

		}
	}


		public void podaj() {
		System.out.println("Podanie obiadu");
		System.out.println("Podaj� "+nazwa+ " do sto�u");
	}

	public void wyslijNaWynos(String adres){
		System.out.println("Wysylam zupe na adres: " + adres);

	}
	
}
