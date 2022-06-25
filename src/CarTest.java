import java.util.ArrayList;
import java.util.List;

public class CarTest {

	public static void main(String[] args) {
		
		List<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());

		for(Car car : carList) {
			car.run();
			System.out.println("=========");
		}
	}

}
