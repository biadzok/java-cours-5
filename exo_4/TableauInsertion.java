public class TableauInsertion {
  public int[] tableau;

  public TableauInsertion(int[] tableau) {
    this.tableau = tableau;
  }

  public void insertTableau(int i, int x) throws Exception {
    if (i < 0 || i > tableau.length)
      throw new ArrayIndexOutOfBoundsException();
    System.out.println("test, index : " + i);
    int[] res = new int[tableau.length + 1];
    for (int count = tableau.length + 1; count > 0; count--) {
      if (count > i)
        res[count] = tableau[count - 1];
      else
        res[count] = tableau[count];
    }
    res[i] = x;
    tableau = res;
  }
}