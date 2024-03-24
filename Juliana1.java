public class Lampada {
    
    public enum Estado {
        APAGADA, ACESA
    }

    private Estado estado;
    private int qtdAcendimentos;

    public Lampada() {
        this.estado = Estado.APAGADA;
        this.qtdAcendimentos = 0;
    }

    public void click() {
        if (estado == Estado.APAGADA) {
            estado = Estado.ACESA;
            qtdAcendimentos++;
        } else {
            estado = Estado.APAGADA;
        } 
    }

    public int qtdAcendimentos() {
        return qtdAcendimentos;
    }

    public Estado checaEstado() {
        return estado;
    }

    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.click();
        System.out.println("Estado da lâmpada: " + lampada.checaEstado()); 
        lampada.click();
        System.out.println("Estado da lâmpada: " + lampada.checaEstado()); 

        lampada.click();
        lampada.click();
        System.out.println("Quantidade de acendimentos: " + lampada.qtdAcendimentos());
    }
}
