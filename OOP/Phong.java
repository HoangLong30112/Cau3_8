package OOP;

public class Phong
{
    private String maPhong;
    private String loaiPhong;
    private int gia;

    public Phong(String maPhong, String loaiPhong, int gia) {
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.gia = gia;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}
