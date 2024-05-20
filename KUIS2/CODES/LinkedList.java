package Algoritma.KUIS2.CODES;

import java.util.Scanner;

public class LinkedList {
  private Node head;

  public LinkedList() {
    this.head = null;
  }

  public void addDriver(Driver driver) {
    Node newNode = new Node(driver);
    if (head == null || head.data.getPoints() < driver.getPoints()) {
      newNode.next = head;
      head = newNode;
    } else {
      Node current = head;
      while (current.next != null && current.next.data.getPoints() >= driver.getPoints()) {
        current = current.next;
      }
      newNode.next = current.next;
      current.next = newNode;
    }
  }

  public void updatePoints(String name, int points) {
    Node current = head;
    while (current != null) {
      if (current.data.getName().equals(name)) {
        current.data.addPoints(points);
        sortList();
        return;
      }
      current = current.next;
    }
  }

  private void sortList() {
    if (head == null || head.next == null)
      return;

    Node sortedList = null;
    Node current = head;

    while (current != null) {
      Node next = current.next;
      sortedList = insertSorted(sortedList, current);
      current = next;
    }

    head = sortedList;
  }

  private Node insertSorted(Node head, Node newNode) {
    if (head == null || head.data.getPoints() < newNode.data.getPoints()) {
      newNode.next = head;
      return newNode;
    }

    Node current = head;
    while (current.next != null && current.next.data.getPoints() >= newNode.data.getPoints()) {
      current = current.next;
    }
    newNode.next = current.next;
    current.next = newNode;

    return head;
  }

  public void printLeaderboard() {
    Node current = head;
    int i = 1;
    System.out.println("==============================================");
    System.out.println("|          HASIL AKHIR DATA BALAPAN          |");
    System.out.println("----------------------------------------------");
    System.out.printf("| %-7s | %-20s | %-9s |\n", "Posisi", "Nama Pembalap", "Poin");
    System.out.println("----------------------------------------------");
    while (current != null) {
      System.out.printf("| %-7d | %-20s | %-9d |\n", i, current.data.getName(), current.data.getPoints());
      current = current.next;
      i++;
    }
    System.out.println("==============================================");
  }

  public static void inputRaceResults(Scanner scanner, LinkedList leaderboard, Driver[] drivers,
      RaceResult[] raceResults, int raceId) {
    String raceName = getRaceName(raceId);
    int[] racePositions = new int[drivers.length];

    for (int i = 0; i < drivers.length; i++) {
      System.out.print("| Masukkan Posisi " + drivers[i].getName() + ": ");
      int position = scanner.nextInt();
      if (position >= 1 && position <= drivers.length) {
        racePositions[position - 1] = i; 
      } else {
        System.out.println("Posisi tidak valid. Harus antara 1 dan " + drivers.length);
        i--; 
      }
    }

    System.out.println("----------------------------------------------");
    System.out.print("| Pembalap Lap Tercepat: ");
    scanner.nextLine(); 
    String fastestLapDriverName = scanner.nextLine();

    raceResults[raceId - 1] = new RaceResult(raceName, racePositions, fastestLapDriverName);
    distributePoints(leaderboard, drivers, raceResults[raceId - 1]);
  }

  public static void distributePoints(LinkedList leaderboard, Driver[] drivers, RaceResult raceResult) {
    int[] points = { 25, 18, 15, 12, 10, 8, 6, 4, 2, 1 }; 

    for (int i = 0; i < raceResult.getPositions().length; i++) {
      int driverIndex = raceResult.getPositions()[i];
      if (driverIndex >= 0 && driverIndex < drivers.length) {
        int point = (i < points.length) ? points[i] : 0;
        leaderboard.updatePoints(drivers[driverIndex].getName(), point);
      }
    }

    for (Driver driver : drivers) {
      if (driver.getName().equals(raceResult.getFastestLapDriver())) {
        leaderboard.updatePoints(driver.getName(), 1);
      }
    }
  }
  public void printTop10() {
    Node current = head;
    int i = 1;
    System.out.println("==============================================");
    System.out.println("|           DATA PEMENANG 10 BESAR           |");
    System.out.println("----------------------------------------------");
    System.out.printf("| %-7s | %-20s | %-9s |\n", "Posisi", "Nama Pembalap", "Poin");
    System.out.println("----------------------------------------------");
    while (current != null && i <= 10) {
        System.out.printf("| %-7d | %-20s | %-9d |\n", i, current.data.getName(), current.data.getPoints());
        current = current.next;
        i++;
    }
    System.out.println("==============================================");
}


  public static String getRaceName(int raceId) {
    switch (raceId) {
      case 1:
        return "Bahrain Grand Prix";
      case 2:
        return "Saudi Arabia Grand Prix";
      case 3:
        return "Australia Grand Prix";
      case 4:
        return "Azerbaijan Grand Prix";
      case 5:
        return "Miami Grand Prix";
      case 6:
        return "Monaco Grand Prix";
      case 7:
        return "Spain Grand Prix";
      case 8:
        return "Canada Grand Prix";
      case 9:
        return "Austria Grand Prix";
      case 10:
        return "Great Britain Grand Prix";
      case 11:
        return "Hungary Grand Prix";
      case 12:
        return "Belgium Grand Prix";
      case 13:
        return "Netherlands Grand Prix";
      case 14:
        return "Italy Grand Prix";
      case 15:
        return "Japan Grand Prix";
      case 16:
        return "Qatar Grand Prix";
      case 17:
        return "United States Grand Prix";
      case 18:
        return "Mexico Grand Prix";
      case 19:
        return "Brazil Grand Prix";
      case 20:
        return "Las Vegas Grand Prix";
      case 21:
        return "Abu Dhabi Grand Prix";
      case 22:
        return "Singapore Grand Prix";
      default:
        return "Unknown Grand Prix";
    }
  }

  public void printRaceResults(Scanner scanner, RaceResult[] raceResults, String grandPrixName, Driver[] drivers) {
    for (RaceResult raceResult : raceResults) {
        if (raceResult != null && raceResult.getRaceName().equalsIgnoreCase(grandPrixName)) {
            raceResult.printResults(drivers);
            return;
        }
    }
    System.out.println("Data untuk Grand Prix tersebut tidak ditemukan.");
}


}
