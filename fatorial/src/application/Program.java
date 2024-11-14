package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial:");
        int numero = sc.nextInt();

        int fatorial = 1;

        if (numero == 0) {
            System.out.println("O fatorial de 0 é 1");
        } else {
            for (int i = 1; i <= numero; i++) {
                fatorial = fatorial * i;
                System.out.printf("O fatorial de %d é (%d!) * %d = %d \n", i, i - 1, i, fatorial);
            }
        }

        sc.close();
    }
}
