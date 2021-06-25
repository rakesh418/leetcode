package design.adapter;

public class WeatherUI {
    public void showtemperature(int zipCode){
        WeatherAdapter adapter = new WeatherAdapter();
        System.out.println(adapter.findTemerature(1234));
    }
}
