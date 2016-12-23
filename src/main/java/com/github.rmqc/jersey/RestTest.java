package com.github.rmqc.jersey;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by xiedan11 on 2016/12/23.
 */
@Path("/jersey")
public class RestTest {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hi!!!";
    }

    @GET
    @Path("/header")
    @Produces(MediaType.APPLICATION_JSON)
    public String getHttpHeaders(@HeaderParam("Accept") String accept,@HeaderParam("Accept-Language")
            String acceptLang){
        System.out.println("Accept:" + accept + ",Accept-Language:" + acceptLang);
        return "http header";
    }

    @GET
    @Path("/cookie")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCookieParam(@CookieParam("JSESSIONID") String jsessionId) {
        System.out.println("jsessionId:" + jsessionId);
        return "http cookie";
    }


}
