package com.sap.hana.cloud.samples.granny.api;

import javax.ws.rs.core.Response;


/**
 * Abstract base class for all facades.
 *
 */
public abstract class BaseFacade
{
	/**
	 * TODO
	 * 
	 * @param ex The {@link Exception} to handle
	 * @return The corresponding {@link Response} for the caught {@link Exception}
	 */
	protected Response handleException(Exception ex) 
	{
		return Response.serverError().build();
		
	}
}
