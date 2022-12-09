package pl.pjatk.CarRentalApplication;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarSegmentStandardSegmentPrice {
    @Test
    void CarSegmentStandardShouldReturnTwo() {
        Double price = CarSegment.STANDARD.getNumVal();
        assertThat(price).isEqualTo(2.0);
    }
}