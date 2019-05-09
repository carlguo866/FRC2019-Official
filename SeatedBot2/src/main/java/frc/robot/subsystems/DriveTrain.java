/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.commands.*;
/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  
  public static WPI_TalonSRX FL;
  public static WPI_TalonSRX RL;
  public static WPI_TalonSRX FR;
  public static WPI_TalonSRX RR;
  public static SpeedControllerGroup left, right;
  public static DifferentialDrive drive;    
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DriveWithJoystick());
  }
  public DriveTrain(){
    FL = new WPI_TalonSRX(1); //60

       RL = new WPI_TalonSRX(3);  //40

       FR = new WPI_TalonSRX(2);  //10

       RR = new WPI_TalonSRX(4);    //50

        
       left = new SpeedControllerGroup(FL, RL);

       right = new SpeedControllerGroup(FR, RR);

       drive = new DifferentialDrive(left, right);
  }
}
