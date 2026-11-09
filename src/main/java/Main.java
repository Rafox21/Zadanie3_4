// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
  
      
      Scanner scanner = new Scanner(System.in);

      System.out.print("Podaj liczbę n : ");
      if (!scanner.hasNextInt()) 
      {
          System.out.println("Błąd: To nie jest liczba calkowita.");
          scanner.close();
          return;
      }

      int n = scanner.nextInt();

      if (n < 0) 
      {
          System.out.println("Liczba nie moze byc ujemna");
      } 
      else {
          int wynik = 1;
          for (int i = 2; i <= n; i++) {
              wynik *= i;
          }
          System.out.println(n + "! = " + wynik);
      }

      scanner.close();

      
      
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}