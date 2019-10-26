//deklaracja klasy: nazwa klasy jest taka sama jak nazwa pliku
public class Okno {
    //pole prywatne dlugosc typu int
    private int dlugosc;
    //pole prywatne wysokosc typu int
    private int wysokosc;
    //pole prywatne liczbaSkrzydel typu int
    private int liczbaSkrzydel;
    //pole prywatne skrzydla tworzace tablice Skrzydlo
    private Skrzydlo[] skrzydla;

    //konstruktor publiczny Okno z elementami d typu int, w typu int i lSkrzydel typu int
    public Okno(int d, int w, int lSkrzydel){
        //przypisanie dlugosci wartosci d
        dlugosc = d;
        //przypisanie wysokosci wartosci w
        wysokosc = w;
        //przypisanie liczbaSkrzydel wartosci lSkrzydel
        liczbaSkrzydel = lSkrzydel;
        //przypisanie skrzydla tablicy zawierajacej liczbe skrzydel
        skrzydla = new Skrzydlo[lSkrzydel];
        //wywolanie petli for przechodzacej przez wszystkie elementy tabeli (wszystkie skrzydla)
        for(int i=0;i<lSkrzydel;i++){
            //dla kazdego miejsca na tablicy skrzydel tworzone jest nowe Skrzydlo ktora posiada
            //parametry iloczynu d i liczby skrzydel, w i tworzy nowa Klamke
            skrzydla[i] = new Skrzydlo(d/lSkrzydel,w, new Klamka());
        }
    }
    //konstruktor publiczny Okno z elementami d, w typu int i tablice jednowymiarowa Skrzydlo
    public Okno(int d, int w, Skrzydlo[] sk){
        //przypisanie dlugosci wartosci d
        dlugosc = d;
        //przypisanie wysokosci wartosci w
        wysokosc = w;
        //przypisanie liczbaSkrzydel dlugosci sk(skrzydla)
        liczbaSkrzydel = sk.length;
        //przypisanie skrzydla wartosci sk
        skrzydla = sk;
    }
    //konstruktor publiczny Okno z elementami d i w typu int
    public Okno(int d, int w){
        //przypisanie parametrow okna d i w dla d i w typu int oraz 1 skrzydla
        this(d,w,1);
    }
    //konstruktor publiczny Okno
    public Okno(){
        //okreslenie parametrow 1200 dla d 1500 dla w i 1 dla liczbySkrzydel
        this(1200,1500,1);
    }
    //publiczna metoda dostepowa typu int
    public int getDlugosc() {
        //zwracajaca wartosc dlugosc
        return dlugosc;
    }
    //publiczna metodda nie zwracajaca niczego, ustalajaca Dlugosc o wartosci dlugosc typu int
    public void setDlugosc(int dlugosc) {
        //przypisnie polu dlugosc wartosci dlugosc z metody
        this.dlugosc = dlugosc;
        //wywolanie petli for przechodzacej przez wszystkie elementy tabeli (wszystkie skrzydla)
        for(int i=0;i<liczbaSkrzydel;i++){
            //dla kazdego miejsca na tablicy skrzydel ustalana jest Dlugosc na podstawie
            //ilorazu dlugosci i liczbySkrzydel
            skrzydla[i].setDlugosc(dlugosc/liczbaSkrzydel);
        }
    }
    //publiczna metoda dostepowa typu int
    public int getWysokosc() {
        //zwracajaca wartosc wysokosc
        return wysokosc;
    }
    //publiczna metoda ustalajaca wysokosc na podstawie wartosci wysokosc typu int
    public void setWysokosc(int wysokosc) {
        //przypisanie polu wysokosc wartosci wysokosc z metody
        this.wysokosc = wysokosc;
        //wywolanie petli for przechodzacej przez wszystkie elementy tabeli (wszystkie skrzydla)
        for(int i=0;i<liczbaSkrzydel;i++){
            //dla kazdego miejsca na tablicy skrzydel ustalana jest Dlugosc na podstawie wysokosci
            skrzydla[i].setWysokosc(wysokosc);
        }
    }
    //publiczna metoda dostepowa typu int
    public int getLiczbaSkrzydel() {
        //zwracajaca wartosc liczbaSkrzydel
        return liczbaSkrzydel;
    }
    //publiczna metoda dostepowa typu int
    public Skrzydlo[] getSkrzydla() {
        //zwracajaca wartosc skrzydla
        return skrzydla;
    }
    //publiczna metoda otworz nie zwracajaca niczego
    public void otworz(){
        //wywolanie petli for przechodzacej przez wszystkie elementy tabeli (wszystkie skrzydla)
        for(int i=0;i<liczbaSkrzydel;i++){
            //dla kazdego miejsca na tablicy skrzydel ustalone jest Otwarte skrzydlo
            skrzydla[i].setOtwarte(true);
        }
    }//publiczna metoda otworz nie zwracajaca niczego zawierajaca nrSkrzydla typu int
    public void otworz(int nrSkrzydla){
        //instrukcja warunkowa jesli(if) nrSkrzydla jest wiekszy od dlugosci skrzydla to zostaje on zwracany
        if(nrSkrzydla > skrzydla.length) return;
        //kazdy nrSkrzydla na tablicy skrzydel jest ustawiany jako Otwarty
        skrzydla[nrSkrzydla].setOtwarte(true);

    }
    //publiczna metoda zamknij nie zwracajaca niczego
    public void zamknij(){
        //wywolanie petli for przechodzacej przez wszystkie elementy tabeli (wszystkie skrzydla)
        for(int i=0;i<liczbaSkrzydel;i++){
            //dla kazdego miejsca na tablicy skrzydel ustalana jest wartosc false(zamkniete)
            skrzydla[i].setOtwarte(false);
        }
    }
    //publiczna metoda zamknij nie zwracajaca niczego  
    public void zamknij(int nrSkrzydla){
        //instrukcja warunkowa jesli(if) nrSkrzydla jest wiekszy od dlugosci srzydla to zosaje on zwracany
        if(nrSkrzydla > skrzydla.length) return;
        //dla kazdego nrSkrzydla na tablicy skrzydel ustalana jest wartosc false(zamkniete)
        skrzydla[nrSkrzydla].setOtwarte(false);

    }
    //publiczna metoda wypiszStan nie zwracajaca niczego
    public void wypiszStan() {
        //przypisanie wartosci "" typu String dla tekst
        String tekst = "";
        //wywolanie petli for przechodzacej przez wszystkie elementy tabeli (wszystkie skrzydla)
        for(int i=0;i<liczbaSkrzydel;i++){
            //okreslenie wartosci tekst przez dodanie "[", stanu kazdego skrzydla, "]"
            tekst += "["+skrzydla[i].stan()+"]";
        }
        //wywolanie metody println wypisujacej na konsoli wartosc tekst
        System.out.println(tekst);

    }

}