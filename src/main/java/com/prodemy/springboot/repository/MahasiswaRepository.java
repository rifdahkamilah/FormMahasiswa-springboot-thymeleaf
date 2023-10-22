package com.prodemy.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodemy.springboot.model.Mahasiswa;

@Repository
public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long>{

}
