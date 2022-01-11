package Øvelse3;

import java.util.Random;

public class Card {
  String [] suit = {"Hearts", "Diamonds", "Spades", "Clubs"};
  int [] value = {1,2,3,4,5,6,7,8,9,10,11,12,13};

  public void beats(){

    Random rand = new Random();

    int randomSuit = rand.nextInt(4);
    int randomValue = rand.nextInt(13);
    String computer1Suit = suit[randomSuit];
    int computer1Value = value[randomValue];

    int random2Suit = rand.nextInt(4);
    int random2Value = rand.nextInt(13);
    String computer2Suit = suit[random2Suit];
    int computer2Value = value[random2Value];



    if (computer1Suit.equals(suit[0]) & computer2Suit.equals(suit[1]) || computer1Suit.equals(suit[1]) & computer2Suit.equals(suit[2]) || computer1Suit.equals(suit[2]) & computer2Suit.equals(suit[3])){

    }else if (computer1Value < computer2Value){
   System.out.print("card 2:");
   System.out.print(" " + computer2Suit);
   System.out.println(computer2Value);
      System.out.print("Card 1:");
      System.out.print(computer1Suit);
      System.out.println(" " + computer1Value);
      System.out.println("Card 2 won");

    }else if (computer1Value > computer2Value){
   System.out.print("card 1:");
   System.out.print(" " + computer1Suit);
   System.out.println(computer1Value);
      System.out.print("card 2:");
      System.out.print(" " + computer2Suit);
      System.out.println(computer2Value);
      System.out.println("Card 1 won");
    }
  }

}
