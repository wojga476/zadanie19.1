package pl.javastart.zadanie;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ControllerItems {
    private Product product;
    private ProductRepository productRepository;
    public Map<Product, Integer> kosz;

    public ControllerItems(ProductRepository productRepository) {
        kosz = new HashMap<>();
    }

    @PostMapping("/addItem")
    public String add(@RequestParam int ilosc, @RequestParam String nazwa) {

        Product product1 = productRepository.findByName(nazwa);
        kosz.put(product1, ilosc);
        return "/redirect:/koszyk";

    }
    @GetMapping("/koszyk")
    @ResponseBody
    public String kosz() {
        String wynik = "";
        for (Map.Entry<Product, Integer> produktIntegerEntry : kosz.entrySet()) {
            wynik += produktIntegerEntry.getKey().getNazwa() + ":" + produktIntegerEntry.getValue() + "<br>";

        }
        return wynik;
    }


}