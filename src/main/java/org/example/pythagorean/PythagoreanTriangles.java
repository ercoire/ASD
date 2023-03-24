package org.example.pythagorean;

public class PythagoreanTriangles {

   public static void main(String[] args) {
//a^2 + b^2 = c^2 oraz a,b,c są naturalne

      System.out.println("Pythagorean triangles with sides shorter than 10:");
      printPythagoreanTriangles(10);
      System.out.println();
      System.out.println("Pythagorean triangles with sides shorter than 100:");
      printPythagoreanTriangles(100);
      System.out.println();
      System.out.println("Pythagorean triangles with sides shorter than 1000:");
      printPythagoreanTriangles(1000);
   }

   static boolean isPythagorean(int a, int b, int c) {
      int sum = a * a + b * b;
      if (sum == c*c) {
         return true;
      }
      return false;
   }

   static void printPythagoreanTriangles(int limit) {
      for (int a = 1; a < limit; a++) {
         for (int b = a + 1; b < limit; b++) {
            for (int c = b + 1; c < limit; c++) {
               if (isPythagorean(a, b, c)) {
                  System.out.println("Triangle: " + a + " , " + b + " , " + c);
            }
         }
      }
   }

               }


}
