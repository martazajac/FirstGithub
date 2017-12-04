public class Pracownik {
    //    Deklaracja pola w klasie
    public String imie;
    public String drugie_imie;
    public int wiek;
    public String nazwisko;
    private float pensja;

    //    Konstruktor: pracownik na starcie ma 2000
    public Pracownik() {
        pensja = 2000;
    }

    public void Opis() {
        System.out.println("Pracownik");
    }

    //    this wpisuje sie samo - nie musi byc
    public void Opisz_Pracownika() {
        System.out.println("Imie: " + this.imie + " Nazwisko: " + this.nazwisko);
    }

    public void Podwyżka(float procent) {
        float kwota;
        kwota= pensja+procent/100;
        pensja+=kwota;
        System.out.println("Podwyzka to " + kwota);

    }

}
