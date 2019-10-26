//deklaracja klasy: nazwa klasy jest taka sama jak nazwa pliku
public class Test {
    //metoda statyczna main wywolywana w trakcie uruchomienia tego pliku
    public static void main(String[] args) {

        //utworzenie nowego obiektu okno1 typu Okno
        Okno okno1 = new Okno();
        //utworzenie nowego obiektu okno2 typu Okno o dlugosci 1800, wysokosci 1800 i lSkrzydel - 3
        Okno okno2 = new Okno(1800,1800,3);

        //metoda otwierajaca okno1
        okno1.otworz();
        //metoda otwierajaca okno2 o numerze skrzydla 0
        okno2.otworz(0);
        //metoda otwierajaca okno2 o numerze skrzydla 2
        okno2.otworz(2);

        //metoda wypisujaca Stan okna1
        okno1.wypiszStan();
        //metoda wypisujaca Stan okna2
        okno2.wypiszStan();

        //metoda zamykajaca okno1
        okno1.zamknij();
        //metoda ustalalajaca dlugosc okna2 na 2100
        okno2.setDlugosc(2100);
        //metoda zamykajaca okno2 o numerze skrzydla 0
        okno2.zamknij(0);
        //utworzenie nowego obiektu kl typu Klamka
        Klamka kl = new Klamka();
        //ustalenie wartosci true dla czyKluczyk dla kl(klamka posiada kluczyk)
        kl.setCzyKluczyk(true);

        //metoda pobierajaca Skrzydla z miejsca 1 w tablicy dla okno2 i ustalajaca Klamka kl
        okno2.getSkrzydla()[1].setKlamka(kl);
        //metoda pobierajaca Skrzydal z miejsca 2 w tablicy dla okno2 i ustalajaca brak Klamka
        okno2.getSkrzydla()[2].setKlamka(null);

        //metoda wypisujaca stan okno1
        okno1.wypiszStan();
        //metoda wypisujaca stan okno2
        okno2.wypiszStan();

    }
}