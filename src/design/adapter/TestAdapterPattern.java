package design.adapter;
/*
If 2 application are communicating with each other using 2 objects, one object will have to adapt so that other object can read it
 */
public class TestAdapterPattern {
    public static void main(String[] args) {
        WeatherUI weatherUI = new WeatherUI();
        weatherUI.showtemperature(1234);
    }
}
