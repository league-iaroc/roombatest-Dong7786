import processing.core.PApplet;

/***
 * This is the  class where the student will write their robot code.
 * 
 * @author Keith
 *
 */
public class Brain extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("Processing");
	}

	public Brain(Roomba roomba) {
		super(roomba);
		this.roomba = roomba;
	}

	/**
	 * The initialize method will be called once at the start of the program.
	 * (think of "setup method in processing")
	 */
	public void initialize() {
//		sleep(2197);
//driveDirect(-1000,-1000);
//		sleep(1200);
//		driveDirect(-100,50);
//		sleep(2197);
//		driveDirect(-1000,-1000);
//		sleep(3500);
//		driveDirect(-100,50);
//		sleep(2197);
//		driveDirect(-1000000000,-1000000000);
//	
	}

	/**
	 * The loop method repeats (think of the draw method)
	 */
	public void loop() {
		if(isBumpedRight()&&isBumpedLeft()){
			driveDirect(-100,50);
			sleep(100);
			driveDirect(-1000000000,-1000000000);

		}else{
			driveDirect(-1000,-1000);
		}
	}

}