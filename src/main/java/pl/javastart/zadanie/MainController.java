package pl.javastart.zadanie;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    private ProductRepository productRepository;
    private ShoppingCart shoppingCart;

    public MainController(ProductRepository productRepository, ShoppingCart shoppingCart) {
        this.productRepository = productRepository;
        this.shoppingCart = shoppingCart;
    }

    @GetMapping("/")
    public String piekarnia(Model model){
        model.addAttribute("productRepository",productRepository.getProductList());
        return "index";
    }

    @PostMapping("/addbasket")
    public String basket(@RequestParam String name, @RequestParam int quantity){
        shoppingCart.addProduct(name,quantity);
        return "added";
    }

    @ResponseBody
    @GetMapping("/basket")
    public String showBasket(){
        return shoppingCart.toString();
    }

    @ResponseBody
    @GetMapping("/sum")
    public String showSum(){
        return "Do zapłaty " + shoppingCart.sumProduct() + " zł"
                + "<br/><br/><a href=\"/\">Kontynuuj zakupy</a><br/>";
    }



}
