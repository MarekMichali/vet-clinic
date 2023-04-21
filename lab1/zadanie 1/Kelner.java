package pl.kurs.restauracja;

public class Kelner implements IKelner, IDostawca {
    public void podaj(Zupa zupa){
        System.out.println("Podajno "+zupa.nazwa+ " do stolu");
    }
}
