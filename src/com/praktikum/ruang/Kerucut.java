/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.praktikum.ruang;

import com.praktikum.bidang.Lingkaran;

/**
 *
 * @author cemil
 */
public class Kerucut extends Lingkaran implements MenghitungRuang{
    private int tinggi;

    public Kerucut(int jari2, int tinggi) {
        super(jari2);
        this.tinggi = tinggi;
    }    

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return ((double)1/3) * this.luas() * this.tinggi;
    }

    @Override
    public double luasPermukaan() {
        int r = this.jari2;
        int t = this.tinggi;
        double s = Math.sqrt((r*r)+(t*t));
        return 22/7 * r * (r + s);
    }
}
