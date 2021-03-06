package proz;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("students")
public class Service {
  @GET
  @Path("{id}")
  @Produces(MediaType.APPLICATION_XML)
  public Student getSampleStudent(@PathParam("id") int id) {
    return new Student("Jan", "Kowalski", 3, id);
  }
}