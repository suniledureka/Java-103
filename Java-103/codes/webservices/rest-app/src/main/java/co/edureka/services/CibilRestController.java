package co.edureka.services;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

@Path("/cibil")
public class CibilRestController {
	@GET
	@Path("/score")
	@Produces("text/plain")
	public String getCibilScore(@QueryParam("name") String customerName, @QueryParam("pan") String pan) {
		if(pan != null && pan.length()==10) {
			return String.format("Hello %s, your CIBIL Score is 812", customerName);
		}
		
		return String.format("Hello %s, submitted PAN is not Valid", customerName);
	}
}
