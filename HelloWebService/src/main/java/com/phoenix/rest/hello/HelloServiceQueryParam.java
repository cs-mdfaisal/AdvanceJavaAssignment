package com.phoenix.rest.hello;

import java.time.LocalDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/helloquery")
public class HelloServiceQueryParam {
	@GET
	@Path("/greet")
	@Produces(MediaType.TEXT_PLAIN)
	public String greetUser(@QueryParam("nm") String name)
	{
		return "Hello" + name;
	}
	@GET
	@Path("/user")
	@Produces(MediaType.TEXT_HTML)
	public Response greetUserResponse(@QueryParam("nm") String name)
	{
		return Response.status(200)
				.entity("<html><body><h2>hello user:"+name+"</h2></body></html>")
				.build();
	}
	@GET
	@Path("/date")
	@Produces(MediaType.TEXT_HTML)
	public Response getDate(@QueryParam("dd") int day,
							@QueryParam("mm") int month,
							@QueryParam("yy") int year)
	{
		String o="<html>"
				+"<body>"
				+"<h1>date is:"+LocalDate.of(year,month,day)+"</h1>"
				+"</body>"
				+"</html>";
		return Response.status(200).entity(o).build();
	}
	

}
