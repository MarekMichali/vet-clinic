package pl.kurs.restauracja;

public class Kucharz implements IKucharz{
    public void ugotuj(Zupa zupa) {
        System.out.println("Przygotowanie zupy ze skladnikow: "+ zupa.skladniki);
        //zupa.nazwa = "ros�";
        for(Skladnik skladnik:zupa.skladniki) {
            skladnik.przygotuj();
        }
    }
}

