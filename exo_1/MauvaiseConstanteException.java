public class MauvaiseConstanteException extends Exception {
  private String message;
  public MauvaiseConstanteException(String message) {
    super(message);
    this.message = message;
  }
}