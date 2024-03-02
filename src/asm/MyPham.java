package asm;

public class MyPham {
    private String name;
    private double price;
    private int quanlity;
    private int loai;
    private String brand;


    public MyPham(String name, double price, int quanlity, int loai, String brand) {
        this.name = name;
        this.price = price;
        this.quanlity = quanlity;
        this.loai = loai;
        this.brand = brand;
    }

    public MyPham() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void inThongTin(){
        System.out.printf("\nTên: %s\nGiá: %f\nSố lượng: %d\nLoại: %s\nHãng: %s",
                this.getName(), this.getPrice(), this.getQuanlity(), this.getLoai()==1 ? "Son" : "Phấn", this.getBrand());
    }

    public String trangThai(){
        return this.getPrice() >= 50 ? "Đắt" : "Rẻ";
    }

    public double tinhTien() {
        return this.price * this.quanlity;
    }
}
