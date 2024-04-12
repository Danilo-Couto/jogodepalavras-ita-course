import java.util.HashMap;

public class EmbaralhadorReverte implements Embaralhador {

  @Override
  public String recebePalavraEEmbaralha(String palavra) {
   return new StringBuilder(palavra).reverse().toString();
  }
}
