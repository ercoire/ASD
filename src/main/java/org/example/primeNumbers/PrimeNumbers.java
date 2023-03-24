package org.example.primeNumbers;

//prime numbers 1-100 using single class
public class PrimeNumbers {

   public static void main(String[] args) {

      System.out.println("Print prime numbers 1-10");
      getPrimeNumbers(10);
      System.out.println();
      System.out.println("Print prime numbers 1-100");
      getPrimeNumbers(100);
      System.out.println();
      System.out.println("Print prime numbers 1-1000");
      getPrimeNumbers(1000);

   }

   static void getPrimeNumbers(int limit) {


      for (int a = 2; a < limit; a++) {
         int counter = 0;
         for (int f = 2; f < a; f++) {
            if (a % f == 0) {
               counter++;
            }
         }
         if (counter == 0) {
            System.out.println(a);
         }

      }

   }
}
