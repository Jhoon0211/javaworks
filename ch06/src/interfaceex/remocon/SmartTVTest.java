package interfaceex.remocon;

public class SmartTVTest {

	public static void main(String[] args) {
		
		// SmartTV 객체 생성
		SmartTV stv = new SmartTV();
		
		// 형변환 안하고
		stv.turnOn();
		stv.search("www.google.com");
		stv.setVolume(8);
		RemoteControl.changeBattery();
		stv.turnOff();
		
		System.out.println("****************************");
		// 부모형으로 형변환
		RemoteControl rc = stv;
		Searchable serchable = stv;	
		
		rc.turnOn();
		serchable.search("www.naver.com");
		rc.turnOff();
	}

}
