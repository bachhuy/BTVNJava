package BTVN01;

public class Newspaper extends Document {
	private String ngayPhatHanh;

    // Constructor
    public Newspaper(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    // Getter
    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }
}
