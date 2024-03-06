package org.example;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class Main {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        String path = "src/main/java/org/example/DB/MOCK_DATA.json";

        Car[] cars = new Car[0];
        try {
            // Прочитать JSON из файла и преобразовать его в список объектов типа Car
            cars = mapper.readValue(new File(path), new TypeReference<Car[]>() {
            });

            // Вывести информацию о каждом автомобиле
            for (Car car : cars) {
                car.show();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}