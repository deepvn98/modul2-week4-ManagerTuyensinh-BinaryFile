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
        final ManagerSinhVien manager = new ManagerSinhVien("Nguyen Sang",sinhViens);
//Them sinh vien va doc vao file
//        SinhVien sinhVien = newSinhVien();
//        try {
//            manager.addSinhVien(sinhVien);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        manager.showInfor();
        menuManagerSinhVien(manager);

    }
    public static void menuManagerSinhVien(ManagerSinhVien managerSinhVien){
        boolean choice = true;
        int number = 0;
        int[] arr;
        displayMenu.displayMenu();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println();
            System.out.print("Nhập vào lựa chọn của bạn: ");
            int enter = scanner.nextInt();
            switch (enter){
                case 1:
                {
                    System.out.print("Số lượng sinh viên muốn thêm: ");
                    number = scanner.nextInt();
                    arr=new  int[number];
                    for (int i = 0; i< arr.length; i++){
                        System.out.println("Sinh viên "+(i+1));
                        SinhVien sinhVien = newSinhVien();
                        try {
                            managerSinhVien.addSinhVien(sinhVien);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                }
                case 2:
                {
                    break;
                }
                case 3:
                {

                }
                case 4:
                {
                    managerSinhVien.showInfor();
                    break;
                }
                case 5:
                {
                    choice=false;
                    break;
                }
            }
        }while (choice);

    }
//  THEM SINH VIEN
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
//    SUA THONG TIN SINH VIEN
    public void editInforSinhVien(ArrayList<SinhVien>sinhViens){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tìm kiếm theo ID sinh viên: ");
        String id = scanner.nextLine();
        for (int i = 0; i< sinhViens.size(); i++){
            if (id.equalsIgnoreCase(sinhViens.get(i).getId())){

            }
        }
    }
}