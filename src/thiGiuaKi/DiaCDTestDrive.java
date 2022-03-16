package thiGiuaKi;
import org.w3c.dom.ls.LSOutput;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class DiaCDTestDrive {
    static Scanner sc = new Scanner(System.in);
    static void nhapAlbum(DiaCD ab) {
        System.out.print("Nhap ma CD: ");
        ab.setMaCD(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ten CD : ");
        ab.settuaCD(sc.nextLine());
        System.out.print("Nhap ten ca si : ");
        ab.setCaSy(sc.nextLine());
        System.out.print("Nhap so luong bai hat : ");
        ab.setSoBH(sc.nextInt());
        System.out.print("Nhap gia thanh : ");
        ab.setGia(sc.nextFloat());
    }
    public static void main(String[] args) {
        DiaCD alb[] = null;
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.println("ban chon gi?");
            System.out.println("1.Nhap thong tin cd \n" +
                    "2.Tong so luong CD\n" + 
                    "3.tong gia thanh CD \n" + 
                    "4.Sap xep giam dan theo gia thanh \n" +
                    "5.Sap xep tang dan theo tua CD\n"+
                    "6.Xuat toan bo danh sach\n"+
                    "Nhap so khac de thoat");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nhap so luong CD : ");
                    n = sc.nextInt();
                    alb = new DiaCD[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("CD thu " + (i + 1)+": ");
                        alb[i] = new DiaCD();
                        nhapAlbum(alb[i]);
                    }
                    break;
                case 2:
                    System.out.println("Tong so luong CD la : " + n);
                    break; 
                case 3:
                    int tong = 0;
                    for (int i = 0; i < n; i++) {
                        tong += alb[i].getGia();
                    }
                    System.out.println("" +
                            "Tong gia thanh la : " + tong);
                    break;   
                
                
                case 4:
                DiaCD temp = alb[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (alb[i].getGia() < alb[j].getGia()) {
                                temp = alb[j];
                                alb[j] = alb[i];
                                alb[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sap xep thanh cong, Nhap so 6 de kiem tra!");
                    break;
                case 5:
                    temp = alb[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (alb[i].gettuaCD().compareTo(alb[j].gettuaCD())>0) {
                                temp = alb[j];
                                alb[j] = alb[i];
                                alb[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sap xep thanh cong, Nhap so 2 đe kiem tra!");
                    break;
                    case 6:
                    System.out.printf("%-10s %-20s %-20s %-10s %-20s \n", "Ma CD", "Tua CD", "Ten ca sy", "So bai hat", "Gia thanh");
                    for (int i = 0; i < n; i++) {
                        alb[i].hienThiAlbum();
                    }
                    break;
                default:
                    System.out.println("Tam Biet");
                    flag = false;
                    break;
            }
        }while (flag) ;
    }
}

