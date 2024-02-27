package BTVN01;

public class Book extends Document {
	 private String tenTacGia;
	    private int soTrang;

	    // Constructor
	    public Book(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
	        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
	        this.tenTacGia = tenTacGia;
	        this.soTrang = soTrang;
	    }

	    // Getters and Setters
	    public String getTenTacGia() {
	        return tenTacGia;
	    }

	    public int getSoTrang() {
	        return soTrang;
	    }
}
