package exercicio02;

import java.util.Scanner;

public class RaioDaMorte {

    public static void  main (String argrs []){

        Scanner sc = new Scanner(System.in );

      double PI = Math.PI;

      System.out.println("Resultado do Raio");
      double radius = sc.nextDouble();
      System.out.println("Altura");
      double height = sc.nextDouble();

      double result = height * Math.pow(radius, 2) *PI;
      System.out.printf ("O Resultado igual, %.4f", result);




    }
}
