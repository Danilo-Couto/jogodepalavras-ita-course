public class Main {

  public static void main(String[] args) {

    BancoDePalavras bancoDePalavras = new BancoDePalavras();

    FabricaEmbaralhadores fabricaEmbaralhadores = new FabricaEmbaralhadores();

    Embaralhador embaralhador1 = fabricaEmbaralhadores.retornaUmEmbaralhador();

    FabricaMecanicaDoJogo fabricaMecanicaDoJogo = new FabricaMecanicaDoJogo();
    fabricaMecanicaDoJogo.addMecanicaDeJogo(bancoDePalavras, embaralhador1);

    MecanicaDoJogo mecanicaDoJogo1 = fabricaMecanicaDoJogo.retornaMecanicaDoJogo();
    mecanicaDoJogo1.inicia();
  }
}

//  A classe Principal deve recuperar a instância de MecanicaDoJogo de FabricaMecanicaDoJogo e não
//    pode conter nenhuma referência direta a uma das implementações, apenas a interface. Da mesma
//    forma, as implementações de MecanicaDoJogo devem recuperar os embaralhadores de
//    FabricaEmbaralhadores e também não pode conter nenhuma referência direta a implementações de
//    Embaralhador, apenas a interface.