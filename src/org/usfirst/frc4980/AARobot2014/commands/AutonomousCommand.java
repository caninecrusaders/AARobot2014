// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc4980.AARobot2014.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4980.AARobot2014.Robot;
/**
 *
 */
public class  AutonomousCommand extends Command {
    public AutonomousCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    // Called just before this Command runs the first time
    protected void initialize() {
        
        //this.setTimeout(5);
   
        
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.driveTrain.driveForward(.25);
        this.setTimeout(5);
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if (this.isTimedOut())
            return true;
        return false;
    }
    // Called once after isFinished returns true
    protected void end() {
        Robot.driveTrain.driveForward(0);
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
