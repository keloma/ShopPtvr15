/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pupil
 */
public class CteateCustomer {

    public CteateCustomer() {
    }
    public List<Customer> doCreate(){
        List<Customer> customers = new ArrayList<>();
        /*               Клиенты                  */
        Customer petrov = new Customer();
        petrov.setName("Петр");
        petrov.setSurname("Петров");
        petrov.setCode("39909022220");
        petrov.setMoney(1000);
        customers.add(petrov);
        /******************************************/
        Customer nikolajev = new Customer();
        nikolajev.setName("Николай");
        nikolajev.setSurname("Николаев");
        nikolajev.setCode("39909022220");
        nikolajev.setMoney(1000);
        customers.add(nikolajev);
        /******************************************/
        return customers;
    }
}
