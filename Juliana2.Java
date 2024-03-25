import java.util.Random;

public class JogoAdivinhacao {
    private int numeroSorteado;

    public JogoAdivinhacao() {
        sortear();
    }

    public void sortear() {
        Random random = new Random();
        numeroSorteado = random.nextInt(100);
    }

    public String adivinhar(int tentativa) {
        if (tentativa < 0 || tentativa > 99) {
            return "Número inválido! Por favor, escolha um número entre 0 e 99.";
        } else if (tentativa < numeroSorteado) {
            return "Tente um número maior.";
        } else if (tentativa > numeroSorteado) {
            return "Tente um número menor.";
        } else {
            return "Parabéns! Você acertou o número " + numeroSorteado + "!";
        }
    }

    public static void main(String[] args) {
        JogoAdivinhacao jogo = new JogoAdivinhacao();

        System.out.println("Número sorteado. Tente adivinhar!");

        int tentativa = 50;
        System.out.println("Sua tentativa: " + tentativa);
        System.out.println(jogo.adivinhar(tentativa));
    }
}
