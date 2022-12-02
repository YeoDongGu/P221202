package book.p392;

public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();

		Marine marine = new Marine();
		SCV scv = new SCV();
		tank.setHitPoint(148);
		dropship.setHitPoint(123);
		scv.repair(tank);
		scv.repair(dropship);
//		scv.repair(marine); // Repairable 인터페이스를 implements 하고있지않으므로 에러
	}

}
