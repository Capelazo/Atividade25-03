public class Porta {
    private boolean isOpen;
    private static int numAberturas; // Atributo estático para contar o total de aberturas de todas as portas

    public Porta() {
        this.isOpen = false;
    }

    public void abrir() {
        isOpen = true;
        numAberturas++; // Incrementa o total de aberturas
        System.out.println("Porta aberta. Total de aberturas: " + numAberturas);
    }

    public void fechar() {
        isOpen = false;
        System.out.println("Porta fechada.");
    }

    public static int getTotalAberturas() {
        return numAberturas;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
