package pl.kurs.restauracja;

public class Test {
public static void main(String[] args) {
	//System.out.println("Nalewam wod� do garnka");
	przygotujZupePomidorowaZRyzemNaWynos();
	System.out.println("");
	przygotujZupePomidorowaZMakaronem();

}

	public static void przygotujZupePomidorowaZRyzemNaWynos(){
		Zupa zupa = new Zupa("pomidorowa");
		KoncentratPomidorowy koncentratPomidorowy = new KoncentratPomidorowy();
		zupa.skladniki.add(koncentratPomidorowy);
		Marchewka marchewka = new Marchewka();
		zupa.skladniki.add(marchewka);
		Ryz ryz = new Ryz();
		zupa.skladniki.add(ryz);
		Kucharz kucharz = new Kucharz();
		kucharz.ugotuj(zupa);
		Kurier kurier = new Kurier();
		kurier.setAdres("aei");
		kurier.podaj(zupa);
		//zupa.wyslijNaWynos("aei");
	}

	public static void przygotujZupePomidorowaZMakaronem(){
		Zupa zupa = new Zupa("pomidorowa");
		KoncentratPomidorowy koncentratPomidorowy = new KoncentratPomidorowy();
		zupa.skladniki.add(koncentratPomidorowy);
		Marchewka marchewka = new Marchewka();
		zupa.skladniki.add(marchewka);
		Ryz ryz = new Ryz();
		zupa.skladniki.add(ryz);
		Kucharz kucharz = new Kucharz();
		kucharz.ugotuj(zupa);
		Kelner kelner = new Kelner();
		kelner.podaj(zupa);
	}
/*
public static void przygotujZupePomidorowaZRyzemNaWynos(){
	Zupa zupa = new Zupa();
	Marchewka marchewka = new Marchewka();
	zupa.skladniki.add(marchewka);
	Ryz ryz = new Ryz();
	zupa.skladniki.add(ryz);
	zupa.przygotujZupePomidorowa();
	zupa.wyslijNaWynos("aei");
}

public static void przygotujZupePomidorowaZMakaronem(){
	Zupa zupa = new Zupa();
	Marchewka marchewka = new Marchewka();
	zupa.skladniki.add(marchewka);
	Makaron makaron = new Makaron();
	zupa.skladniki.add(makaron);
	zupa.przygotujZupePomidorowa();
	zupa.podaj();
}
public static void przygotujZupeMakaron() {
	Zupa zupa = new Zupa();
	Marchewka marchewka = new Marchewka();
	zupa.skladniki.add(marchewka);
	Makaron makaron = new Makaron();
	zupa.skladniki.add(makaron);
	zupa.przygotujRosol();
	zupa.podaj();
}

	public static void przygotujZupeRyz() {
		Zupa zupa = new Zupa();
		Marchewka marchewka = new Marchewka();
		zupa.skladniki.add(marchewka);
		Ryz ryz = new Ryz();
		zupa.skladniki.add(ryz);
		zupa.przygotujRosol();
		zupa.podaj();
	}

	public static void przygotujZupeRosolWynos() {
		Zupa zupa = new Zupa();
		Marchewka marchewka = new Marchewka();
		zupa.skladniki.add(marchewka);
		Makaron makaron = new Makaron();
		zupa.skladniki.add(makaron);
		zupa.przygotujRosol();
		zupa.wyslijNaWynos("aei");
	}

	public static void przygotujZupeRyzWynos() {
		Zupa zupa = new Zupa();
		Marchewka marchewka = new Marchewka();
		zupa.skladniki.add(marchewka);
		Ryz ryz = new Ryz();
		zupa.skladniki.add(ryz);
		zupa.przygotujRosol();
		zupa.wyslijNaWynos("aei");
	}*/
}



