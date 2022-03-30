/**
 * 
 */
package com.bassntunes.projectwebservices.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Horiz
 * web service generado con jersey
 */
@Path("empleadosWS")
public class EmpleadosWS {

	@Path("test")
	@GET
	public String test() {
		return "probando web service con Jersey";
	}
	
}
