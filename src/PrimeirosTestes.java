import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PrimeirosTestes {

  BancoDePalavras bancoDePalavras = new BancoDePalavras();
  FabricaEmbaralhadores fabricaEmbaralhadores = new FabricaEmbaralhadores();

  Embaralhador embaralhador = fabricaEmbaralhadores.retornaUmEmbaralhador();

  @Test
  public void getBancoDePalavras() {
    assertTrue(bancoDePalavras.getPalavraAleatoria() instanceof String);
  }

  @Test
  public void getFabricaEmbaralhadores() {
    assertNotNull(embaralhador);
    assertTrue(embaralhador instanceof Embaralhador);
  }

  @Test
  public void getMecanicaDoJogo() {
    MecanicaDoJogo mecanicaDoJogo = new MecanicaDoJogo1();
    assertTrue(mecanicaDoJogo instanceof MecanicaDoJogo);
  }
}