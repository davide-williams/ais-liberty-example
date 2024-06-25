package gov.vita.ais.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/ping")
public class PingResource {

	/**
	 * Ping.
	 *
	 * @return the response
	 */
	@GET
	public Response ping() {
		System.out.println("--- applicant REST api pinged ----");
		return Response.ok().entity("<!DOCTYPE html><html><head><title>Example</title></head><body><h2>Application Integration Services (AIS)</h2><p>Demo API is online and ready to serve requests</p></body></html>").build();
	}
	
}
