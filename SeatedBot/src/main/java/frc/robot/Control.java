package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * The operate/2nd joystick is fully optional.
 * if that stick is not needed, set it to null
 */
public class Control{
    private static Control instance;
    public static Control getInstance() {
        if(instance==null)
            synchronized(Control.class){
                if(instance==null)
                    instance=new Control();
            }
        return instance;
    }
    
    private Joystick drive=new Joystick(0);
    private Joystick operate=new Joystick(1);

    public boolean isEstop() {
        return drive.getRawButton(1);
    }
    
    //drivetrain starts
    public double getForwardThrottle() {return drive.getRawAxis(1) * -1;}
    public double getRotationThrottle() {return drive.getRawAxis(0);}

   
}