package _16_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class RobotThing {
	static Robot rob = new Robot("mini");
public static void main(String[] args) {
	
	rob.penDown();
	rob.setSpeed(70);
	drawSquare();
	
}
public static void drawSquare() {
for(int x = 0; x<4; x++) {
	
	rob.move(100);
	rob.turn(90);
}
}
}
