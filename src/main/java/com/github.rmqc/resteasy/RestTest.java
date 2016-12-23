package com.github.rmqc.resteasy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by xiedan11 on 2016/12/23.
 */
@Path("/resteasy")
public class RestTest {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hi!!!";
    }
}
