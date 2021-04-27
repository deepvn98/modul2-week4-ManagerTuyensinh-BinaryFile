package storage;

import model.SinhVien;

import java.io.*;
import java.util.ArrayList;

public class FileManager {

    public static void writerFile(ArrayList<SinhVien> sinhViens) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("sinhvien.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(sinhViens);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static ArrayList<SinhVien> readerFile() throws IOException, ClassNotFoundException {
        ArrayList<SinhVien> sinhViens = new ArrayList<>();
        File file = new File("sinhvien.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        if (file.length()>0){
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            sinhViens = (ArrayList<SinhVien>)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }
        return sinhViens;

    }
}
