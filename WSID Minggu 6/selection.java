/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class selection {
  public static void main(String[] args) {
         //Deklarasi Array bertipe integer dengan nama numbers dengan panjang 10
        int[] numbers = new int[10];

        //Melakukan perulangan untuk memasukkan nilai kedalam array sebanyak 10 nilai 
        for (int i = 0; i < numbers.length; i++) {
            //memasukkan kedalam masing2 nilai menggunakan index dengan nilai random
            //0 - 20
            numbers[i] = (int) (Math.random() * 20);
        }
        //Menampilkan Semua data Array
        System.out.println("Unordered list of my array");

        //Menggunakan Foreach untuk menampilkan data array
        for (int i : numbers) {
            System.out.println(i);
        }
        //Memanggil method selectionSort
        selectionSort(numbers);
         //Menampilkan Semua data Array
        System.out.println("Ordered list of my array");
        
        //Menggunakan Foreach untuk menampilkan data array
        for (int i : numbers) {
            System.out.println(i);
        }
    }
    static void selectionSort(int[] numbers) {
        int indexMin = 0; //the index of the smallest number
        for (int i = 0; i < numbers.length; i++) {
            indexMin = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[indexMin]) {//if we find a smaller int, 
                    indexMin = j; //set it as the min
                }//endif
            }//endfor
            //we have the index of the smallest int and can swap the values
            int temp = numbers[i]; //use temp to store the value
            numbers[i] = numbers[indexMin];
            numbers[indexMin] = temp;
        }//endfor
    }//end method selectionSort
    }


