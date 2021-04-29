package model;

import java.io.Serializable;
import java.util.Scanner;

public class SinhVien implements Serializable {
    private static final long serialVersionUID =1L;
    private String id;
    private String name;
    private int age;
    private String  address;
    private KhoiThi khoiThi;

    public SinhVien(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public SinhVien(String id, String name, int age, String address, KhoiThi khoiThi) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.khoiThi = khoiThi;
    }

    public SinhVien() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public KhoiThi getKhoiThi() {
        return khoiThi;
    }

    public void setKhoiThi(KhoiThi khoiThi) {
        this.khoiThi = khoiThi;
    }
    public void show(){
        System.out.printf("\n\t\t%-20s %-20s %-10d %-20s %-20s",id,name,age,address,khoiThi);
    }

//    @Override
//    public String toString() {
//        return "SinhVien{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", address='" + address + '\'' +
//                ", khoiThi=" + khoiThi +
//                '}';
//    }
}
