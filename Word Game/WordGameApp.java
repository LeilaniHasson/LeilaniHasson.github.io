// Emmy and Leilani
//
// This code has several classes that represent different types of 
// tiles in a word game. Given the imput from words.txt, it will take 
// the commands, process them, and output the corresponding results 
// for it's value depending on what characters are used.


import java.util.Scanner;
import java.io.File;

public class WordGameApp {


  //use data from file to create Word objects
  public static Word getWord(Scanner s) {
    int n = Integer.parseInt(s.nextLine());


    Word thisWord = new Word(n);

    //loop for each tile
    for (int i = 0; i < n; i++) {
      String[] tokens = s.nextLine().split(" ");

      if (tokens[0].equals("L")) {
        thisWord.setSingleLetter(new Tile(tokens[1].charAt(0), Integer.parseInt(tokens[2])), i);
      } else if (tokens[0].equals("M")) {
        thisWord.setSingleLetter(new MagicTile(tokens[1].charAt(0), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3])), i);
      } else if (tokens[0].equals("W")) {
        thisWord.setSingleLetter(new WildTile(tokens[1].charAt(0), Integer.parseInt(tokens[2])), i);
      } else {
        System.out.println("Error: Invalid input.");
      }
      /*
      switch(tokens[0]) {
        case "L":
          thisWord.setSingleLetter(new Tile(tokens[1].charAt(0), Integer.parseInt(tokens[2])), i);
          break;
        case "M":
          thisWord.setSingleLetter(new MagicTile(tokens[1].charAt(0), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3])), i);
          break;
        case "W":
          thisWord.setSingleLetter(new WildTile(tokens[1].charAt(0), Integer.parseInt(tokens[2])), i);
          break;
        default:
          System.out.println("Error: Invalid input.");
      }
      */
    }
  return thisWord;
  }

  //--------------------------------------------------------------------

  public static void processWord(Word w) {
    Tile[] letters = w.getLetters();
    int score = 0;

    //calcualte score
    for (int i = 0; i < letters.length; i++){
      score += letters[i].getValue();
    }

    
    System.out.print("Word: ");
    for (int i = 0; i < letters.length; i++) {
      System.out.print(letters[i].getLetter());
    }
    System.out.print("     Score: " + score);
  }

  //--------------------------------------------------------------------

  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(new File("words.txt"));

      while(scan.hasNextLine() == true) {
        processWord(getWord(scan));
        System.out.println();
      }

      // output screen:
      // Word: ELM  Score:19
      // Word: *OPES  Score:15

    }
    catch(Exception e) {
      System.out.println("Error");
    }
  }
}
