package com.example.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.pojo.heroPojo;
import com.example.main.repo.heroRepo;

@Service
public class heroService {
	
	@Autowired
	private heroRepo repo ;
	
	public heroPojo saveHero(heroPojo hp) {
		return repo.save(hp);
	}
	
	public List<heroPojo> getHeroAll(){
		return repo.findAll();
	}
	
	public heroPojo getHeroById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	/*public heroPojo getHeroByName(String name) {
		return repo.findByhname(name);
	}*/
	
	public String delHero(int id) {
		repo.deleteById(id);
		return "Deleted Hero id No :"+id;
	}
	
	public heroPojo updateHeroById(heroPojo hp) {
		heroPojo current=repo.findById(hp.getId()).orElse(null);
		current.setHname(hp.getHname());
		return repo.save(current);
		
		
	}
	
	/*public heroPojo getHeroByName(String name) {
		return repo.findByname(name);
	}*/


}
