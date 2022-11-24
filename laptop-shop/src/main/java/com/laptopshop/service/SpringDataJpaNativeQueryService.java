//package com.laptopshop.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.laptopshop.dto.ThongKeDto;
//import com.laptopshop.repository.ChiTietDonHangRepository;
//
//@Service
//public class SpringDataJpaNativeQueryService {
//
//	@Autowired
//	private ChiTietDonHangRepository repository;
//	public List<ThongKeDto> getEventList() {
//		List<ThongKeDto> eventList = repository.findAll().stream().map(e -> {
//			ThongKeDto dto = new ThongKeDto();
//
//			dto.setId(e.getId());
//			dto.setTongTien(e.get);
//			dto.setUrl(e.getDonHang());
//			dto.setClasz(e.getSanPham());
//			dto.setStart(e.getStartDate().getTime());
//			dto.setEnd(e.getEndDate().getTime());
//
//			return dto;
//		}).collect(Collectors.toList());
//
//		return eventList;
//
//	}
//}
