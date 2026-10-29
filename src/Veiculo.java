 class Veiculo extends EstadoVeiculo {
    String nome;
    String modelo;
    String Cor;
    Double Cilindrada;
    boolean mundancas;
    private int ano;

    Veiculo(String nome, String modelo, String Cor, Double Cilindrada, Boolean mundancas, int ano){
        this.nome = nome;
        this.modelo = modelo;
        this.Cor = Cor;
        this.Cilindrada = Cilindrada;
        this.mundancas = mundancas;
        this.ano = ano;
    }

    public int getAno(){
        return ano;
    }

    void ModoAcelerar(){
        System.out.println("O veiculo está a acelerar");
    }

    void mover(){
        System.out.println("Veiculo a andar");
    }

    void parado(){
        System.out.println("Veiculo parado");
    }
}