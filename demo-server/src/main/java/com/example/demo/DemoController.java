package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.google.gson.Gson;

@RestController
@RequestMapping(value = "/api/demo", produces = { "application/json" })
public class DemoController {
	@RequestMapping("/customers")
	public String getCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("Lila","Goodman","10-Mar-1981","11510","Baldwin, NY"));
		customers.add(new Customer("Isabel","Vaughn","15-Sep-1983","96815","Honolulu, HI"));
		customers.add(new Customer("Lamar","Lindsey","1-Nov-1987","60185","West Chicago, IL"));
		customers.add(new Customer("Henry","Hudson","8-Jan-1975","56001","Mankato, MN"));
		customers.add(new Customer("Carlos","Salazar","25-Aug-1995","13090","Mankato, MN"));
		customers.add(new Customer("Becky","Walsh","11-Sep-1982","92111","San Diego, CA"));
		customers.add(new Customer("Darin","Horton","19-Dec-1978","50701","Waterloo, IA"));
		customers.add(new Customer("Thelma","Simon","3-Jun-1965","48174","Romulus, MI"));
		customers.add(new Customer("Lydia","Mcbride","23-Jul-1969","01844","Methuen, MA"));
		customers.add(new Customer("Regina","Greene","11-Feb-1981","13440","Rome, NY"));
		return new Gson().toJson(customers);
	}

}