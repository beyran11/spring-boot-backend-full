package com.example.controller;

import java.util.List;

import com.example.takescreenshot.WebCrawler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Item;
import com.example.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;

	// main page of localhost:8080
	@GetMapping("/members/")
	public List<Item> items() {

		return itemService.findAll();

	}

	//Show url locaions
	@GetMapping("/urls/")
	public String urls(){
		String url = "http://www.google.com";
		WebCrawler webCrawler = new WebCrawler();
		return webCrawler.screenShotLocation(url);
		//return "Hello WebCrawler";
	}


}
