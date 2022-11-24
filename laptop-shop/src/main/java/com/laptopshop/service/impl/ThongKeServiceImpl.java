//package com.laptopshop.service.impl;
//
//import java.util.List;
//
//import javax.jdo.annotations.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.laptopshop.dao.ThongKeDao;
//import com.laptopshop.dto.ThongKeDto;
//import com.laptopshop.service.ThongKeService;
//
//
//@Service
//public class ThongKeServiceImpl  implements ThongKeService{
//
//	@Autowired
//	private ThongKeDao thongKeDao;
//	
//	@Override
//	@Transactional
//	public List<ThongKeDto> thongKeSanPham() {
//		return thongKeDao.thongKeSanPham();
//	}
//
//}
