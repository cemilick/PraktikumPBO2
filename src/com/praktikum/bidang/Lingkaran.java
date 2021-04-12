/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.praktikum.bidang;

/**
 *
 * @author cemil
 */
public class Lingkaran implements MenghitungBidang {
    protected int jari2;

    public int getJari2() {
        return jari2;
    }

    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
    
    public Lingkaran(int jari2) {
        this.jari2 = jari2;
    }

    
    @Override
    public double luas() {
        return ((double) 22/7) * this.jari2 * this.jari2; 
    }

    @Override
    public double keliling() {
        return ((double) 22/7) * this.jari2 * 2;
    }
    
}
