package org.example.primeNumbers;

public class PrimeNumbersExtended {
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

   static boolean isPrime(int number) {
      int counter = 0;
      boolean isPrime = false;
      for (int f = 2; f < number; f++) {
         if (number % f == 0) {
            counter++;
         }
      }
      if (counter == 0) {
         isPrime = true;
      }
      return isPrime;
   }

   static void getPrimeNumbers(int limit) {

      for (int number = 2; number < limit; number++) {
         if (isPrime(number))
            System.out.println(number);
      }

   }

}


