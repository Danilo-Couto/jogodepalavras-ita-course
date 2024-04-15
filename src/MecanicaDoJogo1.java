import java.util.Objects;
import java.util.Scanner;

public class MecanicaDoJogo1 implements MecanicaDoJogo {

  BancoDePalavras bancoDePalavras;
  Embaralhador embaralhador;
  Scanner in;

  boolean naoContinua = true;

  public MecanicaDoJogo1(BancoDePalavras bancoDePalavras, Embaralhador embaralhador) {
    this.bancoDePalavras = bancoDePalavras;
    this.embaralhador = embaralhador;
    this.in = new Scanner(System.in);
  }

  @Override
  public void inicia() {
    boolean mesmoQuiz = true;

    for (String palavra : bancoDePalavras.getBancoDePalavras()) {
      String quiz = embaralhador.recebePalavraEEmbaralha(palavra);
      while (mesmoQuiz) {
        naoContinua = fazPerguntaEAvalia(palavra, quiz);
        if (naoContinua) {
          mesmoQuiz = false;
        }
      }
      break;
    }
    System.out.println("Obrigado por jogar =)");
  }

  @Override
  public boolean fazPerguntaEAvalia(String palavra, String quiz) {
    System.out.println(quiz);
    System.out.println("Adivinhe que palavra é essa?");
    String tentativa = in.next();

    if (Objects.equals(tentativa, palavra)) {
      System.out.println("Parabéns, você Ganhou!");
      return true;
    } else {
      System.out.println("Errou! Quer tentar novamente? s ou n");
      return in.next().equals("n");
    }
  }
}
