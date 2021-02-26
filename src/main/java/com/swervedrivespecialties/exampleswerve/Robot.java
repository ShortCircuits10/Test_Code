package com.swervedrivespecialties.exampleswerve;

import com.swervedrivespecialties.exampleswerve.subsystems.DrivetrainSubsystem;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import com.swervedrivespecialties.exampleswerve.Intake.IntakeSub;

public class Robot extends TimedRobot {
    private static OI oi;
    public static IntakeSub INTAKE = new IntakeSub();

    //Was originally public
    public static DrivetrainSubsystem drivetrain;

    public static OI getOi() {
        return oi;
    }

    @Override
    public void robotInit() {
        oi = new OI();
        drivetrain = DrivetrainSubsystem.getInstance();
    }

    @Override
    public void robotPeriodic() {
        Scheduler.getInstance().run();
    }
}
