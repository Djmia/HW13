import java.util.*;
import java.lang.Math;

//може да има няколко играчи,
//всеки от тях хвърля 2 пъти
//печели този който изкара най-висок сбор от двете хвърляния

public class MyClass {
    public static void main(String[] args) {
        
       
      int throw1Player1 = randomWhitRange(1,6);
        System.out.println("Играч 1 - Опит 1: " + throw1Player1);
      int throw2Player1 = randomWhitRange(1,6);
        System.out.println("Играч 2 - Опит 2: " + throw2Player1);
      int resultPlayer1 = throw1Player1 + throw2Player1;
        System.out.println("Сбор на играч 1: ===> " + resultPlayer1 + " #");
      
      System.out.println("========================");  
        
      int throw1Player2 = randomWhitRange(1,6);
        System.out.println("Играч 2 - Опит 1: " + throw1Player2);
      int throw2Player2 = randomWhitRange(1,6);
        System.out.println("Играч 2 - Опит 2: " + throw2Player2);
      int resultPlayer2 = throw1Player2 + throw2Player2;
        System.out.println("Сбор на играч 1: ===> " + resultPlayer2 + " #");
         
      
      System.out.println("========================");  
      
      if (resultPlayer1 > resultPlayer2)  {
        System.out.println("\nПЕЧЕЛИ ---- ИГРАЧ 1");
      } else {
        if (resultPlayer1 == resultPlayer2) {
        System.out.println("\nРЕЗУЛТАТА Е РАВЕН, ОПИТАЙТЕ ПАК");
      } else {
        System.out.println("\nПЕЧЕЛИ ---- ИГРАЧ 2");
      }
      }
      
      
        
    }
    
   
   
    public static int randomWhitRange(int min, int max) {
      
      int range = (max - min) +1; 
      // ако max = 1 и min = 1, тогава разликата е 0, 
      // затова събираме с 1 за да избегнем 0
      return (int)(Math.random()*range) + min;
      
    }
    
    
}