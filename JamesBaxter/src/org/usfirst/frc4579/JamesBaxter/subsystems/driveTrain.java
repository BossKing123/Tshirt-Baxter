// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4579.JamesBaxter.subsystems;

import org.usfirst.frc4579.JamesBaxter.RobotMap;
import org.usfirst.frc4579.JamesBaxter.commands.*;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class driveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController flMotor = RobotMap.driveTrainflMotor;
    private final SpeedController frMotor = RobotMap.driveTrainfrMotor;
    private final SpeedController rlMotor = RobotMap.driveTrainrlMotor;
    private final SpeedController rrMotor = RobotMap.driveTrainrrMotor;
    private final AnalogGyro robotGyro = RobotMap.driveTrainrobotGyro;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    RobotDrive robotDrive = new RobotDrive(flmotor, rlmotor, frmotor, rrmotor)

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void drive(){
    	robotDrive.mecanumDrive_Cartesian(x, y, rotation, gyroAngle);
    	
    }
    
    
    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new drive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
}

