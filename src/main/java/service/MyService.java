package service;


import dao.TranslatorDAO;
import dao.TranslatorDAOImpl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/translator/{ukrainian_word}")
public class MyService {
    TranslatorDAO translatorDAO = new TranslatorDAOImpl();

     @GET
     @Produces("text/plain")
     public String doGet(@PathParam("ukrainian_word") String ukrainianWord) {
         return translatorDAO.translate(ukrainianWord);
     }

}
