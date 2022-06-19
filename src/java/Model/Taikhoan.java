/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Taikhoan {
    private String hoten,tendn,email,mk,nlmk;

    public Taikhoan() {
    }
    
    public Taikhoan(String hoten, String tendn, String email, String mk, String nlmk) {
        this.hoten = hoten;
        this.tendn = tendn;
        this.email = email;
        this.mk = mk;
        this.nlmk = nlmk;
    }

    public Taikhoan(String tendn, String mk) {
        this.tendn = tendn;
        this.mk = mk;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getTendn() {
        return tendn;
    }

    public void setTendn(String tendn) {
        this.tendn = tendn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getNlmk() {
        return nlmk;
    }

    public void setNlmk(String nlmk) {
        this.nlmk = nlmk;
    }
    
}
