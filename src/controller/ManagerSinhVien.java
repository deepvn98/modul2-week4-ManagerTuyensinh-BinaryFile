package controller;

import model.SinhVien;
import storage.FileManager;

import java.io.IOException;
import java.util.ArrayList;

public class ManagerSinhVien {
    private String name;
    private ArrayList<SinhVien> sinhViens;

    public ManagerSinhVien() {
    }

    public ManagerSinhVien(String name, ArrayList<SinhVien> sinhViens) {
        this.name = name;
        this.sinhViens = sinhViens;
    }
    public void addSinhVien(SinhVien sinhVien) throws IOException {
        sinhViens.add(sinhVien);
        FileManager.writerFile(sinhViens);

    }
    public void editSinhVien(SinhVien sinhVien,int index){
        sinhViens.set(index,sinhVien);
    }
    public void deleteSinhVien(int index,SinhVien sinhVien) throws IOException {
        sinhViens.set(index,sinhVien);
        FileManager.writerFile(sinhViens);
    }
    public void deleteSinhVien(int index) throws IOException {
        sinhViens.remove(index);
        FileManager.writerFile(sinhViens);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(ArrayList<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }
//    public void showInfor(){
//        for (SinhVien s:sinhViens
//             ) {
//            System.out.println(s);
//        }
//    }

    public void showInfor(){
//        System.out.printf("\n\t\t%-20s %-20s %-20s %-20s %-20s","ID","Name","Age","Address","ExamBlock");
        for (int i = 0 ; i < sinhViens.size(); i ++){
//            sinhViens.get(i).show();
            System.out.println(sinhViens.get(i));

        }
    }
}
