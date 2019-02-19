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

public class StringPrefixedSequenceIdGenerator2 extends SequenceStyleGenerator {
	     
	public static final String VALUE_PREFIX_PARAMETER = "valuePrefix";    
	public static final String VALUE_PREFIX_DEFAULT = "";    
	private String valuePrefix;   
	
	public static final String INCREMENT_PARAMETER = "numberFormat";    
	public static final String INCREMENT_PARAMETER_DEFAULT = "";    
	private String incValue;     
	
	public static final String INITIAL_VALUE = "";    
	public static final String INITIAL_VALUE_DEFAULT = "";    
	private String initialValue;    
	
	public static final String ENTITY_NAME = "";    
	public static final String ENTITY_NAME_DEFAULT = "";    
	private String dbTableName;    
	
	public Serializable generate(SharedSessionContractImplementor session,
            Object object) throws HibernateException {
		
		Connection connection = session.connection();
		System.out.println("DbTableName ----------------> " + dbTableName);
	    
		try {
	        Statement statement=connection.createStatement();

	        ResultSet rs = statement.executeQuery("SELECT created_at,id FROM " + dbTableName + " ORDER BY created_at DESC LIMIT 1");

	        if(rs.next())
	        {
	        	String id = rs.getString("id");
	        	System.out.println("id ----------------> " + id);
	        	int id1 = Integer.parseInt(id.split("_")[1]) + Integer.parseInt(incValue);
	            String generatedId = valuePrefix + new Integer(id1).toString();
	            System.out.println(" Generated Id : ###################### -> -> " + generatedId);
	            return generatedId;
	        }
	        else
	        	return initialValue;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
    }
 
    @Override
    public void configure(Type type, Properties params,
            ServiceRegistry serviceRegistry) throws MappingException {
        super.configure(LongType.INSTANCE, params, serviceRegistry);
        
        dbTableName = params.getProperty(JPA_ENTITY_NAME);
        System.out.println("Within the method : " + dbTableName);
        
        valuePrefix = ConfigurationHelper.getString(VALUE_PREFIX_PARAMETER,
                params, VALUE_PREFIX_DEFAULT);
        initialValue = ConfigurationHelper.getString(INITIAL_VALUE,
                params, INITIAL_VALUE_DEFAULT);
        incValue = ConfigurationHelper.getString(INCREMENT_PARAMETER,
                params, INCREMENT_PARAMETER_DEFAULT);
         /*= ConfigurationHelper.getString(ENTITY_NAME,
                params, ENTITY_NAME_DEFAULT);*/
    }
}