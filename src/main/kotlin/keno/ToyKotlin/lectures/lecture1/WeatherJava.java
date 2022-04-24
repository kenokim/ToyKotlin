package keno.ToyKotlin.lectures.lecture1;

public class WeatherJava {
    private int temperature;
    private String description;
    private Color color;

    public void updateWeather(int degrees) {
        String description;
        Color color;
        if (degrees < 10) {
            description = "cold";
            color = Color.BLUE;
        } else if (degrees < 25) {
            description = "mild";
            color = Color.ORANGE;
        } else {
            description = "hot";
            color = Color.RED;
        }
    }
    enum Color {
        BLUE, ORANGE, RED,
    }

}