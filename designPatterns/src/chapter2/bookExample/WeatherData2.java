package chapter2.bookExample;

import java.util.Observable;

// 자바 내장 기능을 활용함.
public class WeatherData2 extends Observable {
   private float temperature;
   private float humidity;
   private float pressure;

   public WeatherData2() {
   }

   public void measurementsChanged(){
      setChanged();
      notifyObservers();
   }

  public void setMeasurements(float temperature, float humidity, float pressure) {
      this.temperature = temperature;
      this.humidity = humidity;
      this.pressure = pressure;
  }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
