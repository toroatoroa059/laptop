package com.laptopshop.dto;

public class ThongKeDto {

	public static final String ID = "id";
	public static final String SO_LUONG = "soLuong";
	public static final String TONG_TIEN = "tongTien";
	public static final String TRUNG_BINH = "trungBinh";
	public static final String SO_LUONG_MIN = "soluongMin";
	public static final String SO_LUONG_MAX = "soluongMax";

	private Integer id;
	private Integer soLuong;
	private Double tongTien;
	private Double trungBinh;
	private Double soluongMin;
	private Double soluongMax;

	public ThongKeDto() {
	}

	public ThongKeDto(Integer id, Integer soLuong, Double tongTien, Double trungBinh, Double soluongMin,
			Double soluongMax) {
		super();
		this.id = id;
		this.soLuong = soLuong;
		this.tongTien = tongTien;
		this.trungBinh = trungBinh;
		this.soluongMin = soluongMin;
		this.soluongMax = soluongMax;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public Double getTongTien() {
		return tongTien;
	}

	public void setTongTien(Double tongTien) {
		this.tongTien = tongTien;
	}

	public Double getTrungBinh() {
		return trungBinh;
	}

	public void setTrungBinh(Double trungBinh) {
		this.trungBinh = trungBinh;
	}

	public Double getSoluongMin() {
		return soluongMin;
	}

	public void setSoluongMin(Double soluongMin) {
		this.soluongMin = soluongMin;
	}

	public Double getSoluongMax() {
		return soluongMax;
	}

	public void setSoluongMax(Double soluongMax) {
		this.soluongMax = soluongMax;
	}

}
