package com.company;

public class Sinhvien{
    private String HoVaTen,DiaChiSinhVien;
    private Double SoDienThoai;
    private Integer n;
    public  Integer getSoLuongSinhVien(){
        return n;
    }
    public void setSoLuongSinhVien(){
        this.n = n;
    }
    public String getHoVaTen(){
        return HoVaTen;
    }
    public void setHoVaTen(){
        this.HoVaTen=HoVaTen;
    }
    public String getDiaChiSinhVien(){
        return DiaChiSinhVien;
    }
    public void setDiaChiSinhVien(){
        this.DiaChiSinhVien=DiaChiSinhVien;
    }
    public  Double getSoDienThoai(){
        return SoDienThoai;
    }
    public void setSoDienThoai() {
        this.SoDienThoai = SoDienThoai;
    }
}
