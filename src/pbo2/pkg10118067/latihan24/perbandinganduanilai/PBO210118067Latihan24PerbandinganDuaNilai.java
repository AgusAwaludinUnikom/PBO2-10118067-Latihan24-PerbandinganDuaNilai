/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan24.perbandinganduanilai;

import java.util.Scanner;
/**
 *
 *  Agus Awaludin
 *  IF2
 *  10118067
 *  Latihan ini besisi tentang bagaimana caranya membandingkan besarnya
 *  dua buah nilai
 */
public class PBO210118067Latihan24PerbandinganDuaNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("========Program Perbandingan Nilai========");
        Scanner scanner = new Scanner(System.in);
        
        boolean cukup = false;
        
        while(!cukup){
        System.out.print("Masukkan nilai pertama : ");
        int nilai1 = scanner.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        int nilai2 = scanner.nextInt();
        
        if(nilai1 > nilai2) {
            System.out.println("Hasil : " +nilai1 +" Lebih besar dari "+nilai2);
        } else if(nilai1 < nilai2) {
            System.out.println("Hasil : " +nilai1 +" Lebih kecil dari "+nilai2);
        } else {
            System.out.println("Hasil : " +nilai1 +" Sama dengan "+nilai2);
        }
        System.out.println(" ");
        System.out.print("Ulangi aktifitas? (Ya/Tidak) : ");
        
        if (!scanner.next().equals("Ya")){
            cukup = true;
        
        }
        
        
        
        
        }
        
        
    }
    
}
