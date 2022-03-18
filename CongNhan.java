package baiktracuoiky;

import java.util.Scanner;

public class CongNhan extends CanBo{
    public static final int BAC_MAX = 7;
    
    int bac;

    public CongNhan() {
    }

    public CongNhan(int bac, String fullname, String birthday, String gender, String address) {
        super(fullname, birthday, gender, address);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

  
    public String toString() {
        return super.toString() + ", bac= " + bac;
    }

   
    public void input() {
        super.input();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap bac cong nhan: ");
        bac = Integer.parseInt(scan.nextLine());
    }
}