package pl.javastart.zadanie;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> productList = new ArrayList<>();

    public ProductRepository() {

        this.productList.add(new Product("Chleb", 2.33, "https://res.cloudinary.com/dj484tw6k/f_auto,q_auto,c_pad,b_white,w_360,h_360/v1499888716/be/81511.jpg"));
        this.productList.add(new Product("Bułka", 0.33, "https://res.cloudinary.com/dj484tw6k/f_auto,q_auto,c_pad,b_white,w_360,h_360/v1499888687/be/81481.jpg"));
        this.productList.add(new Product("Rogal", 1.33, "https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Rogalik.jpg/220px-Rogalik.jpg"));
    }

    public List<Product> getProductList() {
        return productList;
    }

    public double getPriceProductName(String nazwa){
        for(Product product:productList){
            if(product.getNazwa().equals(nazwa)){
                return product.getCena();
            }
        }
        return 0;
    }
}