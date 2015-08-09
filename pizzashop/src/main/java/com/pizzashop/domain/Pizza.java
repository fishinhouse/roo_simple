package com.pizzashop.domain;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.activerecord.RooJpaActiveRecord;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Pizza {

    /**
     */
    @NotNull
    private String name;

    /**
     */
    @NotNull
    private double price;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Topping> Toppings = new HashSet<Topping>();

    /**
     */
    @ManyToOne
    private Base base;
}
