package com.pizzashop.web;
import com.pizzashop.domain.Pizza;
import org.springframework.roo.addon.web.mvc.controller.annotations.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pizzas")
@Controller
@RooWebScaffold(path = "pizzas", formBackingObject = Pizza.class)
public class PizzaController {
}
