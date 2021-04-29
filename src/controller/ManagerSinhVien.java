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
        FileManager fileManager = FileManager.getINTANCE("Sang");
        fileManager.writerFile(sinhViens);

    }
    public void editSinhVien(int index, SinhVien sinhVien) throws IOException {
        sinhViens.set(index,sinhVien);
        FileManager fileManager = FileManager.getINTANCE("Sang");
        fileManager.writerFile(sinhViens);
    }
    public void deleteSinhVien(int index) throws IOException {
        sinhViens.remove(index);
        FileManager fileManager = FileManager.getINTANCE("Sang");
        fileManager.writerFile(sinhViens);
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
//    Tìm kiếm sinh viên
    public SinhVien getSinhvienById(String name){
        SinhVien v1 = null;
        for (int i = 0; i < sinhViens.size(); i++){
            if (name.equalsIgnoreCase(sinhViens.get(i).getName())){
                v1= sinhViens.get(i);
                break;}
        }
        return v1;
    }

    public void setSinhViens(ArrayList<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }

    public void showInfor(){
        System.out.printf("\n\t\t%-20s %-20s %-10s %-20s %-20s","ID","Name","Age","Address","ExamBlock");
        for (int i = 0 ; i < sinhViens.size(); i ++){
            sinhViens.get(i).show();

        }
    }
}
