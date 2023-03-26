package org.example.fibonacci;

public class FibonacciSequence {

   public static void main(String[] args) {
      fibonacciAll(69);
      fibonacci(69);
      fibonacci(13);
      fibonacci(21);
   }

   static void fibonacciAll(int limit) {
      System.out.println(1);
      if (limit >= 2) {
         System.out.println(1);
      }
      long a = 1;
      long b = 1;
      int counter = 3;
      while (counter <= limit) {
         long c = a + b;
         System.out.println(c);
         counter++;
         a = b;
         b = c;
      }
   }

   static void fibonacci(int value) {
      if (value == 1) {
         System.out.println(1);
      }
      if (value == 2) {
         System.out.println(1);
      }
      if (value >= 3) {
         long a = 1;
         long b = 1;
         int counter = 3;
         while (counter <= value) {
            long c = a + b;
            counter++;
            a = b;
            b = c;
         }
         System.out.println(b);
      }
   }

   }
