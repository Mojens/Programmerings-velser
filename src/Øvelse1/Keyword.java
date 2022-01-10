package Øvelse1;

import java.util.Scanner;

public class Keyword {
  String word = "Dance";
  String definition = "Shake";
  String[] seeAlso = {"Eat", "Game", "Sleep", "Fight", "Shit"};

  public boolean matches() {
    Scanner input = new Scanner(System.in);
    String personInput = input.nextLine();
    if (personInput.equalsIgnoreCase(word)) {
      System.out.print("true");
      return true;
    } else if (personInput.equalsIgnoreCase(definition)) {
      System.out.print("true");
      return true;
    }
    for (int i = 0; i < seeAlso.length; i++) {
      if (personInput.equalsIgnoreCase(seeAlso[i])) {
        System.out.print("True");
        return true;
      }
    }
    System.out.print("false");
    return false;
  }
}

