public class DivisionParZero {
  public double nombre;

  public DivisionParZero(double nombre) {
    this.nombre = nombre;
  }

  public int inverse() {
    try {
      int res = (int)nombre;
      return 1 / res;
    }
    catch (Exception e) {
      return 0;
    }
  }
}