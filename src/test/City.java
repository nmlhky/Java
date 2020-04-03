package test;

public class City {
    public String name;
    public City(String name){
        this.name=name;

    }

    @Override
    public java.lang.String toString() {
        return "City{" +
                "name=" + name +
                '}';
    }
}