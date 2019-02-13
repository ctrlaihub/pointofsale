package com.ctrl.domains;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import org.hibernate.internal.util.config.ConfigurationHelper;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.LongType;
import org.hibernate.type.Type;

public class StringPrefixedSequenceIdGenerator1 extends SequenceStyleGenerator {
		
	public static final String PREFIX_PARAMETER = "";
	public static String PREFIX_PARAMETER_DEFAULT = "";
	public static final String INC_PARAM = "";
	public static String INC_PARAM_DEFAULT = "";
	String prefix;
	int incValue;
	
	public Serializable generate(SharedSessionContractImplementor session,
            Object object) throws HibernateException {
		
		Connection connection = session.connection();

	    try {
	        Statement statement=connection.createStatement();

	        ResultSet rs=statement.executeQuery("select id as Id from category order by id desc limit 1");

	        if(rs.next())
	        {
	        	String id = rs.getString(1);
	        	System.out.println("id ----------------> " + id);
	        	int id1 = Integer.parseInt(id.split("_")[1]) + incValue;
	            String generatedId = prefix + new Integer(id1).toString();
	            System.out.println(" Generated Id : ###################### -> -> " + generatedId);
	            return generatedId;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
    }
 
    @Override
    public void configure(Type type, Properties params,
            ServiceRegistry serviceRegistry) throws MappingException {
        super.configure(LongType.INSTANCE, params, serviceRegistry);
        prefix = ConfigurationHelper.getString(PREFIX_PARAMETER,params, PREFIX_PARAMETER_DEFAULT);
        incValue = Integer.parseInt(ConfigurationHelper.getString(INC_PARAM,
                params, INC_PARAM_DEFAULT));
    }
}