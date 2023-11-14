package StringProcessor;
public class StringProcessor {

    // Chuyển chuỗi sang chữ hoa
    public String chuyenChuoiSangChuHoa(String chuoi) {
        return chuoi.toUpperCase();
    }

    // Chuyển chuỗi sang chữ thường
    public String chuyenChuoiSangChuThuong(String chuoi) {
        return chuoi.toLowerCase();
    }

    // Đảo ngược chuỗi
    public String daoNguocChuoi(String chuoi) {
        return new StringBuilder(chuoi).reverse().toString();
    }

    // Tìm kiếm chuỗi con
    public boolean timChuoiCon(String chuoi, String chuoiCon) {
        return chuoi.contains(chuoiCon);
    }

    // Trích xuất chuỗi con
    public String trichXuatChuoiCon(String chuoi, int batDau, int ketThuc) {
        return chuoi.substring(batDau, ketThuc);
    }

    // Thay thế chuỗi con
    public String thayTheChuoiCon(String chuoi, String chuoiConCanThay, String chuoiMoi) {
        return chuoi.replace(chuoiConCanThay, chuoiMoi);
    }

    // Kiểm tra chuỗi đối xứng
    public boolean kiemTraChuoiDoiXung(String chuoi) {
        String daoNguoc = daoNguocChuoi(chuoi);
        return chuoi.equals(daoNguoc);
    }

    // Đếm số từ trong chuỗi
    public int demSoTuTrongChuoi(String chuoi) {
        String[] tu = chuoi.split("\\s+");
        return tu.length;
    }

    // Tần suất xuất hiện của từng ký tự trong chuỗi
    public int tanSuatXuatHienKyTu(String chuoi, char kyTu) {
        int dem = 0;
        for (int i = 0; i<chuoi.length();i++)
        {
            if(chuoi.charAt(i)==kyTu)
                dem++;
        }
        return dem;
    }
}
