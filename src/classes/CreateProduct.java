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
public class CreateProduct {

    public CreateProduct() {
    }
    public List<Product> doCreate(){
        List<Product> products = new ArrayList<>();
        Product vorst = new Product();
        vorst.setName("Колбаса");
        vorst.setPrice(220);
        vorst.setQuantity(10);
        products.add(vorst);
        /*******************************************/
        Product piim = new Product();
        piim.setName("Молоко");
        piim.setPrice(70);
        piim.setQuantity(20);
        products.add(piim);
        /******************************************/
        Product leib = new Product();
        leib.setName("Хлеб");
        leib.setPrice(30);
        leib.setQuantity(50);     
        products.add(leib);
        return products;
}
}
