package com.tech.laptop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.laptop.entity.Laptop;
import com.tech.laptop.repository.LaptopRepository;

@Repository
public class LaptopDao {
	@Autowired
	LaptopRepository lapRepo;

	public String addLaptop(Laptop l) {
		lapRepo.save(l);
		return "Added Successfully";
	}

	public String insertList(List<Laptop> lp) {
		lapRepo.saveAll(lp);
		return "List Added Successfully";
	}
	public Laptop getById(int a) {
		return lapRepo.findById(a).get();
	}
	public List<Laptop> getList() {
		return lapRepo.findAll();
	}
	public String updateLap(List<Laptop> e) {
		lapRepo.saveAll(e);
		return "Updated Successfully";
	}
	public String deleteById(int id) {
		lapRepo.deleteById(id);
		return "Deleted Successfully";
	}
	public List<Laptop> getByBetweenPrice(int price1,int price2) {
		return lapRepo.getByBetweenPrice(price1,price2);
	}
	public List<Laptop> getLaptopList() {
		return lapRepo.getLaptopList();
	}
	public List<Object> getPriceWarranty() {
		return lapRepo.getPriceWarranty();
	}
	public List<String> getBrandFromLap() {
		return lapRepo.getBrandFromLap();
	}
	public List<Integer> getMaxPrice() {
		return lapRepo.getMaxPrice();
	}
}
