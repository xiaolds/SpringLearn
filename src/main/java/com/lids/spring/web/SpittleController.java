package com.lids.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lids.spring.data.SpittleRepo;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

	private SpittleRepo spittleRepo;
	
	@Autowired
	public SpittleController(SpittleRepo spittleRepo){
		this.spittleRepo = spittleRepo;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String spittles(Model model) {
		model.addAttribute(
				spittleRepo.findSpittles(Long.MAX_VALUE, 20));
		return "spittles";
	}
	
}
