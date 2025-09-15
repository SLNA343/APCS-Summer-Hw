public class Tester {
       public static void main(String[] args){
            int [] n = {0, 1, 2, 3, 4, 10, 99, 199};
            int [] prime = {2, 3, 5, 7, 11, 31, 541, 1223};
            for (int i = 0; i < n.length; i++) {
                  int num = n[i];
                  int expected = prime[i]; 
                  if (nthPrime(num) == expected) {
                        System.out.println("pass"); 
                  }
                  else {
                        System.out.println("fail expected " + expected + " but value returned was " + nthPrime(num));
                  }
                  
            }
      }

      //return true if and only if x is prime,false otherwise.
      public static boolean isPrime(int x){
      //just check divisibility for all values from `2` through `x - 1` inclusive.
      //(This is not a good algorithm, just use it)
            int div = 2;
            while (div < x) {
                  if (x % div != 0) {
                        div += 1;
                  }
                  else {
                        return false;
                  }
            }
            return true;
      }

      //return the nth prime,
      //e.g. nthPrime(0) returns 2, nthPrime(1) returns 3, etc.
      public static int nthPrime(int n){
      //Loop through values and check if they are prime until you find n of them
      //use your isPrime function.
            int y = -1;
            int z = 1;
            while (y < n) {
                  z += 1;
                  if (isPrime(z)) {
                  y += 1;
                  }
            }
            return z;
      } 
}
