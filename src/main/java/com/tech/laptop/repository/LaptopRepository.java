package com.tech.laptop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tech.laptop.entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
	@Query(value = "SELECT l  FROM Laptop l where l.price>=:price1 and l.price<=:price2")
	public List<Laptop> getByBetweenPrice(@Param("price1") int price1, @Param("price2") int price2);

	@Query(value = "SELECT l FROM Laptop l")
	public List<Laptop> getLaptopList();
	
	@Query(value = "SELECT l.price,l.warranty FROM  Laptop l")
	public List<Object> getPriceWarranty();

	
	@Query(value = "SELECT l.brand FROM Laptop l")
	public List<String> getBrandFromLap();
	
	@Query(value ="SELECT max(l.price) FROM Laptop l")
	public List<Integer> getMaxPrice();
	
}
