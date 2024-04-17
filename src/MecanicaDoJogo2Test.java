import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MecanicaDoJogo2Test {

  @Test
  public void testQuizIncorreto() {
    MecanicaDoJogo2 mecanicaDoJogo2 = new MecanicaDoJogo2(3);
    String palavra = "teste";
    String resposta = "errado";
    mecanicaDoJogo2.quiz(palavra, resposta);
    assertEquals(2, mecanicaDoJogo2.getTentativasRestantes());
  }

}

