public class Word {

  //data members
  private int numLetters;
  private Tile[] letters;


  //constructor
  public Word(int n) {
    numLetters = n;
    letters = new Tile[numLetters];

  }

  //methods
  public int getNumLetters() {
    return numLetters;
  }

  public Tile[] getLetters() {
    return letters;
  }

  public void setNumLetters(int n) {
    numLetters = n;
  }

  public void setLetters(Tile[] l) {
    letters = l;
  }

  public void setSingleLetter(Tile t, int i) {
  letters[i] = t;
  }

}