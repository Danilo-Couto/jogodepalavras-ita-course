import java.util.ArrayList;
import java.util.List;

public class BancoDePalavras {

  private final List<String> bancoDePalavras;

  public BancoDePalavras() {
    this.bancoDePalavras = new ArrayList<>();
    gerarPalavras();
  }

  private void gerarPalavras(){
    String[] palavras = {"cachorro", "gato", "computador", "casa", "carro", "mesa", "banana", "laranja", "mouse", "teclado", "speaker", "roda", "pessoas", "bicho", "restaurante", "conveniencia", "fachada", "paralelepipedo", "trade", "kitesurf"};
    for (String palavra : palavras) {
      bancoDePalavras.add(palavra);
    }
  }

  public List<String> getBancoDePalavras() {
    return bancoDePalavras;
  }

  public String retornaUmaPalavra() {
    int numeroAleatorio = (int) (Math.random() * bancoDePalavras.size());
    return bancoDePalavras.get(numeroAleatorio);
  }
}

//classe que possui um método que retorna uma palavra retirada
//aleatóriamente de uma lista de palavras lida a partir de um arquivo.