/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CustomerDAO;
import Domain.Customer;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
/**
 *
 * @author syntel
 */
public class SeeAllCustomersClass extends SimpleFormController{
    
    private CustomerDAO customerDAO;
    
    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
    
    public SeeAllCustomersClass(){
        setCommandClass (Customer.class);
        setCommandName ("seeAllCustomers");
    }
    
    @RequestMapping(value = "WEB-INF/jsp/seeAllCustomers", method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
                
                List<Customer> listOfCustomers = customerDAO.getAllCustomerRecords();
                
		return new ModelAndView("seeAllCustomers","listOfCustomers",listOfCustomers);
	}
    
    @Override
    protected ModelAndView onSubmit (Object command) throws Exception{
        NewCustomerClass seeAllCustomers=(NewCustomerClass)command;
        return new ModelAndView("userSuccess", "seeAllCustomers",seeAllCustomers);
    }
}
