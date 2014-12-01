package br.com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.project.model.User;
import br.com.project.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/user")
    public ModelAndView all() {
    	ModelAndView model = new ModelAndView("user-list");
    	
    	model.addObject( "users", userRepository.findAll() ); 
    	model.addObject( "user-instance", new User() );
    	return model;    	
    }
    
    @RequestMapping("/user/insert" )
    public String insert( User user ) {
    	
    	this.userRepository.save( user );
    	
    	return "user-list";    	
    }    
}
