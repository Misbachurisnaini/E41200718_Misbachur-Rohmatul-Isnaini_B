/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author HP
 */
public class Tarray2d {
    // membuat metod
    public static void main(String[] args) {
        
        int [][] angka = {
            {5,6,1,7},
            {8,1,2,9},
            {5,4,1,7},
            {8,3,7,5},
        };
        System.out.println("Ini adalah Tugas Array 2 Dimensi :");
        
        for (int i = 0; i<4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(angka[i][j] + "");
            }
            System.out.println("");
        }
    }
}
