package com.briteitservices.week2.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import java.util.ArrayList;
import java.util.List;

@Path("hello-world")
public class HelloWordEndpoint {

    @GET
    public String get() {
        return "This is a GET method!";
    }

    @GET
    @Path("/v1")
    public String getV1() {
        return "[V1] This is a GET method!";
    }

    @GET
    @Path("/v1/{name}")
    public String getV1(@PathParam("name") String name) {
        return "[V1] Hello " + name;
    }

    @GET
    @Path("/v2")
    public String getV2(@QueryParam("name") String name) {
        return "[V2] Hello " + name;
    }

    @GET
    @Path("/v3")
    public String getV3(@MatrixParam("name") String name) {
        return "[V3] Hello " + name;
    }

    @GET
    @Path("/v4/{name1}/{name2}")
    public String getV4(@PathParam("name1") String name1,
                        @PathParam("name2") String name2,
                        @QueryParam("name3") String name3,
                        @QueryParam("name4") String name4,
                        @MatrixParam("name5") String name5,
                        @MatrixParam("name6") String name6) {
        List<String> params = new ArrayList<>();
        params.add(name1);
        params.add(name2);
        params.add(name3);
        params.add(name4);
        params.add(name5);
        params.add(name6);

        return params.toString();
    }

    @POST
    public String post() {
        return "This is a POST method!";
    }
}
