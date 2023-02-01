import carbrands.Audi;
import carbrands.BMW;
import carbrands.ICarBrand;
import carbrands.Mercedes;
import cartypes.Car;
import cartypes.CrossoverCar;
import cartypes.HatchbackCar;
import cartypes.SportCar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    ICarBrand bmw() {
        return new BMW();
    }

    @Bean
    ICarBrand audi() {
        return new Audi();
    }

    @Bean
    ICarBrand mercedes() {
        return new Mercedes();
    }

    @Bean
    Car bmwCrossover() {
        return new CrossoverCar(bmw());
    }

    @Bean
    Car audiSportCar() {
        return new SportCar(audi());
    }

    @Bean
    Car mercedesHatchback() {
        return new HatchbackCar(mercedes());
    }
}
