package com.company;

import java.util.Scanner;

public class Main{ 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,run=1;
        while(run==1){
            System.out.println("Menu");
            System.out.println("1. Nhap thong tin lop hoc");
            System.out.println("2. Nhap thong tin sinh vien");
            System.out.println("3. In thong tin sinh vien");
            System.out.println("4. Them sinh vien");
            System.out.println("5. Loai bo sinh vien");
            System.out.println("6. Thoat");
            System.out.println("Nhap lua chon: ");
            a = scanner.nextInt();
            switch (a) {
                case 1:
                NhapLopHoc();
                break;
                case 2:
                NhapSoLuong();
                NhapSinhVien();
                break;
                case 3:
                InSinhVien();
                break;
            /*case 4:
                Them();
                break;
            case 5:
                Xoa();
                break; */
                case 6:
                    System.out.println("Thoat");
                    run=0;
                    break;
                default:
                    System.out.println("Yeu cau nhap lai !!!");
                    break;
            }
        }
    }
    private static int NhapSoLuong(){
        System.out.println("Nhap so luong sinh vien: ");
        Scanner scanner = new Scanner(System.in);
        Integer soluong = scanner.nextInt();
        Sinhvien n = new Sinhvien();
        n.getSoLuongSinhVien();
        return 0;
    }

    private static int n;
    static Sinhvien[] sinhvien= new Sinhvien[n];
    public static void NhapSinhVien(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i<=n; i++){
            sinhvien[i] = new Sinhvien();
            System.out.println("Ho va ten sinh vien thu "+ i);
            String hovaten = scanner.nextLine();
            sinhvien[i].setHoVaTen();
            System.out.println("Dia chi sinh vien thu "+ i);
            String diachi = scanner.nextLine();
            sinhvien[i].setDiaChiSinhVien();
            System.out.println("So dien thoai sinh vien thu "+ i);
            Double sodienthoai = scanner.nextDouble();
            sinhvien[i].setSoDienThoai();
        }
    }

    public static void InSinhVien(){
        for(int i=1 ; i<=n ; i++){
            System.out.println("Sinh vien thu "+ i);
            System.out.println("Ho va ten "+sinhvien[i].getHoVaTen());
            System.out.println("Dia chi "+sinhvien[i].getDiaChiSinhVien());
            System.out.println("So dien thoai "+sinhvien[i].getSoDienThoai());
        }
    }


    public static void NhapLopHoc(){
        Scanner scanner = new Scanner(System.in);
        Lophoc Lophoc1 = new Lophoc();
        System.out.println("Nhap ten lop: ");
        String tenlop = scanner.nextLine();
        Lophoc1.setTenlop(tenlop);
        System.out.println("Nhap dia chi: ");
        String diachi = scanner.nextLine();
        Lophoc1.setDiachi(diachi);
        System.out.println("Ten lop: "+ Lophoc1.getTenlop(tenlop));
        System.out.println("Dia chi: "+ Lophoc1.getDiachi(diachi));
    }
}
