import exo_1.*;
import exo_2.*;
import exo_3.*;
import exo_4.*;

class Main {
  public static void main(String[] args) {
    int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    TableauInsertion tabtest = new TableauInsertion(test);
    try {
      tabtest.insertTableau(3, 99);
      System.out.println("length : " + tabtest.tableau.length);
      for(int i = 0; i < tabtest.tableau.length ; i++) {
        System.out.println(tabtest.tableau[i]);
      }
    tabtest.insertTableau(10, 30);
    tabtest.insertTableau(30, 21);
    }
    catch (Exception e) {
      System.out.println(e);
    }
  }
}