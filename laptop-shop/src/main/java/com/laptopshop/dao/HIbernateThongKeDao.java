//package com.laptopshop.dao;
//
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.transform.Transformers;
//import org.hibernate.type.DoubleType;
//import org.hibernate.type.IntegerType;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.laptopshop.dto.ThongKeDto;
//
//@Repository
//public class HIbernateThongKeDao  implements ThongKeDao{
//	
//	private final String Q_THONG_KE_SAN_PHAM = " SELECT nd.id " + ThongKeDto.ID + ",\r\n" + 
//			"        SUM(ctdh.so_luong_dat) as " + ThongKeDto.SO_LUONG + ",\r\n" + 
//			"   		SUM(ctdh.so_luong_dat* ctdh.don_gia) as " + ThongKeDto.TONG_TIEN + ",\r\n" + 
//			"   		AVG(ctdh.don_gia) as " + ThongKeDto.TRUNG_BINH + ",\r\n" + 
//			"   		Min(ctdh.don_gia) as " + ThongKeDto.SO_LUONG_MIN + ", \r\n" + 
//			"   		max(ctdh.don_gia) as " + ThongKeDto.SO_LUONG_MAX + "\r\n" + 
//			"   		FROM chi_tiet_don_hang ctdh\r\n" + 
//			"   		INNER JOIN don_hang dh ON dh.id = ctdh.ma_don_hang\r\n" + 
//			"   		INNER JOIN nguoi_dung nd ON  nd.id = dh.ma_nguoi_dat\r\n" + 
//			"   		GROUP BY nd.id\r\n";
//	
//	
//	
//	@Autowired
//	private SessionFactory sessionFactory;
//
//	
//	@Override
//	@SuppressWarnings({ "unchecked", "deprecation" })
//	public List<ThongKeDto> thongKeSanPham() {
//		Session session = sessionFactory.getCurrentSession();
//		return	session.createNativeQuery(Q_THONG_KE_SAN_PHAM)
//				.addScalar(ThongKeDto.ID, IntegerType.INSTANCE)
//				.addScalar(ThongKeDto.SO_LUONG, IntegerType.INSTANCE)
//				.addScalar(ThongKeDto.TONG_TIEN, DoubleType.INSTANCE)
//				.addScalar(ThongKeDto.TRUNG_BINH, DoubleType.INSTANCE)
//				.addScalar(ThongKeDto.SO_LUONG_MIN, DoubleType.INSTANCE)
//				.addScalar(ThongKeDto.SO_LUONG_MAX, DoubleType.INSTANCE)
//				.setResultTransformer(Transformers.aliasToBean(ThongKeDto.class))
//				.getResultList();
//	}
//}
