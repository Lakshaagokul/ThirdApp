package com.tech.laptop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.laptop.dao.LaptopDao;
import com.tech.laptop.entity.Laptop;

@Service
public class LaptopService {
	@Autowired
	LaptopDao lapdao;

	public String addLaptop(Laptop l) {
		return lapdao.addLaptop(l);
	}

	public String insertList(List<Laptop> lp) {
		return lapdao.insertList(lp);

	}

	public Laptop getById(int a) {
		return lapdao.getById(a);
	}

	public List<Laptop> getList() {
		return lapdao.getList();
	}

	public String updateLap(List<Laptop> e) {
		return lapdao.updateLap(e);
	}

	public String deleteById(int id) {
		return lapdao.deleteById(id);
	}

	public List<Laptop> getByBetweenPrice(int price1, int price2) {
		return lapdao.getByBetweenPrice(price1, price2);
	}
	public List<Laptop> getLaptopList() {
		return lapdao.getLaptopList();
	}
	public List<Object> getPriceWarranty() {
		return lapdao.getPriceWarranty();
	}
	public List<String> getBrandFromLap() {
		return lapdao.getBrandFromLap();
	}
	public List<Integer> getMaxPrice() {
		return lapdao.getMaxPrice();
	}
}
