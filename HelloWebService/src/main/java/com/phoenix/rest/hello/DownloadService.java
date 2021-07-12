package com.phoenix.rest.hello;
import java.io.File;
//author:mitesh goswami
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/download")
public class DownloadService {
	@GET
	@Path("/textfile")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getTextFile()
	{
		File file= new File("/home/sterlite/temp/GitDemos/hello_project/hello.txt");
		return Response.ok(file)
				.header("Content-Disposition", "attachment; filename='hello.txt'")
				.build();
	}
	@GET
	@Path("/pdf")
	@Produces("application/pdf")
	public Response getPdfFile()
	{
		File file=new File("/home/sterlite/Downloads/1721BECE30063.pdf");
		return Response.ok(file)
				.header("Content-Disposition", "attachment; filename='1721BECE30063.pdf'")
				.build();
	}
	@GET
	@Path("/photo")
	@Produces("image/jpg")
	public Response getImage()
	{
		File file=new File("/home/sterlite/Pictures/1.jpg");
		return Response.ok(file)
				.header("Content-Disposition", "attachment; filename='1.jpg'")
				.build();
	}

}
