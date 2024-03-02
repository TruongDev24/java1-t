package asm;

public class Son extends MyPham{
    private String chatlieu;

    public Son(String name, double price, int quanlity, int loai, String brand, String chatlieu) {
        super(name, price, quanlity, loai, brand);
        this.chatlieu = chatlieu;
    }


    public String getChatlieu() {
        return chatlieu;
    }

    public void setChatlieu(String chatlieu) {
        this.chatlieu = chatlieu;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("\nChất liệu: " + this.chatlieu);
    }

}
