//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
	Robot conor = new Robot();
		//3. Ask the user what color they would like the robot to draw
		String color=JOptionPane.showInputDialog("¿Qué color quieres?");
		//5. Use an if/else statement to set the pen color that the user requested
if(color.equals("green")) {
	
conor.setPenColor(5, 165, 0);
}
   if(color.equals("red"))  {
	   conor.setPenColor(201, 0, 10);//6. If the user doesn’t enter anything, choose a random color
   }
if(color.equals("")) {
	conor.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		conor.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
conor.penDown();
conor.setSpeed(800);
for(int i=0;i<4;i++) {
conor.move(100);
conor.turn(360/4);}

	}
}
