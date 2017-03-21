package main.webapp.com.ravindhar.Makeaplant.controller;
import main.webapp.com.ravindhar.Makeaplant.model.Plant;
import main.webapp.com.ravindhar.Makeaplant.service.PlantServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/Plant")
public class PlantController {
	@Autowired
	private PlantServiceImpl plantService;
	
   
   @RequestMapping(value="/getPlants/{categoryId}",method=RequestMethod.GET)
   public Plant[] getPlants(@PathVariable("categoryId") long categoryId)
   {
	   Plant plants[] = plantService.getPlants(categoryId);
	   return null;
   }

}
