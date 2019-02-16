package exercicio03;
import java.util.Scanner;

public class PrefeituraBelem {

public static void main (String args []){

    Scanner sc = new Scanner(System.in);

    System.out.println("Salario Bruto");
    double amount = sc.nextDouble();

    System.out.println("Prestação");
    double value = sc.nextDouble();

    double max = amount * 0.3;

    if (value >= max) {
        System.out.println("não vai da certo");
    } else {
        System.out.println("vai da certo");
    }





}

}
