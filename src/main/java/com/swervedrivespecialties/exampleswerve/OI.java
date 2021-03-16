package com.swervedrivespecialties.exampleswerve;

import com.swervedrivespecialties.exampleswerve.subsystems.DrivetrainSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.InstantCommand;
//import com.swervedrivespecialties.libs.*;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import com.swervedrivespecialties.libs.XboxController;

import com.swervedrivespecialties.exampleswerve.Intake.commands.TeleOpIntake;
import com.swervedrivespecialties.exampleswerve.Intake.commands.TeleOpBallIntake;
import com.swervedrivespecialties.exampleswerve.Intake.commands.TeleOpElevator;

import com.swervedrivespecialties.exampleswerve.Shooter.commands.Shooter;
import com.swervedrivespecialties.exampleswerve.Shooter.commands.DisableShooter;


public class OI {
    /*
       Add your joysticks and buttons here
     */
    private Joystick primaryJoystick = new Joystick(0);
    public XboxController driver;
    public XboxController operator;

    public OI() {

        driver = new XboxController(0);
        operator = new XboxController(1);



        // Shooter
        operator.A.whenPressed(new Shooter());
        //operator.B.whenPressed(new ReverseShooter());
        operator.X.whenPressed(new DisableShooter());
        operator.X.whenPressed(new DisableShooter());


        // Back button zeroes the drivetrain
        new JoystickButton(primaryJoystick, 0).whenPressed(
                new InstantCommand(() -> DrivetrainSubsystem.getInstance().resetGyroscope())
        );
    }

    public Joystick getPrimaryJoystick() {
        return primaryJoystick;
    }

    // Shooter code
  
    


    //Intake code

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
          return (operator.LS.Y.get() != 0);
        }
      }.whenActive(new TeleOpBallIntake());
  
      new Trigger() {
        public boolean get() {
          if (Robot.INTAKE == null)
            return false;
          return (operator.RS.Y.get() != 0);
        }
      }.whenActive(new TeleOpElevator());
    }
}
  




