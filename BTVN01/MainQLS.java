package BTVN01;
import java.util.Scanner;
public class MainQLS {
	public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----- MENU -----");
            System.out.println("1. Thêm mới tài liệu");
            System.out.println("2. Xoá tài liệu theo mã");
            System.out.println("3. Hiển thị thông tin về tài liệu");
            System.out.println("4. Tìm kiếm tài liệu theo loại");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập số

            switch (choice) {
                case 1:
                    System.out.println("Chọn loại tài liệu cần thêm (1. Sách / 2. Tạp chí / 3. Báo): ");
                    int loai = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập số
                    Document newDocument = nhapTaiLieu(loai);
                    if (newDocument != null) {
                        quanLySach.themTaiLieu(newDocument);
                        System.out.println("Thêm mới tài liệu thành công.");
                    } else {
                        System.out.println("Thêm mới tài liệu không thành công. Vui lòng thử lại.");
                    }
                    break;
                case 2:
                    System.out.print("Nhập mã tài liệu cần xoá: ");
                    String maTaiLieuXoa = scanner.nextLine();
                    quanLySach.xoaTaiLieu(maTaiLieuXoa);
                    System.out.println("Đã xoá tài liệu có mã: " + maTaiLieuXoa);
                    break;
                case 3:
                    quanLySach.hienThiThongTinTaiLieu();
                    break;
                case 4:
                    System.out.print("Nhập loại tài liệu cần tìm kiếm (Sách/Tạp chí/Báo): ");
                    String loaiTimKiem = scanner.nextLine();
                    quanLySach.timKiemTheoLoai(loaiTimKiem);
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static Document nhapTaiLieu(int loai) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã tài liệu: ");
        String maTaiLieu = scanner.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        String tenNhaXuatBan = scanner.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        int soBanPhatHanh = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập số

        switch (loai) {
            case 1:
                System.out.print("Nhập tên tác giả: ");
                String tenTacGia = scanner.nextLine();
                System.out.print("Nhập số trang: ");
                int soTrang = scanner.nextInt();
                return new Book(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
            case 2:
                System.out.print("Nhập số phát hành: ");
                int soPhatHanh = scanner.nextInt();
                System.out.print("Nhập tháng phát hành: ");
                int thangPhatHanh = scanner.nextInt();
                return new Magazine(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh);
            case 3:
                System.out.print("Nhập ngày phát hành (dd/mm/yyyy): ");
                String ngayPhatHanh = scanner.nextLine();
                return new Newspaper(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh);
            default:
                System.out.println("Loại tài liệu không hợp lệ.");
                return null;
        }
    }
}
