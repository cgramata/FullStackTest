/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Domain.Customer;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author syntel
 */
public class CustomerDAOImpl implements CustomerDAO{

    private static JdbcTemplate jdbcTemplate;
    
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    @Override
    public List getAllCustomerRecords() {
        return jdbcTemplate.query( "select * from CUSTOMER", new CustomerRowMapper());
    }

    @Override
    public void insertNewCustomer(Customer object) {
        String query = "insert into CUSTOMER values(?,?,?,?,?,?,?,?,?,?,?,?)";
        
        jdbcTemplate.update(query, new Object[]{object.getCustomerId(), object.getDiscountCode(),
                                    object.getZip(), object.getName(),
                                    object.getAddressLine1(),object.getAddressLine2(), 
                                    object.getCity(), object.getState(), 
                                    object.getPhone(),object.getFax(), 
                                    object.getEmail(), object.getCreditLimit()});
        System.out.println("Inserted Orders Record");
    }
    
}
