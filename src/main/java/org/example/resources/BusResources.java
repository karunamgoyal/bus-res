package org.example.resources;

import org.example.api.Bus;
import org.example.api.Reserve;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

@Path("/bus")
@Produces(MediaType.APPLICATION_JSON)
public class BusResources {
    HashMap<String,Bus> save;
    HashMap<String, ArrayList<Reserve>> res;
    public BusResources() {
        save = new HashMap<>();
        res = new HashMap<>();
    }

    @POST
    @Path("/reserve")
    public Response reserveBus(Reserve reserve){
        String busName = reserve.getBusNum();
        Bus bus = save.get(busName);
        if(bus!=null){
            if(bus.getAvailable()>=reserve.getNumberBooked()){
                bus.setAvailable(bus.getAvailable()-reserve.getNumberBooked());
            }
            else{
                return Response.ok("No Bus Available").build();
            }
            save.put(busName,bus);
            ArrayList<Reserve> g = res.get(reserve.getUserName());
            if(g!=null){
                g.add(reserve);
                res.put(reserve.getUserName(),g);
            }
            else{
                g = new ArrayList<Reserve>();
                g.add(reserve);
                res.put(reserve.getUserName(),g);
            }
            return Response.ok().build();
        }
        else{
            return Response.ok("No Bus Available").build();
        }


    }
    @GET
    @Path("/getres/{user}")
    public Response get(@PathParam("user") String user){
        return Response.ok(res.get(user)).build();
    }

    @POST
    @Path("/addbus")
    public Response addBus(Bus bus){
        String busName = bus.getBusNum();
        if(save.containsKey(busName)){
            return Response.serverError().build();
        }
        save.put(busName,bus);
        return Response.ok().build();
    }
}
