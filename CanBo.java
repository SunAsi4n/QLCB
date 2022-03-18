package baiktracuoiky;

import java.util.Scanner;

public class CanBo {
    String fullname, birthday, gender, address;

    public CanBo() {
    }

    public CanBo(String fullname, String birthday, String gender, String address) {
        this.fullname = fullname;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    public String toString() {
        return "fullname=" + fullname + ", birthday=" + birthday + ", gender=" + gender + ", address=" + address;
    }
    
    public void display() {
        System.out.println(this);
    }
    
    public void input() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nhap ten: ");
        fullname = scan.nextLine();
        
        System.out.println("Nhap nam sinh: ");
        birthday = scan.nextLine();
        
        System.out.println("Nhap gioi tinh: ");
        gender = scan.nextLine();
        
        System.out.println("Nhap dia chi: ");
        address = scan.nextLine();
    }
}