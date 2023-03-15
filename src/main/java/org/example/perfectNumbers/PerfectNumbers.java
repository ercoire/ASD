package org.example.perfectNumbers;


public class PerfectNumbers {

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

   static void getPerfectNumber(int limit) {

      for (int number = 2; number < limit; number += 2) {  //wszystkie l.doskonałe są parzyste
         int sum = 0;
         for (int divider = 1; divider < number; divider++) { //znajdź dzielnik naturalny
            if (number % divider == 0) {
               sum += divider;  //oblicz sumę znalezionych dzielników
            }
         }
         if (sum == number) {       //sprawdź warunek
            System.out.println(number);       //jeśli spełniony to wypisz
         }
      }
   }
}

