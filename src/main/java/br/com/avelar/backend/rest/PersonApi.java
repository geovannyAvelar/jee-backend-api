package br.com.avelar.backend.rest;

import java.io.Serializable;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.avelar.backend.rest.model.Person;

@Path("/person")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public interface PersonApi extends Serializable {
	
	@POST @Consumes({ MediaType.APPLICATION_JSON })
	public void savePerson(Person person);
	
	@GET
	public List<Person> findAll();
	
	@DELETE
	public void deletePerson(Person person);
	
}
