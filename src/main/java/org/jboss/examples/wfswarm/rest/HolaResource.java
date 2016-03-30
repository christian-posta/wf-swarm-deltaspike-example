package org.jboss.examples.wfswarm.rest;

import org.apache.deltaspike.core.api.config.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

//@ApplicationScoped
@Path("/api/hola")
public class HolaResource {

	@Inject
	@ConfigProperty(name = "wf.saying", defaultValue = "default-hello")
	private String saying;

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok(saying + " from WF Swarm").build();
	}
}