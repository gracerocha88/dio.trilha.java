package loops;

import java.util.Scanner;

public class maiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;
            System.out.println("soma: " + soma);
            if (numero > maior)
                maior = numero;

            count = count + 1;

        } while (count < 5);
        System.out.println("maior: " + maior);
        System.out.println("media: " + (soma / 2));

    }

}
