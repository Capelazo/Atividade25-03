class Pessoa {
    String nome;
    String sexo;
    int idade;
    boolean vegetariana;
    
    public Pessoa(String nome, String sexo, int idade, boolean vegetariana) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.vegetariana = vegetariana;
    }
}

class Churrasco {
    double qtdCarne;

    public void verificarConsumo(Pessoa pessoa) {
        if (pessoa.idade >= 0 && pessoa.idade <= 3) {
            qtdCarne = 0; // Pessoas de 0 a 3 anos não consomem carne
        } else if (pessoa.vegetariana) {
            qtdCarne = 0; // Vegetarianos não consomem carne
        } else if (pessoa.idade >= 4 && pessoa.idade <= 12) {
            qtdCarne = 1; // Pessoas de 4 a 12 anos consomem 1 kilo de carne
        } else {
            qtdCarne = 2; // Pessoas de 13 anos em diante consomem 2 kilos de carne
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", "Masculino", 10, false);
        Pessoa pessoa2 = new Pessoa("Maria", "Feminino", 25, true);

        Churrasco churrasco = new Churrasco();
        churrasco.verificarConsumo(pessoa1);
        System.out.println("Quantidade de carne consumida por " + pessoa1.nome + ": " + churrasco.qtdCarne + " kg");

        churrasco.verificarConsumo(pessoa2);
        System.out.println("Quantidade de carne consumida por " + pessoa2.nome + ": " + churrasco.qtdCarne + " kg");
    }
}
