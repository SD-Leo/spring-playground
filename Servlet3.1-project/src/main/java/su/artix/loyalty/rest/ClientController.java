/**
 * Sep 17, 2015
 */
package su.artix.loyalty.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

import su.artix.domain.Client;

/**
 * @author sdv
 *
 */
@Controller
@RequestMapping(value = "/campaign")
public class ClientController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public List<Client> get() {
		System.out.println("Help");
		Client client = new Client();
		client.setName("John");
		client.setAge(30);
		List<Client> clients = new ArrayList<>();
		clients.add(client);
		return clients;
	}
	
	public class Client1 {
		
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Client [name=" + name + "]";
		}
		
	}

}
