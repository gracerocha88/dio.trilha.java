package estruturaDados;

public class aula1 {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        System.out.println("intA=" + intA + " intB=" + intB);
        intA = 2;
        System.out.println("intA=" + intA + " intB=" + intB);

        meuObj objA = new meuObj(1);
        meuObj objB = objA;

        System.out.println("objA=" + objA + " objB=" + objB);
        objA.setNum(2);
        System.out.println("objA=" + objA + " objB=" + objB);

    }
}
