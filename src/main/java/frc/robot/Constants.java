/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.            */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                 */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
  public final class IntakeConstants {
    public static final int intakeMotorPort = 5;
    public static final int retractSolenoidPort = 4;
    public static final int deploySolenoidPort = 6;

    public static final double intakeCustomPower = 0.7; //0-1.0
  }
  public final class ElectronicsConstants {
    public static PneumaticsModuleType pneumaticsModuleType = PneumaticsModuleType.CTREPCM;
    public static int LEDPort = 0;
  }

  public static final class TowerConstants {
    
    public static final int bottomTowerFeedMotorPort = 14;
    public static final int topTowerFeedMotorPort = 16;

    public static final int bottomTowerSensorPort = 1;
    public static final int topTowerSensorPort = 0;
    public static final double towerMotorSpeed = 0.5;
  }


  public static final class PathPlannerConstants {

    // Autonomous Period Constants TODO: Tune all of these values
    public static final double autoMaxVelocity = 4.5; // meters/second
    public static final double autoMaxAcceleration = 3.25; // meters/second/second
    public static final double kPXController = 1.25;
    public static final double kPYController = 1.25;
    public static final double kPThetaController = 3;
    public static final double kMaxAngularSpeedRadiansPerSecond = Math.PI;
    public static final double kMaxAngularSpeedRadiansPerSecondSquared = Math.PI;
  
    // Constraint for the motion profiled robot angle controller
    public static final TrapezoidProfile.Constraints kThetaControllerConstraints =
      new TrapezoidProfile.Constraints(kMaxAngularSpeedRadiansPerSecond, kMaxAngularSpeedRadiansPerSecondSquared);
  }
  
}
