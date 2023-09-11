package com.hackthon.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackthon.model.Airline;
import com.hackthon.model.Airports;
import com.hackthon.repository.AirlineRepo;
import com.hackthon.repository.AirportRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class JsonFileReader {
	@Autowired
	AirlineRepo airlineRepo;
	@Autowired
	AirportRepo airportRepo;
    public List<Airline> readJsonFile() {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Replace "example.json" with your JSON file's path
            File jsonFile = new File("C:\\JAVA_BATCH_2\\Hackthon\\airlines.json");
            List<Airline> airlines = objectMapper.readValue(jsonFile, new TypeReference<List<Airline>>() {});
            for(Airline a:airlines)
            {
            	airlineRepo.save(a);
            }

            // Now, you have a list of Airline objects
          return airlines;
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately
           return null;
        }
    }
    
    public List<Airports> readJsonAirportFile() {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Replace "example.json" with your JSON file's path
            File airportFile = new File("C:\\JAVA_BATCH_2\\Hackthon\\airports.json");
            List<Airports> airports = objectMapper.readValue(airportFile, new TypeReference<List<Airports>>() {});
            for(Airports p:airports)
            {
            	
             airportRepo.save(p);
            }

            // Now, you have a list of Airline objects
          return airports;
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately
           return null;
        }
}
}
