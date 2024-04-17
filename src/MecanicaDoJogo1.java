public class MecanicaDoJogo1 implements MecanicaDoJogo {

  int pontos = 0;
  boolean jogoTerminado = false;

  @Override
  public void quiz(String palavra, String resposta) {
    andamento(resposta.equals(palavra));
  }

  @Override
  public void termina() {
    jogoTerminado = true;
    System.out.println("----");
    System.out.println("Fim do jogo");
    System.out.println("Você fez " + pontos + " pontos");
  }

  public void andamento(boolean acertou) {
    if (acertou) {
      System.out.println("Correto!");
      pontos++;
    } else {
      System.out.println("Incorreto!");
    }
  }
}
