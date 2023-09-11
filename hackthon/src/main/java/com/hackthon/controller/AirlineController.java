package com.hackthon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hackthon.model.Airline;
import com.hackthon.model.Airports;
import com.hackthon.repository.AirlineRepo;
import com.hackthon.service.JsonFileReader;

@RestController
public class AirlineController {

	@Autowired
	private JsonFileReader jsonFile;


	  private AirlineRepo repo;
	 
//	    @PostMapping("/addBook")
//	    public String saveBook(@RequestBody Airline airline){
//	        repo.save(airline);
//	       
//	        return "Added Successfully";
//	    }
//	    @GetMapping("/all")
//	    public List<Airline> getBooks() {
//	       
//	        return repo.findAll();
//	    }

	@GetMapping("/airlines")
	public List<Airline> getDataFromJsonFile() {
		return jsonFile.readJsonFile();
	}
	@GetMapping("/airports")
	public List<Airports> getAirports()
	{
		return jsonFile.readJsonAirportFile();
	}

//	@GetMapping("/airlines")
//	public String getUser() {
//		String uri = "https://cdn.jsdelivr.net/gh/besrourms/airlines@latest/airlines.json";
//		RestTemplate restTemplate = new RestTemplate();
//
//		String data = restTemplate.getForObject(uri, String.class);
//		// System.out.println("User: " + user);
//
//		return data;
//	}

}
