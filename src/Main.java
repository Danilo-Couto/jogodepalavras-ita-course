import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    BancoDePalavras bancoDePalavras = new BancoDePalavras();
    FabricaEmbaralhadores fabricaEmbaralhadores = new FabricaEmbaralhadores();
    Embaralhador embaralhador = fabricaEmbaralhadores.retornaUmEmbaralhador();

    boolean continuarJogando = true;

    while (continuarJogando) {
      MecanicaDoJogo mecanicaDoJogo = new MecanicaDoJogo2(3);

      int quantidadeDePalavras = bancoDePalavras.getTamanhoDaLista();

      while (quantidadeDePalavras > 15 && mecanicaDoJogo.aindaTemTentativas()) {
        String palavra = bancoDePalavras.getPalavraAleatoria();
        String palavraEmbaralhada = embaralhador.recebePalavraEEmbaralha(palavra);
        System.out.println("Palavra embaralhada: " + palavraEmbaralhada);
        System.out.println("Digite sua resposta:");
        String resposta = scanner.nextLine();

        mecanicaDoJogo.quiz(palavra, resposta);
        quantidadeDePalavras--;
      }

      mecanicaDoJogo.termina();

      System.out.println("Quer tentar novamente? Digite s ou n");
      String jogarNovamente = scanner.nextLine();
      if (!jogarNovamente.equalsIgnoreCase("s")) {
        continuarJogando = false;
      }
    }

    System.out.println("Obrigado por jogar");
    scanner.close();
  }

}
