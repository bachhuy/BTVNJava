package BTVN01;
import java.util.ArrayList;
public class QuanLySach {
	private ArrayList<Document> documents = new ArrayList<>();

    public void themTaiLieu(Document document) {
        documents.add(document);
    }

    public void xoaTaiLieu(String maTaiLieu) {
        documents.removeIf(doc -> doc.getMaTaiLieu().equals(maTaiLieu));
    }

    public void hienThiThongTinTaiLieu() {
        for (Document doc : documents) {
            if (doc instanceof Book) {
                System.out.println("Sach - Ma tai lieu: " + doc.getMaTaiLieu() + ", Ten tac gia: " + ((Book) doc).getTenTacGia());
            } else if (doc instanceof Magazine) {
                System.out.println("Tap chi - Ma tai lieu: " + doc.getMaTaiLieu() + ", So phat hanh: " + ((Magazine) doc).getSoPhatHanh());
            } else if (doc instanceof Newspaper) {
                System.out.println("Bao - Ma tai lieu: " + doc.getMaTaiLieu() + ", Ngay phat hanh: " + ((Newspaper) doc).getNgayPhatHanh());
            }
        }
    }

    public void timKiemTheoLoai(String loai) {
        for (Document doc : documents) {
            if (loai.equals("Sach") && doc instanceof Book) {
                System.out.println("Sach - Ma tai lieu: " + doc.getMaTaiLieu() + ", Ten tac gia: " + ((Book) doc).getTenTacGia());
            } else if (loai.equals("Tap chi") && doc instanceof Magazine) {
                System.out.println("Tap chi - Ma tai lieu: " + doc.getMaTaiLieu() + ", So phat hanh: " + ((Magazine) doc).getSoPhatHanh());
            } else if (loai.equals("Bao") && doc instanceof Newspaper) {
                System.out.println("Bao - Ma tai lieu: " + doc.getMaTaiLieu() + ", Ngay phat hanh: " + ((Newspaper) doc).getNgayPhatHanh());
            }
        }
    }
}
