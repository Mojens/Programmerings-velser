package Øvelse2;

import java.util.Random;

public class Raflebæger {
  int antalTerninger;

  public Raflebæger(int antalTerninger) {
    this.antalTerninger = antalTerninger;
  }

  public int ryst() {
    Random ran = new Random();
    int antalØjne = 0;
    for (int i = 0; i < antalTerninger; i++) {
      int terningKast = ran.nextInt(6) + 1;
      antalØjne = antalØjne + terningKast;
    }
    System.out.print(antalØjne);
    return antalØjne;
  }

}
