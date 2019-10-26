//deklaracja klasy: nazwa klasy jest taka sama jak nazwa pliku
public class Klamka {

    //pole prywatne typu boolean o nazwie czyKluczyk i przechowujące wartosc false
    private boolean czyKluczyk = false;

    //metoda publiczna isCzyKluczyk typu boolean
    public boolean isCzyKluczyk() {
        //zwracajaca wartosc czyKluczyk (false)
        return czyKluczyk;
    }
    //metoda publiczna, nie zwracająca niczego (void)  ustalająca nową wartosc dla czyKluczyk na boolean czyKluczyk
    public void setCzyKluczyk(boolean czyKluczyk) {
        //nadanie wartosci czyKluczyk zmiennej czyKluczyk
        this.czyKluczyk = czyKluczyk;
    }
    //deklaracja metody publicznej stan typu String
    public String stan() {
        //zwraca wartosc z kluczem/bez klucza dla czyKluczyk
        return czyKluczyk ? "z kluczem": "bez klucza";
    }
}

