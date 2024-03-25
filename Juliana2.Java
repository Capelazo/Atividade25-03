import java.util.Random;

public class Jogo {
    private int numSorteado;

    public Jogo() {
        sortear();
    }

    public void sortear() {
        Random random = new Random();
        numSorteado = random.nextInt(100);
    }

    public String adivinhar(int tentativa) {
        if (tentativa < 0 || tentativa > 99) {
            return "Número inválido! Por favor, escolha um número entre 0 e 99.";
        } else if (tentativa < numSorteado) {
            return "Tente um número maior.";
        } else if (tentativa > numSorteado) {
            return "Tente um número menor.";
        } else {
            return "Você acertou o número: " + numSorteado + "!";
        }
    }

    public static void main(String[] args) {
        Jogo jogo = new Jogo();

        System.out.println("Número sorteado. De seu palpite!");

        int tentativa = 50;
        System.out.println("Sua tentativa: " + tentativa);
        System.out.println(jogo.adivinhar(tentativa));
    }
}
