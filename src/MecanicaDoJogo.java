public interface MecanicaDoJogo {

  void quiz(String palavra, String resposta);

  void termina();

  default boolean aindaTemTentativas() {
    return true;
  }
}
