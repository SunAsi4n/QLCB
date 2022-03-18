package baiktracuoiky;

import java.util.Scanner;

public class KySu extends CanBo{
    String nganh;

    public KySu() {
    }

    public KySu(String nganh, String fullname, String birthday, String gender, String address) {
        super(fullname, birthday, gender, address);
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

   
    public String toString() {
        return super.toString() + ", nganh= " + nganh;
    }

  
    public void input() {
        super.input(); 
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap nganh: ");
        nganh = scan.nextLine();
    }
    
}