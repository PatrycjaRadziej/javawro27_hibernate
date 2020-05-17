package com.javawro27.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory ourSessionFactory;

    //blok statyczny - fragment kodu który wykonuje się jeden raz przy starcie klasy
    static{
        try {
            System.out.println("Konfiguruję hibernate");
            Configuration configuration = new Configuration();
            configuration.configure("/hibernate.cfg.xml");

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (HibernateException he){
            System.err.println(he.getMessage());

 //         System.exit(376);
            throw he;

        }
    }

    //wygenerowany getter
    public static SessionFactory getOurSessionFactory() {
        return ourSessionFactory;
    }
}
