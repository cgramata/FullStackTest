/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Domain.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
/**
 *
 * @author syntel
 */
public class CustomerRowMapper implements RowMapper{
    
    @Override
    public Object mapRow(ResultSet rs, int index) throws SQLException {
        Customer c = new Customer();
        String addressLine2;
        
        c.setCustomerId(rs.getInt(1));
        c.setDiscountCode(rs.getString(2));
        c.setZip(rs.getString(3));
        c.setName(rs.getString(4));
        c.setAddressLine1(rs.getString(5));
        
        c.setAddressLine2(rs.getString(6));
        //second address is not always filled out
        /*addressLine2 = rs.getString(6);
        if (addressLine2 == null) {
            c.setAddressLine2("");
        } else {
            c.setAddressLine2(addressLine2);
        }*/
        
        c.setCity(rs.getString(7));
        c.setState(rs.getString(8));
        c.setPhone(rs.getString(9));
        c.setFax(rs.getString(10));
        c.setEmail(rs.getString(11));
        c.setCreditLimit(rs.getInt(12));
        
        return c;
    }
}
