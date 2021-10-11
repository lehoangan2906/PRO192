
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dumbw
 */
class DieuTri {
    // chưa thoong tin ngày giờ, kết quả xét nghiệm, kết quả chẩn đoán, kết luận điều trị,mã bác sĩ điều trị,...
    LocalDate date;
    String ketQuaXetNghiem;
    String ketQuaChanDoan;
    String ketLuanDieuTri;
    String maBacSi;
    
}

class BenhNhan {
    String MaBN;
    String HoDem;
    String Ten;
    String GioiTinh;
    int Tuoi;
    String NhomMau;
    String NgayNhapVien;
    String NgayXuatVien;
    DieuTri[] quaTrinhDieuTri;

    public BenhNhan(String MaBN, String GioiTinh, String NhomMau, String NgayNhapVien) {
        this.MaBN = MaBN;
        this.GioiTinh = GioiTinh;
        this.NhomMau = NhomMau;
        this.NgayNhapVien = NgayNhapVien;
        this.HoDem = "Unk";
        this.Tuoi = -1;
        
    }
    
    
    public BenhNhan(String MaBN, String HoDem, String Ten, String GioiTinh, int Tuoi, String NhomMau, String NgayNhapVien, String NgayXuatVien) {
        this.MaBN = MaBN;
        this.HoDem = HoDem;
        this.Ten = Ten;
        this.GioiTinh = GioiTinh;
        this.Tuoi = Tuoi;
        this.NhomMau = NhomMau;
        this.NgayNhapVien = NgayNhapVien;
        this.NgayXuatVien = NgayXuatVien;
    }
    
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BenhNhan bn1 = new BenhNhan("BN001", "Nguyễn", "Chính", "Nam", 5, "O", "30-1-2021", "Unknown");
        
        BenhNhan bn2 = new BenhNhan("BN002", "Nữ", "AB", "1-1-2020");
    }
    
}
