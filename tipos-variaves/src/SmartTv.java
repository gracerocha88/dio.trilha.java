import javax.print.attribute.standard.RequestingUserName;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int Volume = 25;

    public void aumentarCanal() {
        canal++;
        System.out.println("Aumentando canal para: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Diminuindo canal para: " + canal);
    }

    public void aumentarVolume() {
        Volume++;
        System.out.println("Aumentando o volume para: " + Volume);
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo volume: " + Volume);
        Volume--;
    }

    public void ligar() {
        ligada = true;

    }

    public void desligar() {
        ligada = false;

    }
}
