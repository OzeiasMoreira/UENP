package caixa;

public class main {
    public static void main(String[] args) {
        caixa caixa = new caixa();
        caixa.altura = 2.43;
        caixa.comprimento = 7.54;
        caixa.largura = 4.43;
        caixa.calcularVolume();
        System.out.println("volume:" + caixa.volume);

    }
}
