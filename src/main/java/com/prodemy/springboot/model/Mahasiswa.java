package com.prodemy.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "Nama")
	private String nama;
	
	@Column(name = "NIM")
	private String nim;
	
	@Column(name = "Alamat")
	private String alamat;
	
	@Column(name = "Tanggal Lahir")
	private String tanggalLahir;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getTanggalLahir() {
		return tanggalLahir;
	}
	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	
}
