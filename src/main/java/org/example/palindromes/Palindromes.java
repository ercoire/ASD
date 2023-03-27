package org.example.palindromes;

public class Palindromes {
   public static void main(String[] args) {

      //String testedString = "owocowo";
      printPalindromeCheckResult ("palindrome");
      printPalindromeCheckResult("owocowo");

   }

   static boolean palindromeCheck(String testedString) {
      char[] array = testedString.toCharArray();
      int lastChar = array.length - 1;
      for (int index = 0; index <= lastChar; index++, lastChar--) {
         if (array[index] != array[lastChar]) {
            return false;
         }
      }
      return true;
   }

   static void printPalindromeCheckResult(String testedString) {
      boolean result = palindromeCheck(testedString);
      if (result) {
         System.out.println("Yes");
      } else {
         System.out.println("No");
      }

   }

}
