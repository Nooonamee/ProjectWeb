/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author VAN TAI
 */
public class Product {
    private String id,ten,loaisp,namsx;
    int slcon;

    public Product() {
    }

    public Product(String id, String ten, String loaisp, String namsx, int slcon) {
        this.id = id;
        this.ten = ten;
        this.loaisp = loaisp;
        this.namsx = namsx;
        this.slcon = slcon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoaisp() {
        return loaisp;
    }

    public void setLoaisp(String loaisp) {
        this.loaisp = loaisp;
    }

    public String getNamsx() {
        return namsx;
    }

    public void setNamsx(String namsx) {
        this.namsx = namsx;
    }

    public int getSlcon() {
        return slcon;
    }

    public void setSlcon(int slcon) {
        this.slcon = slcon;
    }
    
}
