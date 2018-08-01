package com.rest.training;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.model.home.NewHireDetails;

//mention the main resource
@Path("welocmePage")
public class NewJoiners {
	private ResponseBuilder details = ResponseBuilder.getInstance();

	@GET
	@Path("/{name}")
	@Produces("application/json")
	public NewHireDetails message(@PathParam("name") String name) {
		/*if (name == null || name.trim().length() == 0) {
			return Response.serverError().entity("Please specify an employee name").build();
		}*/

		return details.getHireDetails();
	}
}
