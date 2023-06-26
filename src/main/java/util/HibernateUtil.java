package util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.jboss.logging.Logger;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;

public class HibernateUtil {
    private static SessionFactory factory;
    private static final Logger LOG = Logger.getLogger( HibernateUtil.class.getName() );

//    static {
//        try {
//            factory = new Configuration()
//                   // .configure(/*"hibernate.cfg.xml"*/)
//                    .buildSessionFactory();
//
//        } catch (HibernateException e) {
//            LOG.error(e);
//        }
//    }
//
//    public static SessionFactory getSessionFactory() {
//        return factory;
//    }

    public static SessionFactory getSessionFactory() {
        if (factory == null) {
            try {
                // Создание конфигурации Hibernate из файла hibernate.properties
                Configuration configuration = new Configuration();
                configuration.configure(); // Загрузка настроек из файла hibernate.properties

                // Создание объекта ServiceRegistry из конфигурации
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();

                // Создание фабрики сеансов на основе конфигурации и ServiceRegistry
                factory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return factory;
    }
}