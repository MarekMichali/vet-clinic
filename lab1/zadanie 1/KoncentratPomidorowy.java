package pl.kurs.restauracja;

public class KoncentratPomidorowy extends Skladnik {
    @Override
    public String toString() {
        return "koncentrat pomidorowy";
    }

    public void wrzuc() {
        System.out.println("Nalewam wode do garnka");
        System.out.println("Wrzucam koncentrat pomidorowy");
    }

    @Override
    public void przygotuj() {

        this.wrzuc();
    }


}
