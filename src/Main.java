void main() {
    Scanner sc = new Scanner(System.in);

    Mota Mota_1 = new Mota("Kawazaki", "modelo super bom", "Preto", 2.5, true, 2026);
    Carro Carro_1 = new Carro("Audi", "A2", 4, true, "Preto", 3.0, false, 2026);
    Mota Mota_2 = new Mota("Honda", "CBR", "Vermelho", 0.6, false, 2023);
    Carro Carro_2 = new Carro("Toyota", "Yaris", 5, false, "Branco", 1.5, true, 2021);

    int ciclo = 1;


    do {
        System.out.println("\n");
        System.out.println("Qual é o carro que deseja: ");
        String Pergunta = sc.nextLine().toLowerCase();

        if (Pergunta.equals("audi") || Pergunta.equals("bmw")) {
            System.out.println("Carro alemão\n");
        } else {
            System.out.println("Outro fabricante\n");
        }
        switch (Pergunta) {
            case "audi":
                Carro_1.mover();
                Carro_1.ModoAcelerar();
                Carro_1.parado();
                Carro_1.mostarInf();
                System.out.println("Ano: " + Carro_1.getAno());
                break;

            case "kawazaki":
                Mota_1.mover();
                Mota_1.ModoAcelerar();
                Mota_1.parado();
                Mota_1.mostarInf();
                System.out.println("Ano: " + Mota_1.getAno());
                break;

            case "honda":
                Mota_2.mover();
                Mota_2.ModoAcelerar();
                Mota_2.parado();
                Mota_2.mostarInf();
                System.out.println("Ano: " + Mota_2.getAno());
                break;

            case "toyota":
                Carro_2.mover();
                Carro_2.ModoAcelerar();
                Carro_2.parado();
                Carro_2.mostarInf();
                System.out.println("Ano: " + Carro_2.getAno());
                break;

            default:
                System.out.println("Não existe esse nome no stand");
        }
    }while (ciclo != 0) ;
}
