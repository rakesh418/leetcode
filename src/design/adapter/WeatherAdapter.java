package design.adapter;

public class WeatherAdapter {

    public int findTemerature(int zipCode){
        String city =null;
        if(zipCode==1234){
            city="Bangalore";
        }

        WeatherFinder finder = new WeatherFinderImpl();
        int temperature = finder.find(city);
        return temperature;
    }
}
