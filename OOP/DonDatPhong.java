package OOP;

public class DonDatPhong
{
    private String maDatPhong;
    private KhachHang khachHang;
    private Phong phong;
    private int soDemO;
    private int tongTien;

    public DonDatPhong(String maDatPhong, KhachHang khachHang, Phong phong, int soDemO) {
        this.maDatPhong = maDatPhong;
        this.khachHang = khachHang;
        this.phong = phong;
        this.soDemO = soDemO;
    }

    public String getMaDatPhong() {
        return maDatPhong;
    }

    public void setMaDatPhong(String maDatPhong) {
        this.maDatPhong = maDatPhong;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public int getSoDemO() {
        return soDemO;
    }

    public void setSoDemO(int soDemO) {
        this.soDemO = soDemO;
    }

    public int getTongTien() {
        return phong.getGia() * soDemO + (soDemO * 50000);
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public void datPhong(Phong phong, KhachHang khachHang){
        this.phong = phong;
        this.khachHang = khachHang;
    }

    @Override
    public String toString() {
        return "Mã đặt phòng: " + maDatPhong +
                "\nKhách hàng: " + khachHang.getHoTen() +
                "\nPhòng: " + phong.getMaPhong() +
                "\nLoại phòng: " + phong.getLoaiPhong() +
                "\nSố đêm ở: " + soDemO +
                "\nTổng tiền: " + getTongTien() + " VND";
    }

}
