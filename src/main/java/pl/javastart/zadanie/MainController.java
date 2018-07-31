package pl.javastart.zadanie;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    public ProductRepository productRepository;

    public MainController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public String a(Model model) {
        model.addAttribute("produkty", productRepository.getListaProduktow());
        return "index";
    }
}
