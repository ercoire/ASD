package org.example.perfectNumbers;

public class PerfectNumbersExtended {

   public static void main(String[] args) {

      System.out.println("Print prime numbers 1-100");
      getPerfectNumber(100);
      System.out.println();
      System.out.println("Print prime numbers 1-100");
      getPerfectNumber(1000);
      System.out.println();
      System.out.println("Print prime numbers 1-1000");
      getPerfectNumber(10000);

   }

   static boolean isPerfect (int number) {  //warunek 'isPerfect' jako metoda

      int sum = 0;
      boolean isPerfect = false;
      for (int divider = 1; divider < number; divider++) { //znajdź dzielnik naturalny
         if (number % divider == 0) {
            sum += divider;  //oblicz sumę znalezionych dzielników
         }
      }
      if (sum == number) {
         isPerfect = true;
      }
         return isPerfect;
   }

   static void getPerfectNumber(int limit) {
      for (int number = 1; number < limit; number += 1) {
         if(isPerfect(number)){
            System.out.println(number);      //jeśli spełniony to wypisz
         }
      }
   }
}



