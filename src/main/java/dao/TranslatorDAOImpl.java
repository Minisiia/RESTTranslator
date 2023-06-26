package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.Optional;

public class TranslatorDAOImpl implements TranslatorDAO {

    private final SessionFactory sessionFactory;

    public TranslatorDAOImpl() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public String translate(String ukrainianWord) {
        Session session = sessionFactory.openSession();
        String hql = "SELECT t.englishWord FROM Translations t WHERE t.ukrainianWord = :word";
        Query<String> query = session.createQuery(hql, String.class);
        query.setParameter("word", ukrainianWord);
        return Optional.ofNullable(query.uniqueResult()).orElse("Translation not found");
    }
}
