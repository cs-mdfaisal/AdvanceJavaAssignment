package com.phoenix.rest.hello;
import java.time.LocalDate;
//@author:mitesh goswami
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/helloparam")
public class HelloServicePathParam {
	@GET
	@Path("/{nm}")
	@Produces(MediaType.TEXT_PLAIN)
	public String greetUser(@PathParam(value="nm") String name)
	{
		return "Hello" + name;
	}
	@GET
	@Path("/user/{nm}")
	@Produces(MediaType.TEXT_HTML)
	public Response greetUserResponse(@PathParam("nm") String name)
	{
		return Response.status(200)
				.entity("<html><body><h2>hello user:"+name+"</h2></body></html>")
				.build();
	}
	@GET
	@Path("/date/{dd}/{mm}/{yy}")
	@Produces(MediaType.TEXT_HTML)
	public Response getDate(@PathParam("dd") int day,
							@PathParam("mm") int month,
							@PathParam("yy") int year)
	{
		String o="<html>"
				+"<body>"
				+"<h1>date is:"+LocalDate.of(year,month,day)+"</h1>"
				+"</body>"
				+"</html>";
		return Response.status(200).entity(o).build();
	}
	
	

}
