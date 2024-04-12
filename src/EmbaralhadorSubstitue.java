import java.util.HashMap;
import java.util.Random;

public class EmbaralhadorSubstitue implements Embaralhador {

  @Override
  public String recebePalavraEEmbaralha(String palavra) {
    Random random = new Random();
    int inicio = random.nextInt(palavra.length());
    return new StringBuilder(palavra).replace(inicio, inicio + 1, "x").toString();
    }

}
