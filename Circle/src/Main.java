import com.company.Circle;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Circle pierwsze_kolo= new Circle();
        System.out.println("Podaj promień");
        Scanner scanner= new Scanner(System.in);
        double promien = scanner.nextDouble();
        pierwsze_kolo.setPromien(promien);
        System.out.println("Pole: " + pierwsze_kolo.Area());
        System.out.println("Obwód: " + pierwsze_kolo.Circumference());

    }
}
