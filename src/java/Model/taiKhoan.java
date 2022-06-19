/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class taiKhoan {
    private String id,ten,user_name,password,soDienThoai,diaChi,loai;

    public taiKhoan() {
    }

    public taiKhoan(String id, String ten, String user_name, String password, String soDienThoai, String diaChi, String loai) {
        this.id = id;
        this.ten = ten;
        this.user_name = user_name;
        this.password = password;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.loai = loai;
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

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    @Override
    public String toString() {
        return "taiKhoan{" + "id=" + id + ", ten=" + ten + ", user_name=" + user_name + ", password=" + password + ", soDienThoai=" + soDienThoai + ", diaChi=" + diaChi + ", loai=" + loai + '}';
    }
    
    
    
}
