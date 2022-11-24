package com.laptopshop.entities;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToOne;
import javax.persistence.SqlResultSetMapping;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.laptopshop.dto.ThongKeDto;

//@NamedNativeQuery(name = "ChiTietDonHang.findThongKeDto_customer",
//query = "SELECT nd.id,\r\n" + 
//		"        SUM(ctdh.so_luong_dat) as SoLuong,\r\n" + 
//		"   		SUM(ctdh.so_luong_dat* ctdh.don_gia) as TongTien,\r\n" + 
//		"   		AVG(ctdh.don_gia) as TrungBinh,\r\n" + 
//		"   		Min(ctdh.don_gia) as SoluongMin, \r\n" + 
//		"   		max(ctdh.don_gia) as SoluongMax\r\n" + 
//		"   		FROM chi_tiet_don_hang ctdh\r\n" + 
//		"   		INNER JOIN don_hang dh ON dh.id = ctdh.ma_don_hang\r\n" + 
//		"   		INNER JOIN nguoi_dung nd ON  nd.id = dh.ma_nguoi_dat\r\n" + 
//		"   		GROUP BY nd.id\r\n" + 
//		"        ;"	,resultSetMapping ="Mapping.ThongKeDto")
//@SqlResultSetMapping(name = "Mapping.ThongKeDto",
//						classes = @ConstructorResult(targetClass = ThongKeDto.class,
//								columns = {@ColumnResult(name="Id"),
//										   @ColumnResult(name = "SoLuong"),
//										   @ColumnResult(name = "TongTien"),
//										   @ColumnResult(name = "TrungBinh"),
//										   @ColumnResult(name = "SoluongMin"),
//										   @ColumnResult(name = "SoluongMax")}))
@Entity
public class ChiTietDonHang {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToOne
	@JoinColumn(name="ma_san_pham")
	private SanPham sanPham;
	private long donGia;
	private int soLuongDat;
	
	private int soLuongNhanHang;

	@ManyToOne
	@JoinColumn(name = "ma_don_hang")
	@JsonIgnore
	private DonHang donHang;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public long getDonGia() {
		return donGia;
	}

	public void setDonGia(long donGia) {
		this.donGia = donGia;
	}

	public int getSoLuongDat() {
		return soLuongDat;
	}

	public void setSoLuongDat(int soLuongDat) {
		this.soLuongDat = soLuongDat;
	}

	public DonHang getDonHang() {
		return donHang;
	}

	public void setDonHang(DonHang donHang) {
		this.donHang = donHang;
	}
	
	
	public int getSoLuongNhanHang() {
		return soLuongNhanHang;
	}

	public void setSoLuongNhanHang(int soLuongNhanHang) {
		this.soLuongNhanHang = soLuongNhanHang;
	}

	public ChiTietDonHang() {
		super();
	}

	public ChiTietDonHang(long id, SanPham sanPham, long donGia, int soLuongDat, int soLuongNhanHang, DonHang donHang) {
		super();
		this.id = id;
		this.sanPham = sanPham;
		this.donGia = donGia;
		this.soLuongDat = soLuongDat;
		this.soLuongNhanHang = soLuongNhanHang;
		this.donHang = donHang;
	}

}
