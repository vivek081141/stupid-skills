package com.stupidskills.edu.serialization;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class SerializableExampleTest {
    public static final String FILENAME = "fileA.ser";
    SerializableExample example = new SerializableExample();

    @Test
    public void serializationTest() {
        final Car car = new Car(CarType.SUV, CarColor.WHITE, "3995mm",
                "100hps",  850000);

        CarFeatures features = new CarFeatures("INT001", "HANLE_DESIGN", "INTERIOR", new Date()) ;
        List<CarFeatures> carFeaturesList = new ArrayList<>();
        carFeaturesList.add(features);

        car.setFeatures(carFeaturesList);

        example.serialization(car, FILENAME);

        Car car1 = example.deserialization(FILENAME);
        Assertions.assertEquals(car1.getCarType(), CarType.SUV);

    }

}