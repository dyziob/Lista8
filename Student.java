package Lista8;

public class Student {
    String imie, nazwisko;
    int indeks;
       /* Student(String imie, String nazwisko, int indeks){
                this.imie = imie;
                this.nazwisko = nazwisko;
                this.indeks = indeks;
        }*/

    public void Ustaw_Imie(String imie) {
        this.imie = imie;
    }

    public void Ustaw_Nazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void Ustaw_Pesel(int indeks) {
        this.indeks = indeks;
    }
}


