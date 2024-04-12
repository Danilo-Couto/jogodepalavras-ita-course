import java.util.Scanner;
import java.util.Objects;

public class MecanicaDoJogo1 implements MecanicaDoJogo {
  Scanner in = new Scanner(System.in);

  boolean continua = false;
  BancoDePalavras bancoDePalavras;
  Embaralhador embaralhador;

  public MecanicaDoJogo1( BancoDePalavras bancoDePalavras, Embaralhador embaralhador) {
    this.bancoDePalavras = bancoDePalavras;
    this.embaralhador = embaralhador;
  }

  @Override
  public void inicia() {
    for (String palavra : bancoDePalavras.getBancoDePalavras()) {
      String quiz = embaralhador.recebePalavraEEmbaralha(palavra);
      continua = fazPerguntaEAvalia(palavra, quiz);
      if (continua)
        break;
    }
    System.out.println("Obrigado por jogar =)");
  }

  @Override
  public boolean fazPerguntaEAvalia(String palavra, String quiz) {
    System.out.println(quiz);
    System.out.println("Adivinhe que palavra é essa.");
    String tentativa = in.next();

    if (Objects.equals(tentativa, palavra)) {
      System.out.println("Parabéns, você Ganhou!");
    } else {
      System.out.println("Errou! Quer tentar novamente? s ou n");
      return !in.next().equals("s");
    }
    return true;
  }
}
