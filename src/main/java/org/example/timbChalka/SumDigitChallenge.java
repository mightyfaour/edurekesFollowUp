package org.example.timbChalka;

public class SumDigitChallenge {
    public static void main(String[] args) {
        sumDigits(125);
        System.out.println("The sum of degits in number 125 is "+sumDigits(125));
    }

    public static int sumDigits (int number){
      if (number < 10){
          return -1;
      }
      int sum = 0;
      while (number > 0){
          int digit = number % 10;
          sum += digit;

          number /= 10;
      }
      return sum;
    }
}
