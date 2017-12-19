package oop_lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//สร้าง method สำหรับรับค่าข้อมูลนักศึกษาประกอบด้วย
//1. ชื่อ-สกุล
//2. ที่อยู่
//3.รหัสนักศึกษา
//4. สาขาและมหาวิทยาลัย
//5.email


public class StudentData {
    public static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public static String getName ()throws IOException {
        System.out.println("Enter you name: ");
        return reader.readLine();
    }


    public static String getAddress ()throws IOException {
        System.out.println("Enter you address: ");
        return reader.readLine();

    }
    public static String getfaculty ()throws IOException {
        System.out.println("Enter you faculty: ");
        return reader.readLine();
    }

    public static String getStuID ()throws IOException {
        System.out.println("Enter you StuID: ");
        return reader.readLine();
    }


    public static String getemail ()throws IOException {
        System.out.println("Enter you email: ");
        return reader.readLine();
    }

    public static void main (String[] args) throws IOException{
        String name = getName();
        String address = getAddress();
        String id = getStuID();
        String fac =getfaculty();
        String email =getemail();
        System.out.println(name+"\n"+address+"\n"+id+"\n"+fac+"\n"+email);
        System.out.println(getName()+"\n"+getAddress());
    }
}
