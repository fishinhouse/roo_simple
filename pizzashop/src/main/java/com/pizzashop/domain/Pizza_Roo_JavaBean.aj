// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.pizzashop.domain;

import com.pizzashop.domain.Base;
import com.pizzashop.domain.Pizza;
import com.pizzashop.domain.Topping;
import java.util.Set;

privileged aspect Pizza_Roo_JavaBean {
    
    public String Pizza.getName() {
        return this.name;
    }
    
    public void Pizza.setName(String name) {
        this.name = name;
    }
    
    public double Pizza.getPrice() {
        return this.price;
    }
    
    public void Pizza.setPrice(double price) {
        this.price = price;
    }
    
    public Set<Topping> Pizza.getToppings() {
        return this.Toppings;
    }
    
    public void Pizza.setToppings(Set<Topping> Toppings) {
        this.Toppings = Toppings;
    }
    
    public Base Pizza.getBase() {
        return this.base;
    }
    
    public void Pizza.setBase(Base base) {
        this.base = base;
    }
    
}