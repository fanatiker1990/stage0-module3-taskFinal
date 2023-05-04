package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius) {
        double temperatureFahrenheit = ((1.8) * temperatureCelsius) + 32;
        System.out.println(temperatureFahrenheit);
    }

}
