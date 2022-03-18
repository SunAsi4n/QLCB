package baiktracuoiky;

import java.util.Scanner;

public class NVPhucVu extends CanBo{
    String congViec;

    public NVPhucVu() {
    }

    public NVPhucVu(String congViec, String fullname, String birthday, String gender, String address) {
        super(fullname, birthday, gender, address);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

   
    public String toString() {
        return super.toString() + ", cong viec= " + congViec;
    }

    
    public void input() {
        super.input();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap cong viec: ");
        congViec = scan.nextLine();
    }
    
}
