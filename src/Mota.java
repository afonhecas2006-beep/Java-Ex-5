public class Mota extends Veiculo {

    Mota(String nome, String modelo, String Cor, Double Cilindrada, Boolean mundancas, int ano){
        super(nome,modelo,Cor,Cilindrada,mundancas,ano);
    }

    void ModoAcelerar(){
        System.out.println("A mota acelerar rapidamente com o punho");
    }

    void mostarInf(){
        System.out.println("Nome: " + nome + "\nModelo: " + modelo + "\nCor: " + Cor + "\nCilindrada: " + Cilindrada + "\nMundancas: " + mundancas);
    }
}
