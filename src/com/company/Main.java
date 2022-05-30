package com.company;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
      public static void main(String[] args) {

        int[] arr = generateRandomArray();
        // zadani 1
          int AllSumm = 0;
     for ( int i = 0; i < arr.length; i++){
          AllSumm += arr[i];
     }
          System.out.println("Сумма трат за месяц составила "+AllSumm+" рублей");
     //zadanie 2
          int MaxSumm = 0;
          int MinSumm = Integer.MAX_VALUE;
          for (int i = 0; i < arr.length; i++) {
              if (MaxSumm<arr[i]) {
                  MaxSumm = arr[i];
              }
              if ( MinSumm > arr[i]) {
                  MinSumm = arr[i];
              }
          }
          System.out.println("Максимальная сумма трат за день составила "+MaxSumm+" рублей");
          System.out.println("Минимальная сумма трат за день составила "+MinSumm+" рублей");
          //zadanie 3
          double AllSumm2 = (int) AllSumm;
double MidSumm = AllSumm2 / arr.length;
          System.out.println("Средняя сумма трат за месяц составила "+MidSumm+" рублей");
          //zadanie 4
          char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
          for (int i = reverseFullName.length-1; i >= 0; i--) {
              System.out.print(reverseFullName[i]);// сомневаюсь в правильности такого решения
          }

      }
   }
