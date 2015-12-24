package com.rest.api.resource.handler;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.rest.api.exception.BusinessException;

@Provider
public class ExceptionHandler implements ExceptionMapper<BusinessException> {

	@Override
	public Response toResponse(BusinessException ex) {
		return Response.status(Status.BAD_REQUEST).entity(getMessage(ex)).build();
	}
	
	private String getMessage(BusinessException ex) {
		StringBuilder sb = new StringBuilder("{\"code\":");
		sb.append(ex.getCode());
		sb.append(",\"message\":");
		sb.append(ex.getMessage());
		sb.append("}");
		return sb.toString();
	}

}
