package com.rest.api.resource;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.rest.api.model.User;
import com.rest.api.service.UserService;

@Path("/user")
public class UserRest {

	@Inject
	private UserService userService;
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public User getUser(@PathParam("id") Long id) {
		User user = userService.findById(id);
		
		if(user != null) {
			System.out.println("User: " + user.getEmail());
		}
		return user;
	}
	
	@POST
	@Consumes("application/json")
	public void save(User user) {
		userService.save(user);
	}
	
}
