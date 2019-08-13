package cz.oxy.skolka.controller;


import cz.oxy.skolka.dto.BasketDto;
import cz.oxy.skolka.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/basket")
public class BasketController {

    @Autowired
    private BasketService basketService;

    @GetMapping("/{id}")
    public BasketDto getBasket(@PathVariable Integer id) {
        return basketService.getBasket(id);
    }
}
