import lejos.nxt.Motor;

public class Move2Sec {
	public static void main(String[] args) {
		try {
			System.out.println("Moving forward...");
			Motor.A.forward();
			Motor.B.forward();
			Thread.sleep(2000);
			System.out.println("Moving backward...");
			Motor.A.backward();
			Motor.B.backward();
			Thread.sleep(2000);
			Motor.A.stop();
			Motor.B.stop();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
