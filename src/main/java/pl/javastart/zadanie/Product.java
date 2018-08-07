package pl.javastart.zadanie;

public class Product {

    private String nazwa;
    private Double cena;
    private String url;

    public Product(){

    }

    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", url='" + url + '\'' +
                '}';
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Product(String nazwa, Double cena, String url) {

        this.nazwa = nazwa;
        this.cena = cena;
        this.url = url;
    }
}
