/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Domain.Customer;
import java.util.List;

/**
 *
 * @author syntel
 */
public interface CustomerDAO {
    public List getAllCustomerRecords();
    public void insertNewCustomer(Customer customerObject);
}
