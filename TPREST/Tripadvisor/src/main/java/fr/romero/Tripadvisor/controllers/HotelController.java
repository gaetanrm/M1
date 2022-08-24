package fr.romero.Tripadvisor.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.romero.Tripadvisor.model.Chambre;
import fr.romero.Tripadvisor.model.Hotel;
import fr.romero.Tripadvisor.repositories.HotelRepository;

@RestController
@RequestMapping("")
public class HotelController {
	/*private ArrayList<Chambre> listChambre = new ArrayList<Chambre>()  {{
		add(new Chambre((long) 1254, "212", 5, 4, 75));
		add(new Chambre((long) 1255, "213", 5, 1, 75));
		add(new Chambre((long) 1256, "214", 2, 0, 110));
	}};*/
	private Hotel hotel = new Hotel((long) 123, "BasicHotel", 4, "This is a 4 Star Hotel"/*, listChambre*/);
	
	
	//@Autowired
	//public HotelRepository hotelRepository;
	
	@GetMapping("/hello")
	public String sayHelloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/hotel")
	public Hotel baseHotel() {
		return hotel;
	}
	
	@GetMapping("/hotel/name")
	public String getName() {
		return hotel.getName();
	}
	
	@GetMapping("/hotel/stars")
	public int getStars() {
		return hotel.getStars();
	}
	
	@GetMapping("/hotel/description")
	public String getDescription() {
		return hotel.getDescription();
	}
	
	/*@GetMapping("/hotel/chambre")
	public List<Chambre> getChambre(){
		return hotel.getListChambre();
	}*/
	
}
