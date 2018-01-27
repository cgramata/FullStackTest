/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CustomerDAO;
import Domain.Customer;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
/**
 *
 * @author syntel
 */
public class NewCustomerClass extends SimpleFormController{
    
    private CustomerDAO customerDAO;
    
    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
    
    public NewCustomerClass(){
        setCommandClass (Customer.class);
        setCommandName ("newCustomer");
    }
    
    @Override
    protected ModelAndView onSubmit (Object command) throws Exception{
        Customer newCustomer=(Customer)command;
        customerDAO.insertNewCustomer(newCustomer);
        return new ModelAndView("userSuccess", "newCustomer", newCustomer);
    }
    
}
