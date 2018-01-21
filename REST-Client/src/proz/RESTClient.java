package proz;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.ThreadLocalRandom;


public class RESTClient {
  private static final String REST_URI = "http://localhost:8080/REST_service/api/";
  
  private Client client = ClientBuilder.newClient();
  
  public Student getSampleStudent(int id) {
    return client
        .target(REST_URI)
        .path("students/" + String.valueOf(id))
        .request(MediaType.APPLICATION_XML)
        .get(Student.class);
  }
  
  public static void main(String [ ] args) {
    int randomId = ThreadLocalRandom.current().nextInt(0,  256);
    RESTClient rest = new RESTClient();
    Student sample = rest.getSampleStudent(randomId);
    System.out.println(sample);
  }
}
