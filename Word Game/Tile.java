public class Tile {

  //data members
  private char letter;
  private int value;

  //constructor
  public Tile(char l, int v) {
    letter = l;
    value = v;
  }

  //methods
  public char getLetter() {
    return letter;
  }

  public int getValue() {
    return value;
  }

  public void setLetter(char l) {
    letter = l;
  }

  public void setValue(int v) {
    value = v;
  }
}