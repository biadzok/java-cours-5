public class EntierNaturel {
  private int naturel;

  public EntierNaturel(int naturel) throws MauvaiseConstanteException {
    if (naturel < 0) {
      throw new MauvaiseConstanteException("Entier négatif non autorisé");
    }
    this.naturel = naturel;
  }

  public int getNaturel() {
    return this.naturel;
  }
}