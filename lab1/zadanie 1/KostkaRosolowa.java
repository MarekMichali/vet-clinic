package pl.kurs.restauracja;

public class KostkaRosolowa extends Skladnik {
    @Override
    public String toString() {

        return "kostka rosolowa";
    }

    public void wrzuc() {
        System.out.println("Nalewam wode do garnka");
        System.out.println("Wrzucam kostke rosolowa");
    }

    @Override
    public void przygotuj() {

        this.wrzuc();
    }

}
