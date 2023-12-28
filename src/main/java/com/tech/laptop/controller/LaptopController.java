package com.tech.laptop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.laptop.entity.Laptop;
import com.tech.laptop.service.LaptopService;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
	@Autowired
	LaptopService lapser;

	@PostMapping(value = "/insert")
	public String addLaptop(@RequestBody Laptop l) {
		return lapser.addLaptop(l);
	}

	@PostMapping(value = "/insertList")
	public String insertList(@RequestBody List<Laptop> lp) {
		return lapser.insertList(lp);
	}

	@GetMapping(value = "/getId/{a}")
	public Laptop getById(@PathVariable int a) {
		return lapser.getById(a);
	}

	@GetMapping(value = "/getList")
	public List<Laptop> getList() {
		return lapser.getList();
	}

	@PutMapping(value = "/update")

	public String updateLap(@RequestBody List<Laptop> e) {
		return lapser.updateLap(e);

	}

	@DeleteMapping(value = "/delete/{id}")

	public String deleteById(@PathVariable int id) {
		return lapser.deleteById(id);
	}

	@GetMapping(value = "/getByBetweenPrice/{price1}/{price2}")
	public List<Laptop> getByBetweenPrice(@PathVariable int price1, @PathVariable int price2) {
		return lapser.getByBetweenPrice(price1, price2);

	}
	@GetMapping(value = "/getLaptopList")
	public List<Laptop> getLaptopList() {
		return lapser.getLaptopList();
	}
	@GetMapping(value = "/getPriceWarranty")
	public List<Object> getPriceWarranty() {
		return lapser.getPriceWarranty();
	}
	
	@GetMapping(value = "/getBrandFromLap")
	public List<String> getBrandFromLap() {
		return lapser.getBrandFromLap();
	}
	@GetMapping(value = "/getMaxPrice")
	public List<Integer> getaxPrice() {
		return lapser.getMaxPrice();
	}

}
