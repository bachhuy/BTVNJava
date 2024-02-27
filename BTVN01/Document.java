package BTVN01;

public class Document {
	private String maTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;

    // Constructor
    public Document(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    // Getters and Setters
    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }
}
