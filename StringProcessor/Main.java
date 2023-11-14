package StringProcessor;
public class Main {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();

        String chuoi = "Chuỗi vi dụ để xử lý";
        char kytu = 'i';
        // Ví dụ sử dụng các phương thức của StringProcessor
        System.out.println("Chữ hoa: " + processor.chuyenChuoiSangChuHoa(chuoi));
        System.out.println("Chữ thường: " + processor.chuyenChuoiSangChuThuong(chuoi));
        System.out.println("Đảo ngược: " + processor.daoNguocChuoi(chuoi));
        System.out.println("Tìm chuỗi con 'ví dụ': " + processor.timChuoiCon(chuoi, "ví dụ"));
        System.out.println("Trích xuất từ vị trí 4 đến 8: " + processor.trichXuatChuoiCon(chuoi, 4, 8));
        System.out.println("Thay thế chuỗi 'xử lý' bằng 'tính toán': " + processor.thayTheChuoiCon(chuoi, "xử lý", "tính toán"));
        System.out.println("Kiểm tra chuỗi đối xứng: " + processor.kiemTraChuoiDoiXung(chuoi));
        System.out.println("Số từ trong chuỗi: " + processor.demSoTuTrongChuoi(chuoi));
        System.out.println("Tần suất xuất hiện của từng ký tự:" +processor.tanSuatXuatHienKyTu(chuoi, kytu));

    }
}
