package view;

import controller.ManagerSinhVien;
import model.KhoiThi;
import model.SinhVien;
import storage.FileManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static KhoiThi khoiA = new KhoiThi("Khối A","Toán","Lý","Hoá");
    public static KhoiThi khoiB = new KhoiThi("Khối B","Toán","Anh","Văn");
    public static KhoiThi khoiC = new KhoiThi("Khối C","Sinh","Sử","Địa");
    public static void main(String[] args) {
        ArrayList<SinhVien> sinhViens = null;
        try {
            sinhViens = FileManager.readerFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//Them sinh vien va doc vao file
        ManagerSinhVien manager = new ManagerSinhVien("Nguyen Sang",sinhViens);
        SinhVien sinhVien = newSinhVien();
        try {
            manager.addSinhVien(sinhVien);
        } catch (IOException e) {
            e.printStackTrace();
        }
        manager.showInfor();


    }
    public static SinhVien newSinhVien(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id :");
        String id = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter name  :");
        String name = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter age :");
        int age = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter Address :");
        String address = scanner3.nextLine();
        SinhVien sinhVien =new SinhVien(id,name,age,address);
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Nhập A nếu thi khối A.\nB nếu thi khối B.\nC nếu thi khối C.");
        System.out.print("Enter ExamBlock :");
        String examBlock = scanner4.nextLine();
        switch (examBlock){
            case "A":
                {sinhVien.setKhoiThi(khoiA);
                    break;
                }
            case "B":
                {sinhVien.setKhoiThi(khoiB);
                  break;
                }
            case "C":
            {sinhVien.setKhoiThi(khoiC);
                break;
            }
            default:
                break;
        }
        return sinhVien;
    }

}
