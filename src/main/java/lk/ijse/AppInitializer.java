package lk.ijse;

import lk.ijse.util.SessionFactoryConfig;
import org.hibernate.Session;

public class AppInitializer {
    public static void main(String[] args) {
        Session session = SessionFactoryConfig.getInstance().getSession();

    }
}