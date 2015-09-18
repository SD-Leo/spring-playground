/**
 * Sep 19, 2015
 */
package com.davist.learn.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public static String index() {
		StringBuilder response = new StringBuilder();
		response.append("<head></head>");
		response.append("<body>");
		response.append("<h1>Hello from spring-rest1</h1>");
		response.append("<p><a href=\"http://localhost:8080/rest/clients\">Try this</a></p>");
		response.append("</body>");
		return response.toString();
	}
	
	@RequestMapping(value = "/clients", method = RequestMethod.GET)
	@ResponseBody
	public static List<Client> get() {
		Client client = new Client();
		client.setName("John");
		client.setAge(Integer.valueOf(30));
		List<Client> clients = new ArrayList<>();
		clients.add(client);
		return clients;
	}
	
}
