public class Modularizado01 {

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 30;

        int soma = calcularSoma(numero1, numero2, numero3);
        double media = calcularMedia(soma, 3);

        exibirResultado(soma, media);
    }

    public static int calcularSoma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double calcularMedia(int soma, int quantidade) {
        return soma / (double) quantidade;
    }

    public static void exibirResultado(int soma, double media) {
        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + media);
    }
}
