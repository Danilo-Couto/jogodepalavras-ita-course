import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MecanicaDoJogo1Test {

  @Test
  public void testQuizCorreto() {
    MecanicaDoJogo1 mecanicaDoJogo = new MecanicaDoJogo1();
    String palavra = "teste";
    String resposta = "teste";
    mecanicaDoJogo.quiz(palavra, resposta);
    assertEquals(1, mecanicaDoJogo.getPontos());
  }

  @Test
  public void testQuizIncorreto() {
    MecanicaDoJogo1 mecanicaDoJogo = new MecanicaDoJogo1();
    String palavra = "teste";
    String resposta = "errado";
    mecanicaDoJogo.quiz(palavra, resposta);
    assertEquals(0, mecanicaDoJogo.getPontos());
  }

}

