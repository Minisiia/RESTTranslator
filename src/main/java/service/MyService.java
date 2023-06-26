package service;

import dao.TranslatorDAO;
import dao.TranslatorDAOImpl;

import javax.ws.rs.*;

@Path("/translator")
public class MyService {
    TranslatorDAO translatorDAO = new TranslatorDAOImpl();

     @GET()
     public String doGet(@QueryParam("ukrainian_word") String ukrainianWord) {
         return translatorDAO.translate(ukrainianWord);
     }
}
