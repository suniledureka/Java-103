package co.edureka.services;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/edureka")
public class EdurekaServices {
	@GET
	@Produces("text/plain")
	public String indiaCustomerService() {
		return "Welcome to edureka customer service";
	}
	
	@GET
	@Produces("text/html")
	@Path("/intl")
	public String internationalCustomerService() {
		return "<p style=color:blue;font-size:30px>Welcome to edureka international customer service</p>";
	}	
}
