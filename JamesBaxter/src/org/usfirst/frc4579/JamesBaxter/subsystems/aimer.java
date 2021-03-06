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

import org.usfirst.frc4579.JamesBaxter.Robot;
import org.usfirst.frc4579.JamesBaxter.RobotMap;
import org.usfirst.frc4579.JamesBaxter.commands.*;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class aimer extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final DigitalInput raisedLimit = RobotMap.aimerraisedLimit;
    private final DigitalInput loweredLimit = RobotMap.aimerloweredLimit;
    private final SpeedController liftMotor = RobotMap.aimerliftMotor;
    private final AnalogPotentiometer armPot = RobotMap.aimerarmPot;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public boolean lLimitState = loweredLimit.get();
    public boolean rLimitState = raisedLimit.get();
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    // Checking if the value from the tophat is valid
    public boolean checkTophat(){
        final double topHat = Robot.oi.joystick.getRawAxis(6) / 4.0;
    	if(topHat > .25 || topHat < -.25){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
    
   
    // Getting the cannon to move
    public void move(){
        final double topHat = Robot.oi.joystick.getRawAxis(6) / 4.0;
    	liftMotor.set(topHat);
    }
    
    // Stopping the cannon
    public void stop(){
    	liftMotor.set(0);
    }
    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new aim());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
}

