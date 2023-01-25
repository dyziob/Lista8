package Lista8;

public class StudentInstytut extends StudentUZ {
    String instytut;

    public String getInstytut() {
        return instytut;
    }

    public void Ustaw_Instytut(String instytut) {
        this.instytut = instytut;
    }

    public void show() {
        System.out.println("Imię: " + imie + "\nNazwisko: " + nazwisko + "\nIndeks: " + indeks + "\nWydział: " + wydzial + "\nInstytut: " + instytut);
    }
}
