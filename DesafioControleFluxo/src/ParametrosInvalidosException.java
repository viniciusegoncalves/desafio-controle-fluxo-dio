public class ParametrosInvalidosException extends Exception {
  public ParametrosInvalidosException(int resultado) {
    System.out.println("O primeiro número não pode ser maior que o segundo!");
  }
}
