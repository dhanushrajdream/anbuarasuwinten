package day15;

public class UseDieselTrain {
	public static void main(String[] args) {
		String trainName=args[0];
		int speed=Integer.parseInt(args[1]);
		int trainNo=Integer.parseInt(args[2]);
		boolean ispilot=Boolean.parseBoolean(args[3]);
		boolean isdoor=Boolean.parseBoolean(args[4]);
		DieselTrain d=new DieselTrain();
System.out.println("TRAINNAME= "+d.trainName(trainName)+", SPEED= "+d.speed(speed)+", TRAIN NO= "+d.trainNo(trainNo)+", MILEAGE= "+d.getMileage(speed)+", AUTOPILOT FUNCTION= "+d.autoPilot(ispilot)+", AUTOMATIC DOOR CLOSE= "+d.autoDoorClose(isdoor));
	}
}
interface ElectricTrain {
	public boolean autoPilot(boolean ispilot);
	public boolean autoDoorClose(boolean isdoor);
}
class DieselTrain implements ElectricTrain {
	public String trainName(String trainName) {
		return trainName;
	}
	public int speed(int speed) {
		return speed;
	}
	public int trainNo(int trainNo) {
		return trainNo;
	}
	public boolean autoPilot(boolean ispilot) {
		return ispilot;
	}
	public boolean autoDoorClose(boolean isdoor) {
		return isdoor;
	}
	public int getMileage(int speed) {
		if(speed>200) {
			return 6;
		}
		else {
			return 10;
		}
	}
}