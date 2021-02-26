package com.swervedrivespecialties.exampleswerve;

import com.swervedrivespecialties.exampleswerve.subsystems.DrivetrainSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.InstantCommand;
//import com.swervedrivespecialties.libs.*;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import com.swervedrivespecialties.libs.XboxController;
import com.swervedrivespecialties.exampleswerve.Intake.commands.*;


public class OI {
    /*
       Add your joysticks and buttons here
     */
    private Joystick primaryJoystick = new Joystick(0);
    public XboxController driver;
    public XboxController operator;

    public OI() {

        driver = new XboxController(0);
        operator = new XboxController(2);
        // Back button zeroes the drivetrain
        new JoystickButton(primaryJoystick, 0).whenPressed(
                new InstantCommand(() -> DrivetrainSubsystem.getInstance().resetGyroscope())
        );
    }

    public Joystick getPrimaryJoystick() {
        return primaryJoystick;
    }
    


{
    new Trigger() {
        public boolean get() {
          if (Robot.INTAKE == null)
            return false;
          return (operator.RT.get() != 0 || operator.LT.get() != 0);
        }
      }.whenActive(new TeleOpIntake());
  
      new Trigger() {
        public boolean get() {
          if (Robot.INTAKE == null)
            return false;
          return (operator.LS.X.get() != 0);
        }
      }.whenActive(new TeleOpBallIntake());
  
      new Trigger() {
        public boolean get() {
          if (Robot.INTAKE == null)
            return false;
          return (operator.RS.X.get() != 0);
        }
      }.whenActive(new TeleOpElevator());
    }
}
  




