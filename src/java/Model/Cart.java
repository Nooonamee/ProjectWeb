/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Admin
 */
public class Cart {
    private String id;
    private String idProduct;
    private String createDate;
    private String idUser, ten; 

    public Cart(String id, String idProduct,String idUser, String createDate, String ten) {
        this.id = id;
        this.idProduct = idProduct;
        this.idUser = idUser;
        this.createDate = createDate;
        this.ten = ten;
    }

    public Cart() {
         
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdUser() {
        return idUser;
    }

    public String getId() {
        return id;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Cart{" + "id=" + id + ", idProduct=" + idProduct + ", createDate=" + createDate + ", idUser=" + idUser + '}';
    }
    
    
}
