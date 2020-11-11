package chapter2;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observer;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observer = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observer.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observer.indexOf(o);
        if(i>0){
            observer.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observer.size(); i++) {
            Observer observer = (Observer)this.observer.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // 기타 weather method...
}
