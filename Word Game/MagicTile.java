public class MagicTile extends Tile {

  //data members
  private int multiplier;

  //constructor
  public MagicTile(char l, int v, int m) {
    super(l, v * m);
    multiplier = m;
  }

  //methods
  public int getMult() {
    return multiplier;
  }

  public void setMult(int m) {
    multiplier = m;
  }

}