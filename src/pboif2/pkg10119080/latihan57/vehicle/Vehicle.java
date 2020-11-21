/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan57.vehicle;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Vehicle
 */
public class Vehicle {
    private String myBrand, myModel;
    
    public Vehicle() {
    }
    
    public String getBrand() {
        return this.myBrand;
    }
    
    public void setBrand(String brand) {
        this.myBrand = brand;
    }
    
    public String getModel() {
        return this.myModel;
    }
    
    public void setModel(String model) {
        this.myModel = model;
    }
    
}