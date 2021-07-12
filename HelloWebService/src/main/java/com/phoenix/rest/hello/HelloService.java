package com.phoenix.rest.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello()
	{
		return "Hello world";
	}
	@GET
	@Path("/html")
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello()
	{
		return "<html>"
				+"<body>"
				+"<h1>hello world</h1>"
				+"</body>"
				+"</html>";
	}
	@GET
	@Path("/xml")
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello()
	{
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
				+"<text>"
				+"<para> Hello XML</para>"
				+"</text>";
	}
	
	
	
	

}
