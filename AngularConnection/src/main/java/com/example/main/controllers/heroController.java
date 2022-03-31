package com.example.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.pojo.heroPojo;
import com.example.main.service.heroService;

import lombok.Delegate;
import lombok.experimental.PackagePrivate;

@RestController
public class heroController {

	@Autowired
	private heroService ser;
	
	@PostMapping("/addHero")
	public heroPojo addHero(@RequestBody heroPojo hp) {
		return ser.saveHero(hp);
	}
	
	@PutMapping("/updateHero")
	public heroPojo updateHero(@RequestBody heroPojo hp) {
		return ser.updateHeroById(hp);
	}
	
	@DeleteMapping("/deleteHero/{id}")
	public String delHero(@PathVariable int id) {
		return ser.delHero(id);
	}
	
	@GetMapping("/getAllHero")
	public List<heroPojo> getAllHero(){
		return ser.getHeroAll();
	}
	
	@GetMapping("/getById/{id}")
	public heroPojo getHeroById(@PathVariable int id) {
		return ser.getHeroById(id);
	}
	
	/*@GetMapping("/getByName/{name}")
	public heroPojo getHeroByName(@PathVariable String name) {
		return ser.getHeroByName(name);
	}*/
	
	
}
