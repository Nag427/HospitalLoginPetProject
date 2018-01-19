package com.safeKnee.core.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.safeKnee.core.service.AdvertisementService;




/**
 * @author Nag
 */
@Controller

public class TestController {
   @Autowired
   AdvertisementService advService;
	
   @RequestMapping(path={"/"},method=RequestMethod.GET)
   public String sayHello(Model model) {
     model.addAttribute("adds",advService.findAll());
     System.out.println(model.containsAttribute("adds"));
      //Java 8 LocalDate
      DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
      LocalDate date=LocalDate.now();
      model.addAttribute("date", date.format(formatter));
      return "index";
   }
  
}