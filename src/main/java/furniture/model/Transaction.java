/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author khada
 */
public class Transaction {
    List<Integer> id;
    String total;
    String name;
    String phone;
    String address;
    int discount;
    String id_user;

    public Transaction(List<Integer> id, String total, int discount, String id_user) {
        this.id = id;
        this.total = total;
        this.discount = discount;
        this.id_user = id_user;
    }

    public Transaction(List<Integer> id, String total, String name, String phone, String address, int discount, String id_user) {
        this.id = id;
        this.total = total;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.discount = discount;
        this.id_user = id_user;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public List<Integer> getId() {
        return id;
    }

    public void setId(List<Integer> id) {
        this.id = id;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    
}
