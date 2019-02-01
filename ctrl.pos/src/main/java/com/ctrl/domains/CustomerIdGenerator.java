package com.ctrl.domains;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomerIdGenerator implements IdentifierGenerator{

    public Serializable generate(SessionImplementor session, Object object)
            throws HibernateException {

        String prefix = "Cust";
        Connection connection = session.connection();

        try {
            Statement statement=connection.createStatement();
            System.out.println("I am here1");	
            ResultSet rs=statement.executeQuery("select count(id) as Id from Customer");
            System.out.println("I am here2");
            
            if(rs.next())
            {
                int id=rs.getInt(1)+101;
                String generatedId = prefix + new Integer(id).toString();
                System.out.println(" Generated Id : ###################### -> -> " + generatedId);
                return generatedId;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}
}