package pl.pjatk.CarRentalApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class CarVinIsNotNull {

    private CarStorage carStorage;
    private RentalStorage rentalStorage;
    private CarService carService;

    @BeforeEach
    void setup() {
        this.carStorage = new CarStorage();
        this.rentalStorage = new RentalStorage();
        this.carService = new CarService(carStorage, rentalStorage);
        carService.rentACar("id001", LocalDate.of(2022,1,1), LocalDate.of(2022, 2, 1));
    }
    @Test
    void RentACarShouldReturnNull() {
        var rent = carService.rentACar(null, LocalDate.of(2022, 1,1), LocalDate.of(2022,2,1));
        assertThat(rent).isEqualTo(null);
    }

}
