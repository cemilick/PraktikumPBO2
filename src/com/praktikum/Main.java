/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.praktikum;
import com.praktikum.ruang.Balok;
import com.praktikum.ruang.Kerucut;
import java.util.Scanner;

/**
 *
 * @author cemil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean keluar = false;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("-------- TUGAS PRAKTIKUM PBO 2 -------");
            System.out.println("-------- 123190079 | Cemilick  -------");
            System.out.println("-------- --------------------- -------");
            
            switch(menu()){
                case 1:
                    balok(input);
                    break;
                case 2:
                    kerucut(input);
                    break;
                case 3:
                    keluar = true;
                    break;
            }
            System.out.print("\n\n\n");
        } while(!keluar);
    }
    
    public static int menu(){
        Scanner menu = new Scanner(System.in);
        
        System.out.println("1. BALOK");
        System.out.println("2. KERUCUT");
        System.out.println("3. KELUAR");
        System.out.print("PILIH = ");
        
        return menu.nextInt();
    }
    
    public static void balok(Scanner input){
        int panjang,lebar,tinggi,jari2;
        
        System.out.print("-------INPUT-------\n -PANJANG : ");
        panjang = input.nextInt();
        System.out.print(" -LEBAR : ");
        lebar = input.nextInt();
        System.out.print(" -TINGGI : ");
        tinggi = input.nextInt();
        Balok balok = new Balok(panjang,lebar,tinggi);
        
        System.out.println("-------OUTPUT--------");
        System.out.println("LUAS PERSEGI = " + balok.luas());
        System.out.println("KELILING PERSEGI = " + balok.keliling());
        System.out.println("VOLUME BALOK = " + balok.volume());
        System.out.println("LUAS PERMUKAAN BALOK = " + balok.luasPermukaan());
    }
    
    public static void kerucut(Scanner input){
        int panjang,lebar,tinggi,jari2;
        
        System.out.print("-------INPUT-------\n -JARI - JARI : ");
        jari2 = input.nextInt();
        System.out.print(" -TINGGI : ");
        tinggi = input.nextInt();
        Kerucut kerucut = new Kerucut(jari2,tinggi);
        
        System.out.println("-------OUTPUT--------");
        System.out.println("LUAS LINGKARAN = " + kerucut.luas());
        System.out.println("KELILING LINGKARAN = " + kerucut.keliling());
        System.out.println("VOLUME KERUCUT = " + kerucut.volume());
        System.out.println("LUAS PERMUKAAN KERUCUT = " + kerucut.luasPermukaan());
    }
}
