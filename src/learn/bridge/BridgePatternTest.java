package learn.bridge;

public class BridgePatternTest {
public static void main(String[] args) {
	var buschck=new BusDrivingCheck(new Bus());
	System.out.println(buschck.checkDrivingSkills());
	System.out.println(buschck.getVehicleNumber());
	
	var carchck=new CarDrivingCheck(new Car());
	System.out.println(carchck.checkDrivingSkills());
	System.out.println(carchck.getVehicleNumber());
}
}
