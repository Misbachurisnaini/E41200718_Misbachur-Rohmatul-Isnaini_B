/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;
import java.util.Scanner;

public class Tarrayrandom {
   public static void main(String[] args){
       
       System.out.println("Tugas 2 :" );
       System.out.println();
       System.out.println("Masukkan berapa banyak random angka :");
       Scanner scan = new Scanner(System.in);
       
       int jumlah = scan.nextInt();
       int[] ar1 = new int[jumlah];
       for (int i = 0; i <ar1.length; i++){
           ar1[i] = (int) (Math.random() * 100);
           System.out.print(ar1[i] + " ");        
       }
       System.out.println();
   }
   
}
