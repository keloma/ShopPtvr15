/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopptvr15;

import classes.CreateProduct;
import classes.CteateCustomer;
import classes.Customer;
import classes.Product;
import classes.Purchase;
import java.util.List;

/**
 *
 * @author pupil
 */
public class ShopPtvr15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       CreateProduct createProduct = new CreateProduct();
        List<Product> products = createProduct.doCreate();
        CteateCustomer createCustomer = new CteateCustomer();
        List<Customer> customers = createCustomer.doCreate();
        
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println("До покупки состояние объекта product: "+product.toString());
        }
        
        System.out.println("");
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println("До покупки состояние объекта customer: "+customer.toString());
        }
        
        /*---------------------------------------*/
        Purchase purchase = new Purchase();
        
        purchase.setCustomer(customers.get(0)); //Кто покупает (0 - первый покупатель, 1 - второй)
        purchase.setProduct(products.get(1)); //Что покупает (0,1,2)
        purchase.setQuantity(4);
        purchase.doPurchase();
        
        purchase.setCustomer(customers.get(1)); //Кто покупает (0 - первый покупатель, 1 - второй)
        purchase.setProduct(products.get(2)); //Что покупает (0,1,2)
        purchase.setQuantity(6);
        purchase.doPurchase();

        /*---------------------------------------*/
        System.out.println("");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println("После покупки состояние объекта product: "+product.toString());
        }
        
        System.out.println("");
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println("После покупки состояние объекта customer: "+customer.toString());
        }     
    }
    
}
