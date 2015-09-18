/**
 * Sep 19, 2015
 */
package com.davist.learn.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.davist.learn.springboot.domain.Client;

import java.util.ArrayList;
import java.util.List;


/**
 * @author StarovoytovD
 *
 */
@Controller
@RequestMapping
public class ClientController {
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String index() {
		StringBuilder response = new StringBuilder();
		response.append("<head></head>");
		response.append("<body>");
		response.append("<h1>Hello from spring-rest1</h1>");
		response.append("<p><a href=\"http://localhost:");
		response.append("8080");
		response.append("/clients\">Try this</a></p>");
		response.append("</body>");
		return response.toString();
	}
	
	@RequestMapping(value = "/clients", method = RequestMethod.GET)
	@ResponseBody
	public List<Client> get() {
		Client client = new Client();
		client.setName("John");
		client.setAge(Integer.valueOf(30));
		List<Client> clients = new ArrayList<>();
		clients.add(client);
		return clients;
	}
	
}
