/**
 * Sep 19, 2015
 */
package com.davist.learn.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;


/**
 * @author StarovoytovD
 */
@RestController
public class ClientRestController {

    @RequestMapping(method = RequestMethod.GET)
    public static String index() {
        StringBuilder response = new StringBuilder();
        response.append("<head></head>");
        response.append("<body>");
        response.append("<h1>Hello from spring-rest</h1>");
        response.append("<p>");
        response.append("<a href=\"http://localhost:8080/clients\">Try this: http://localhost:8080/clients</a>");
        response.append("</p>");
        response.append("</body>");
        return response.toString();
    }

    @GetMapping(value = "/clients")  // альтернатива @RequestMapping(method = RequestMethod.GET)
    public static List<Client> get() {
        Client client = new Client();
        client.setName("John");
        client.setAge(30);
        return Collections.singletonList(client);
    }

}
