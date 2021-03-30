/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;
import java.util.Scanner;

public class T1For {
 
  public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      int awal, akhir;
      
      System.out.print("Masukkan Angka Pertama : ");
      awal = scan.nextInt();
      
      System.out.print("Masukkan Angka Terakhir : ");
      akhir = scan.nextInt();
      
      for(int i = awal; i < akhir; i++){
          if (i % 2==0)
              System.out.print(i+ " ");
      }
        System.out.print("");
  }
}


