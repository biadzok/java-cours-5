import exo_1.*;
import exo_2.*;

class Main {
  public static void main(String[] args) {
    DivisionParZero test = new DivisionParZero(0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001);
    System.out.println(test.inverse());
    System.out.println(test.nombre);
  }
}