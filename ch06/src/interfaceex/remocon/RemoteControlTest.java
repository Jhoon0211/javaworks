package interfaceex.remocon;

public class RemoteControlTest {

	public static void main(String[] args) {

		RemoteControl rcTV = new Television();
		
		rcTV.turnOn();
		rcTV.setVolume(8);
		rcTV.turnOff();
	}

}
