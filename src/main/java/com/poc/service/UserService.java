package com.poc.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.poc.dao.UserDetailsDao;
import com.poc.dev.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;


@Path("/userservice")
@Api("User service API")
@SwaggerDefinition(tags = { @Tag(name = "User API", description = "JAXRS Based API") })
public class UserService {

	UserDetailsDao objUserDetailsDao = new UserDetailsDao();

	   @GET
	   @Path("/users")
	   @ApiOperation("Return list of users")
	   @Produces(MediaType.APPLICATION_JSON)
	   @ApiResponses({ @ApiResponse(code = 201, message = "Fetched users", response = List.class) })
	   
	   public List<User> getUsers(){
	      return objUserDetailsDao.getAllUsers();
	   }
	
}