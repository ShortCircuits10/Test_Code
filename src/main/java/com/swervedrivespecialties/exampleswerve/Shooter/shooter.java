/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.swervedrivespecialties.exampleswerve.Shooter;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.swervedrivespecialties.exampleswerve.RobotMap;
import com.swervedrivespecialties.exampleswerve.Shooter.commands.DisableShooter;


public class shooter extends SubsystemBase {
  /**
   * Creates a new shooter.
   */

  public WPI_TalonSRX shootermotor1;
  public WPI_TalonSRX shootermotor2;

  public shooter() {
      shootermotor1 = new WPI_TalonSRX(RobotMap.SHOOTER_MOTOR1);
      shootermotor2 = new WPI_TalonSRX(RobotMap.SHOOTER_MOTOR2);
  }

  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setSpeed (double speed) {
    shootermotor1.set(speed);
    shootermotor2.set(speed);
  }

  public void initDefaultCommand () {
    setDefaultCommand(new DisableShooter());
  }
}
