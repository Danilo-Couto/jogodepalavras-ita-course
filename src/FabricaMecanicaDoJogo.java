import java.util.ArrayList;
import java.util.List;

public class FabricaMecanicaDoJogo {

  List<MecanicaDoJogo> listaMecanicaDeJogo = new ArrayList<>();

  public FabricaMecanicaDoJogo(BancoDePalavras bancoDePalavras, Embaralhador embaralhador) {
    this.listaMecanicaDeJogo.add(new MecanicaDoJogo1(bancoDePalavras,embaralhador));
  }

  public FabricaMecanicaDoJogo() {
  }

  public MecanicaDoJogo retornaMecanicaDoJogo(){
    int numeroAleatorio = (int) (Math.random() * listaMecanicaDeJogo.size());
    return listaMecanicaDeJogo.get(numeroAleatorio);
  }

  public void addMecanicaDeJogo(BancoDePalavras bancoDePalavras, Embaralhador embaralhador){
    this.listaMecanicaDeJogo.add(new MecanicaDoJogo1(bancoDePalavras,embaralhador));
  }
}


//  retorna a MecanicaDoJogo que deve ser utilizada.