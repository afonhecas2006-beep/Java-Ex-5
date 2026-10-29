public class Carro extends Veiculo {

    int numero_portas;
    boolean descapotavel;

    Carro(String nome, String modelo, int numero_portas, boolean descapotavel, String Cor, Double Cilindrada, Boolean mundancas, int ano){
        super(nome,modelo, Cor,Cilindrada,mundancas,ano);
        this.numero_portas=numero_portas;
        this.descapotavel=descapotavel;
    }


    void ModoAcelerar() {
        System.out.println("O Carro acelera suavemente com o pedal");
    }

    void mostarInf(){
        System.out.println("Nome: " + nome + "\nModelo: " + modelo + " \nNumero de portas: " + numero_portas + "\nDescapotavel: " + descapotavel + "\nCor: " + Cor + "\nCilindrada: " + Cilindrada + "\nMundancas: " + mundancas);
    }
}
