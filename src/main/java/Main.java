import dao.TranslatorDAOImpl;
import service.MyService;

public class Main {
    public static void main(String[] args) {
        TranslatorDAOImpl translatorDAO = new TranslatorDAOImpl();
        System.out.println(translatorDAO.translate("привіт"));
    }
}
