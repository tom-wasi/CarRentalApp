package pl.pjatk.CarRentalApplication;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarStorage {

    private List<Car> carList = new ArrayList<>();

    public List<Car> getCarList() {
        return carList;
    }

    public CarStorage() {
                this.carList.add(new Car("Renault", "Clio III", "abcde123", CarSegment.CITY));
                this.carList.add(new Car("Mercedes", "CLS", "Merc1234", CarSegment.PREMIUM));
                this.carList.add(new Car("Ford", "Focus", "ford1234", CarSegment.STANDARD));
                this.carList.add(new Car("Renault", "Megane", "rena12345", CarSegment.STANDARD));
                this.carList.add(new Car("Renault", "Clio III", "arenaa23", CarSegment.CITY));
    }
}
