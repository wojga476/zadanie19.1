package pl.javastart.zadanie;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository {
    private List<Product> listaProduktow;

    public ProductRepository() {
        listaProduktow = new ArrayList<>();
        listaProduktow.add(new Product("Chleb", 2.33, "http://piekarnia.shoparena.pl/userdata/gfx/51b1ea1c6163924f400d626ecda15665.jpg"));
        listaProduktow.add(new Product("Bułka", 0.33, "http://lalorraine.pl/wp-content/uploads/2016/11/20161115-bulka_rezyczka_jasna_4045130.jpg"));
        listaProduktow.add(new Product("Rogal", 1.33, "https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Rogalik.jpg/220px-Rogalik.jpg"));
    }

    public void setListaProduktow(List<Product> listaProduktow) {
        this.listaProduktow = listaProduktow;
    }

    public List<Product> getListaProduktow() {

        return listaProduktow;
    }

    public Product findByName(String nazwa) {

        Product product1 = null ;
        for (Product produkt : listaProduktow) {
            if (produkt.getNazwa().equals(nazwa)) {
                product1 = produkt;
            }

        }
        return product1;
    }
    public Map<Product, Integer> addNewList(Product produkt, Integer ilosc){
        Map<Product, Integer> kosz = new HashMap<>();
        kosz.put(produkt, ilosc);
        return kosz;


    }
}