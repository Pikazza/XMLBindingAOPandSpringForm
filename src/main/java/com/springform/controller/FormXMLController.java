package com.springform.controller;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.eclipse.persistence.jaxb.JAXBContextProperties;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.springform.model.Address;
import com.springform.model.AddressHistory;
import com.springform.model.User;

import org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter;;

@Controller
@SessionAttributes({"userForm"})
public class FormXMLController{
	
	String message = "Welcome to Spring MVC!";
	 
/*	@RequestMapping("/hello")
	public String  showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name,Model model) {
		System.out.println("in controller");
		model.addAttribute("message", message);
		model.addAttribute("name", name);
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return "helloworld";

}*/
	@ModelAttribute("userForm")
	public User populateUser(){
	//	_log.debug(" Form backing object customer is created");
		User user  = new User();
		return  user;
} 
	@InitBinder
	 public void initBinder(WebDataBinder binder) {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        dateFormat.setLenient(false);
	       
	        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	        System.out.println("initBinder is invoked ");
	}
	@RequestMapping("/hello")
	    public String viewRegistration(@ModelAttribute("userForm") User user, Model model) {
	     //   User userForm = new User();    
	   //     model.addAttribute("userForm", userForm);
	        List professionList1 = new ArrayList();
	        professionList1.add("Developer");
	        professionList1.add("Designer");
	        professionList1.add("IT Manager");
	      //  model.put("professionList1", professionList1);
	        
//	        Map referenceData = new HashMap();
	  /*  	Map<String,String> country = new LinkedHashMap<String,String>();
	    	country.put("US", "United Stated");
	    	country.put("CHINA", "China");
	    	country.put("SG", "Singapore");
	    	country.put("MY", "Malaysia");*/
	    	model.addAttribute("country1", professionList1);
	         
	        return "helloworld";
	    }
	
	@RequestMapping(value="/register")
    public String viewdetails(@ModelAttribute("userForm") User user, Model model) {
/*		 System.out.println("username: " + user.getUsername());
	        System.out.println("password: " + user.getPassword());
	        System.out.println("email: " + user.getEmail());
	        System.out.println("birth date: " + user.getBirthDate());
	        System.out.println("profession: " + user.getProfession());*/
	        
	        if(user.getAddressHistory()==null){
	        	AddressHistory addressHistory =new AddressHistory();
		         user.setAddressHistory(addressHistory);
	        }

	         
	        
	         return "addressdetails";
    }
	@RequestMapping(value="/register1")
    public String employement(@ModelAttribute("userForm") User user, Model model) {
		
		
/*		 System.out.println("username: " + user.getUsername());
	        System.out.println("password: " + user.getPassword());
	        System.out.println("email: " + user.getEmail());
	        System.out.println("birth date: " + user.getBirthDate());
	        System.out.println("profession: " + user.getProfession());*/
	        
	       /* try {
	        JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);


			jaxbMarshaller.marshal(user, System.out);
			
	        } catch (JAXBException e) {
	    		e.printStackTrace();
	    	      }*/
	        
	        
	        try {  
	        	
	        	System.out.println(JAXBContext.newInstance(User.class).getClass());
		        
	        Map<String, Object> properties = new HashMap<String, Object>();
	        InputStream is = getClass().getClassLoader().getResourceAsStream("com/springform/model/binding.xml");

	      //  MetadataSource metadataSource = new ExampleMetadataSource();
	        properties.put(JAXBContextFactory.ECLIPSELINK_OXM_XML_KEY, is);
	        JAXBContext jc = JAXBContext.newInstance(new Class[] {User.class}, properties);
	 	 
	        Marshaller marshaller = jc.createMarshaller();
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	        marshaller.marshal(user, System.out);
	        
	        } catch (JAXBException e) {
	    		e.printStackTrace();
	    	      }
	        
	         return "viewdetails";
    }
	
	
	
	@ExceptionHandler(Exception.class)
	public String handleAllException(Exception ex) {


		return "generic_error";

	}
}