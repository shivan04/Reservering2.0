package sr.unasat.controller;

import sr.unasat.entities.Klanten;
import sr.unasat.service.KlantenService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
@Path("klanten")
public class KlantenController {
    private final KlantenService klantenService;

    public KlantenController() {
        this.klantenService = new KlantenService();
    }

    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Klanten> findAll() {
        return klantenService.findAll();
    }
}

