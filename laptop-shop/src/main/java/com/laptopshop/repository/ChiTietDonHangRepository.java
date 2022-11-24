package com.laptopshop.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.laptopshop.dto.ThongKeDto;
import com.laptopshop.entities.ChiTietDonHang;

public interface ChiTietDonHangRepository extends JpaRepository<ChiTietDonHang, Long>{


}
