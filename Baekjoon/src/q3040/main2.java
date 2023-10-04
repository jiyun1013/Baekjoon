package q3040;

import java.util.Scanner;

public class main2 {

   public static void main(String[] args) {
      int arr[] = new int[9];// 9명의 난쟁이
      int sum = 0; // sum- 100;
      Scanner sc = new Scanner(System.in);

      // 9명의 난쟁이의 총 값
      for (int i = 0; i < 9; i++) {
         arr[i] = sc.nextInt();
         sum = +arr[i];
      }
      sc.close();
      // 두 명의 가짜난쟁이 총합
      sum = sum - 100;

      // 가짜 두 명 찾기
      for (int i = 0; i < 8; i++) {
         for (int j = 0 + 1; j < 9; j++) {
            int c = arr[i] + arr[j];
            if (sum == c) {
               arr[i] = 0;
               arr[j] = 0;
               i++;
               j++;
            }

         }
         if (arr[i] > 0) { // 여기를 모르겠어요
            System.out.println(arr[i]);

         }
      }
   }
}