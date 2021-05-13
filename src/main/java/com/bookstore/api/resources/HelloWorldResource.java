package com.bookstore.api.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author 
 */
@Path("hello-world")
public class HelloWorldResource {
    
    @GET
    public String HelloWorldMensagem(){
        return "Hello World!";
    }
}
