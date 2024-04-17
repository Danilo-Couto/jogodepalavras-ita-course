import java.util.ArrayList;
import java.util.List;

public class FabricaMecanicaDoJogo {

  List<MecanicaDoJogo> listaMecanicaDeJogo = new ArrayList<>();

  public FabricaMecanicaDoJogo() {
  }

  public MecanicaDoJogo retornaMecanicaDoJogo() {
    int numeroAleatorio = (int) (Math.random() * listaMecanicaDeJogo.size());
    return listaMecanicaDeJogo.get(numeroAleatorio);
  }

}