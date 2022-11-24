package com.laptopshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.laptopshop.entities.ChiTietDonHang;

public interface ThongKeRepository extends JpaRepository<ChiTietDonHang, Long>{
	
//	@Query(nativeQuery = true)
//	List<ThongKeDto> findThongKeDto_customer();
	@Query(value = "SELECT nd.id,\r\n" + 
			"        SUM(ctdh.so_luong_dat) as quantity,\r\n" + 
			"   		SUM(ctdh.so_luong_dat* ctdh.don_gia) as sum,\r\n" + 
			"   		AVG(ctdh.don_gia) as avg,\r\n" + 
			"   		Min(ctdh.don_gia) as min, \r\n" + 
			"   		max(ctdh.don_gia) as max\r\n" + 
			"   		FROM chi_tiet_don_hang ctdh\r\n" + 
			"   		INNER JOIN don_hang dh ON dh.id = ctdh.ma_don_hang\r\n" + 
			"   		INNER JOIN nguoi_dung nd ON  nd.id = dh.ma_nguoi_dat\r\n" + 
			"   		GROUP BY nd.id\r\n" + 
			"        ;", nativeQuery = true)

    public List<Object> repo();
}
