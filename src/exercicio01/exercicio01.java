package exercicio01;
import java.util.Scanner;

    public class exercicio01 {


        public static void main(String args[]) {


            Scanner sc = new Scanner(System.in);


            System.out.println("Conta");

            double conta = sc.nextDouble();


            double resultado = conta * 1.1;

            System.out.printf("Valor total: %.2f", resultado);


        }
    }