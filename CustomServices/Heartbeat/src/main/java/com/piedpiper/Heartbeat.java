package com.piedpiper;

import javax.ws.rs.*;

@Path("/")
public class Heartbeat {
	
	@GET
    @Path("/check")
    @Produces("application/json")
    public String checkHearbeat(){
        
        return "Lub Dub";
    }
	
}