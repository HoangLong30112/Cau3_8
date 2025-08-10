package OOP;

import java.util.ArrayList;

class Cau2_8{
    public static class Main {
        public static void main(String[] args) {
            // Danh sách phòng
            ArrayList<Phong> dsPhong = new ArrayList<>();
            dsPhong.add(new Phong("P101", "Deluxe", 800000));
            dsPhong.add(new Phong("P102", "Standard", 500000));

            // Danh sách khách hàng
            ArrayList<KhachHang> dsKhach = new ArrayList<>();
            dsKhach.add(new KhachHang("KH01", "Nguyen Van A", "0901234567"));
            dsKhach.add(new KhachHang("KH02", "Tran Thi B", "0907654321"));

            // Đặt phòng cho khách hàng
            DonDatPhong booking = new DonDatPhong("DP01", dsKhach.get(0), dsPhong.get(0), 3);

            // In thông tin
            System.out.println(booking);
        }
    }

}


//Yêu cầu nghiệp vụ:
//Một hệ thống quản lý đặt phòng khách sạn cần quản lý:
//Phòng (Room): mã phòng, loại phòng, giá/đêm.
//Khách hàng (Customer): mã khách hàng, họ tên, số điện thoại.
//Đơn đặt phòng (Booking): mã đặt phòng, khách hàng, phòng, số đêm ở, tổng tiền.