package Lista8;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        StudentInstytut Student = new StudentInstytut();
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj Imie: ");
        Student.Ustaw_Imie(scan.next());
        System.out.print("Podaj Nazwisko: ");
        Student.Ustaw_Nazwisko(scan.next());
        System.out.print("Podaj Pesel: ");
        Student.Ustaw_Pesel(scan.nextInt());
        System.out.print("Podaj Wydział: ");
        Student.Ustaw_Wydzial(scan.next());
        System.out.print("Podaj Instytut: ");
        Student.Ustaw_Instytut(scan.next());
        Student.show();
    }
}