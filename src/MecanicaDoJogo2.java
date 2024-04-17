public class MecanicaDoJogo2 implements MecanicaDoJogo {

  private int tentativasRestantes;
  private int pontos;

  public MecanicaDoJogo2(int tentativasMaximas) {
    this.tentativasRestantes = tentativasMaximas;
    this.pontos = 0;
  }

  public int getPontos() {
    return pontos;
  }

  public int getTentativasRestantes() {
    return tentativasRestantes;
  }

  @Override
  public void quiz(String palavra, String resposta) {
    if (resposta.equals(palavra)) {
      System.out.println("Correto!");
      pontos++;
    } else {
      System.out.println("Incorreto!");
      tentativasRestantes--;
    }
  }

  @Override
  public void termina() {
    System.out.println("----");
    System.out.println("Fim do jogo");
    System.out.println("Você fez " + pontos + " pontos");
  }

  @Override
  public boolean aindaTemTentativas() {
    System.out.println("Tentativas restantes: " + tentativasRestantes);
    return tentativasRestantes > 0;
  }
}
