/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class sanPham {
    private int id;
    private String ten;
    private String moTa;
    private String loai;
    private String mau;
    private int gia;
    private int soLuong;
    private int daBan;

    public sanPham() {
    }

    public sanPham(int id, String ten, String moTa, String loai, String mau, int gia, int soLuong, int daBan) {
        this.id = id;
        this.ten = ten;
        this.moTa = moTa;
        this.loai = loai;
        this.mau = mau;
        this.gia = gia;
        this.soLuong = soLuong;
        this.daBan = daBan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDaBan() {
        return daBan;
    }

    public void setDaBan(int daBan) {
        this.daBan = daBan;
    }

    @Override
    public String toString() {
        return "sanPham{" + "id=" + id + ", ten=" + ten + ", moTa=" + moTa + ", loai=" + loai + ", mau=" + mau + ", gia=" + gia + ", soLuong=" + soLuong + ", daBan=" + daBan + '}';
    }
    
    

   
    
}

