package Algoritma.KUIS2.CODES;

public class Driver {
  private String name;
  private int points;
  private int totalPoin;

  public Driver(String name) {
      this.name = name;
      this.points = 0;
  }

  public String getName() {
      return name;
  }

  public int getPoints() {
      return points;
  }

  public void addPoints(int points) {
      this.points += points;
  }

  public void resetPoints(int points) {
      this.points = points;
  }
}

