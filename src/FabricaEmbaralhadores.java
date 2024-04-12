import java.util.ArrayList;
import java.util.List;

public class FabricaEmbaralhadores {

  List<Embaralhador> listaEmbaralhador = new ArrayList<>();

  public FabricaEmbaralhadores() {
    this.listaEmbaralhador.add(new EmbaralhadorReverte());
    this.listaEmbaralhador.add(new EmbaralhadorSubstitue());
  }

  public Embaralhador retornaUmEmbaralhador(){
    int numeroAleatorio = (int) (Math.random() * listaEmbaralhador.size());
    return listaEmbaralhador.get(numeroAleatorio);
  }

}

