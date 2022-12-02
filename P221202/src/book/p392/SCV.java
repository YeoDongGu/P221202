package book.p392;

public class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit) r;
			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
				System.out.println("수리중... HP 가 1회복 되었습니다.");
				System.out.println("현재 HP :" + u.hitPoint);
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
}
