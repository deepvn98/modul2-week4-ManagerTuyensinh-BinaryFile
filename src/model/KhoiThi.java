package model;

import java.io.Serializable;

public class KhoiThi implements Serializable {
    private String name;
    private String subject1;
    private String subject2;
    private String subject3;

    public KhoiThi(){
    }

    public KhoiThi(String name, String subject1, String subject2, String subject3) {
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    public void showsubject(){
        System.out.printf("\n%-10s %-10s %-10s %-10s", name,subject1,subject2,subject3);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject1() {
        return subject1;
    }

    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }

    public String getSubject2() {
        return subject2;
    }

    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }

    public String getSubject3() {
        return subject3;
    }

    public void setSubject3(String subject3) {
        this.subject3 = subject3;
    }

    @Override
    public String toString() {
        return
                 name ;
//                ", subject1='" + subject1 + '\'' +
//                ", subject2='" + subject2 + '\'' +
//                ", subject3='" + subject3 + '\'' +
//                '}';
    }
}
