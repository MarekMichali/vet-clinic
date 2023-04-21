package pl.kurs.restauracja;

public class Kurier implements IKurier, IDostawca{
    String adres;

    public void setAdres(String adres) {
        this.adres = adres;
    }
    public void podaj(Zupa zupa){
        System.out.println("Wyslano "+zupa.nazwa+ " do "+adres);
    }

}
