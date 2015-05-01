import lejos.nxt.Motor;
import lejos.nxt.TouchSensor;
import lejos.nxt.SensorPort;

public class DriveButton {

	public static void main(String[] args) {
		try {
			System.out.println("Press the touch sensor to begin movement, press again to stop.");

			TouchSensor touch = new TouchSensor(SensorPort.S1);
            boolean previousTouch = false;
            boolean forward = true;
            boolean running = true;

            while (running) {
                boolean sensorPressed = touch.isPressed();

                if (sensorPressed && previousTouch != sensorPressed) {
                    System.out.println("Pressed...");
                    forward = !forward;
                    System.out.println(forward);

                    if (forward) {
                        Motor.A.forward();
                        Motor.B.forward();
                    } else {
                        Motor.A.stop();
                        Motor.B.stop();
                    }
                }
                previousTouch = sensorPressed;
            }
		} catch (Exception e) {
            e.printStackTrace();
        }
	}

}
