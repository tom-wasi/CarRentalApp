package pl.pjatk.CarRentalApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class CarServiceNoCarInCarStorage {
    private CarService carService;

    @BeforeEach
    void setup() {
        CarStorage carStorage = new CarStorage();
        RentalStorage rentalStorage = new RentalStorage();
        this.carService = new CarService(carStorage, rentalStorage);
    }

    @Test
    void rentACarShouldReturnNull() {
        var result = carService.rentACar("id001", LocalDate.of(2022, 1, 1), LocalDate.of(2022, 2, 1));

        assertThat(result).isEqualTo(null);
    }
}