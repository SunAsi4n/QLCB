package baiktracuoiky;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    static List<CanBo> canBoList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choose;
        
        do {
            showMenu();
            choose = Integer.parseInt(scan.nextLine());
            
            switch(choose) {
                case 1:
                    inputData();
                    break;
                case 2:
                    searchByName();
                    break;
                case 3:
                    showData();
                    break;
                case 4:
                    System.out.println("Thoat!!!");
                    break;
                default:
                    System.out.println("Nhap sai!!!");
                    break;
            }
        } while(choose != 4);
    }
    
    static void showMenu() {
        System.out.println("1. Nhap thong tin moi cho can bo");
        System.out.println("2. Tim kiem theo ten");
        System.out.println("3. Hien thi thong tin");
        System.out.println("4. Thoat");
        System.out.println("Chon: ");
    }

    static void inputData() {
        System.out.println("Nhap so can bo can them: ");
        int n = Integer.parseInt(scan.nextLine());
        
        for (int i = 0; i < n; i++) {
            CanBo canBo = createCanbo();
            
            canBoList.add(canBo);
        }
    }
    
    static CanBo createCanbo() {
        CanBo canBo;
        
        System.out.println("1. Nhap thong tin Cong Nhan");
        System.out.println("2. Nhap thong tin Ky Su");
        System.out.println("3. Nhap thong tin Nhan Vien Phuc Vu");
        System.out.println("Chon: ");
        
        int choose = Integer.parseInt(scan.nextLine());
        
        switch(choose) {
            case 1:
                canBo = new CongNhan();
                break;
            case 2:
                canBo = new KySu();
                break;
            default:
                canBo = new NVPhucVu();
                break;
        }
        canBo.input();
        
        return canBo;
    }

    static void searchByName() {
        System.out.println("Nhap ten can bo can tim kiem: ");
        String fullname = scan.nextLine();
        
        for (CanBo canBo : canBoList) {
            if(canBo.getFullname().equalsIgnoreCase(fullname)) {
                canBo.display();
            }
        }
    }

    static void showData() {
        canBoList.forEach(canBo -> {
            canBo.display();
        });
    }
}
