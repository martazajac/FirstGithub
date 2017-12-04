public class Main {

    public static void main(String[] args) {
	// write your code here
        String imie="Marta";

        Pracownik prezes = new Pracownik();
        prezes.imie= "Hermenegilda";
        prezes.drugie_imie= "Niemam";
        prezes.nazwisko="Ladne";
        prezes.wiek=16;

        Pracownik dyrektor=new Pracownik();
        dyrektor.imie= "Bożydar";
        dyrektor.pensja= 10000;
        dyrektor.wiek=99;

        prezes.Opisz_Pracownika();
        dyrektor.Opisz_Pracownika();
        prezes.Podwyżka(10);

        System.out.println("PREZES Imie "+ prezes.imie + "\nNazwisko "+prezes.nazwisko);
        System.out.println("DYREKTOR Imie "+ dyrektor.imie +"\nNazwisko "+dyrektor.nazwisko);
        System.out.println("Podwyżka: " +);


    }
}
