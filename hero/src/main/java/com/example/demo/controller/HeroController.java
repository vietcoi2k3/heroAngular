package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HeroModel;
import com.example.demo.repository.HeroRepo;



@RestController
@CrossOrigin
public class HeroController {

	@Autowired
	HeroRepo heroRepo;
	@RequestMapping(value = "/api/heroes" , method = RequestMethod.GET)
	public List<HeroModel> getAllHero()
	{
		
		return heroRepo.findAll();
	}
}
