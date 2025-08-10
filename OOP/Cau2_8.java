package OOP;

class Cau2_8{
    public static class Main {
        public static void main(String[] args) {
            KhachHang kh1 = new KhachHang("KH01", "Nguyễn Văn A", "0912345678");
            Phong p1 = new Phong("P101", "VIP", 500000);

            DonDatPhong booking = new DonDatPhong("DP01", kh1, p1, 3);
            booking.datPhong(p1, kh1); // 3 đêm ở

            System.out.println(booking);
        }
    }

}


//Yêu cầu nghiệp vụ:
//Một hệ thống quản lý đặt phòng khách sạn cần quản lý:
//Phòng (Room): mã phòng, loại phòng, giá/đêm.
//Khách hàng (Customer): mã khách hàng, họ tên, số điện thoại.
//Đơn đặt phòng (Booking): mã đặt phòng, khách hàng, phòng, số đêm ở, tổng tiền.