package com.revature.repositories;

import com.revature.models.UserRole;
import com.revature.util.HibernateUtil;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserRoleDAOImpl implements UserRoleDAO {

    private static Logger logger = Logger.getLogger(ReimbDAOImpl.class);

    @Override
    public UserRole findByRoleId(int id) {
        logger.info("Find UserRole by user_id: " + id);

        Transaction transaction = null;
        UserRole userRole = null;
        try {
            Session session = HibernateUtil.getSession();
            // Start the transaction
            transaction = session.beginTransaction();

            // Get User Role Object
            userRole = session.get(UserRole.class, id);

            // Commit the transaction
            transaction.commit();
        } catch (Exception e) {
            logger.warn("Unable to complete UserRoleDAO transaction");
        }
        return userRole;
    }

}
