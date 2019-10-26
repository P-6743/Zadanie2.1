//deklaracja klasy: nazwa klasy jest taka sama jak nazwa pliku
public class Skrzydlo {
    //pole prywatne dlugosc typu int
    private int dlugosc;
    //pole prywatne wysokosc typu int
    private int wysokosc;
    //pole prywatne klamka typu String
    private Klamka klamka;
    //pole prywatne typu boolean o nazwie otwatrte i przechowujace wartosc false
    private boolean otwarte = false;

    //konstruktor publiczny Skrzydlo o wartosciach dlugosc i wysokosc typu int
    public Skrzydlo(int dlugosc, int wysokosc) {
        //przypisanie polu dlugosc wartosci dlugosc z metody
        this.dlugosc = dlugosc;
        //przypisanie polu wysokosc wartosci wysokosc z metody
        this.wysokosc = wysokosc;
    }
    //konstruktor publiczney Skrzydlo o wartosciach dlugosc i wysokosc typu int i klamka typu String
    public Skrzydlo(int dlugosc, int wysokosc, Klamka klamka) {

        this(dlugosc,wysokosc);
        //przypisanie polu klamka wartosci klamka z metody
        this.klamka = klamka;
    }
    //publiczna metoda dostepowa typu int
    public int getDlugosc() {
        //zwracajaca wartosc dlugosc
        return dlugosc;
    }
    //metoda publiczna nie zwracajaca niczego ustalajaca dlugosc typu int dla Dlugosc
    public void setDlugosc(int dlugosc) {
        //przypisnie polu dlugosc wartosci dlugosc z metody
        this.dlugosc = dlugosc;
    }
    //publiczna metoda dostepowa typu int
    public int getWysokosc() {
        // zwracajaca wartosc wysokosc
        return wysokosc;
    }
    //metoda publiczna nie zwracajaca niczego ustalajaca wyokosc typu int dla Wysokosc
    public void setWysokosc(int wysokosc) {
        //przypisanie polu wysokosc wartosci wysokosc z metody
        this.wysokosc = wysokosc;
    }
    //publiczna metoda dostepowa typu String
    public Klamka getKlamka() {
        //zwracajaca wartosc klamka
        return klamka;
    }
    //metoda publiczna nie zwracajaca niczego ustalajaca klamke typu Klamka dla klamki
    public void setKlamka(Klamka klamka) {
        //przypisanie polu klamka wartosci klamka z metody
        this.klamka = klamka;
    }
    //publiczna metoda pytajaca is(czy) Otwarte typu boolean
    public boolean isOtwarte() {
        //zwracajaca wartosc otwarte
        return otwarte;
    }
    //publiczna metoda nie zwracajaca niczego ustalajaca wartosc typu boolean dla Otwarte
    public void setOtwarte(boolean otwarte) {
        //przypisanie polu otwarte wartosci otwarte
        this.otwarte = otwarte;
    }
    //publiczna metoda stan typu String
    public String stan() {
        //ustalenie wymiarow na podstawie ilorazu dlugosci i wysokosci
        String wymiary = dlugosc+"x"+wysokosc;
        //ustalenie wartosci otwarcie poprzez instrukcje warunkowa if otwarte i zwrot otwarte/zamkniete
        String otwarcie = otwarte ? "otwarte" : "zamkniete";
        //ustalenie wartosci stanKlamki poprzez instrukja warunkowa if klamka nie = nic i zwrot metody stan klamki albo bez klamki
        String stanKlamki = klamka!= null ? klamka.stan() : "bez klamki";
        //metoda zwraca wymiary, otwarcie i stanKlamki
        return wymiary +" "+ otwarcie +" "+ stanKlamki;
    }
}