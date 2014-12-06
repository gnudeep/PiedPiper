package com.piedpiper;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.ws.rs.*;
import javax.ws.rs.core.StreamingOutput;

@Path("/")
public class Heartbeat {
	
	@GET
	@HEAD
    @Path("/check")
    @Produces("text/plain")
    public StreamingOutput checkHearbeat(){
        
        return new StreamingOutput() {
            @Override
            public void write(OutputStream outputStream) throws IOException, WebApplicationException {
            	 Writer writer = new BufferedWriter(new OutputStreamWriter(outputStream));

                 for (int i = 0; i < 2000;i++) {
                     writer.write("<m0:symbol>IBM</m0:symbol>" + "\n");
                 }
                 writer.flush();
                //outputStream.write("Deependra".getBytes());
            }
        };
    }
	
}