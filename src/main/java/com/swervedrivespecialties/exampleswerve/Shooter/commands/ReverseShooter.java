/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.swervedrivespecialties.exampleswerve.Shooter.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import com.swervedrivespecialties.exampleswerve.Robot;

public class ReverseShooter extends CommandBase {
  /**
   * Creates a new ReverseShooter.
   */
  public ReverseShooter() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.SHOOTER);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    Robot.SHOOTER.setSpeed(0.40);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(final boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
