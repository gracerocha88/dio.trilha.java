public class Operadores {
    public static void main(String[] args) {
        // exemplo
        // String nomeCompleto = "LINGUAGEM" + "JAVA";
        // System.out.println(nomeCompleto);

        // exemplo:
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        // exemplos unarios: tornando valor negativo
        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        // tornando positivo novamente
        numero = numero * -1;
        System.out.println(numero);

        // exemplo repetição
        int numero1 = 10;

        System.out.println(++numero1);

        // exemplo booleano

        boolean casa = true;
        casa = !casa;
        System.out.println(casa);

        // exemplo ternario
        int a, b;
        a = 5;
        b = 6;

        int resultado = a == b ? 1 : 0;

        System.out.println(resultado);

        // exemplo relacionais
        int numero2 = 1;
        int numero3 = 2;

        boolean simNao = numero2 == numero3;

        System.out.println("numeroUm é igual ao numeroDois " + simNao);

    }
}
