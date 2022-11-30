public class DateJour {
  public int jour;
  public int mois;
  public int annee;

  public DateJour(int jour, int mois, int annee) throws Exception {
    if (jour > 30 || mois > 12)
      throw new Exception("ça marche pas, ¯\\_(ツ)_/¯");
    this.jour = jour;
    this.mois = mois;
    this.annee = annee;
  }}
