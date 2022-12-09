package pl.pjatk.CarRentalApplication;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Component
public class CarService {

    private final CarStorage carStorage;
    private final RentalStorage rentalStorage;

    public CarService(CarStorage carStorage, RentalStorage rentalStorage) {
        this.carStorage = carStorage;
        this.rentalStorage = rentalStorage;
    }

    public List<Car> getAllCars() {
        return carStorage.getCarList();
    }

    public List<Rental> getAllRentals() {
        return rentalStorage.getRentalList();
    }

    public RentalInfo rentACar(String vin, LocalDate startDate, LocalDate endDate) {

        List<Rental> rentalList = rentalStorage.getRentalList();
        List<Car> carList = carStorage.getCarList();

        for (Rental rental : rentalList) {
            if (!(rental.getCar().getVin().equals(vin))) {
                for (Car car : carList) {
                    if (car.getVin().equals(vin)) {
                        System.out.println("Car with vin: " + vin + " successfully rented");
                        rentalList.add(new Rental(new User("karol"), car));
                        int between = (int) ChronoUnit.DAYS.between(startDate, endDate);
                        return new RentalInfo(300.00 * between * car.getCarSegment().getNumVal(), startDate, endDate);
                    }
                }
            } else {
                System.out.println("Can't rent that car.");
                return null;
            }
        }
        return null;
    }
}