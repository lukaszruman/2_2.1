import java.util.Scanner;

public class Main {
 
  public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("podaj liczby:");
          int liczba1 = scanner.nextInt();
          int liczba2 = scanner.nextInt();
          int liczba3 = scanner.nextInt();
          int max = liczba1;
          if (liczba2 > max) {
              max = liczba2;
          }
           if (liczba3 > max) {
              max = liczba3;
          }
          System.out.println("największa liczba to: " + max);
      }
  }


  

 
