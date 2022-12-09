package pl.pjatk.CarRentalApplication;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarSegmentPremiumSegmentPrice {

    @Test
    void CarSegmentPremiumShouldReturnFive() {
        double price = CarSegment.PREMIUM.getNumVal();
        assertThat(price).isEqualTo(5.0);
    }
}
