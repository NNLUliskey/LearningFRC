package frc.robot.subsystems;

import java.io.ObjectInputFilter.Status;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.StatusFrame;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.TowerConstants;

public class TowerSubsystem extends SubsystemBase{
   private final WPI_TalonSRX topTowerMotor;
   private final WPI_TalonSRX bottomTowerMotor;

   private final DigitalInput topTowerSensor;
   private final DigitalInput bottomTowerSensor;

   public TowerSubsystem() {
    topTowerMotor = new WPI_TalonSRX(TowerConstants.topTowerFeedMotorPort);
    bottomTowerMotor = new WPI_TalonSRX(TowerConstants.bottomTowerFeedMotorPort);

    topTowerSensor = new DigitalInput(TowerConstants.topTowerSensorPort);
    bottomTowerSensor = new DigitalInput(TowerConstants.bottomTowerSensorPort);

    topTowerMotor.configFactoryDefault();
    bottomTowerMotor.configFactoryDefault();

    topTowerMotor.setNeutralMode(NeutralMode.Brake);
    bottomTowerMotor.setNeutralMode(NeutralMode.Brake);

    topTowerMotor.setInverted(true);
    bottomTowerMotor.setInverted(true);

    topTowerMotor.setStatusFramePeriod(StatusFrame.Status_1_General, 250);
    topTowerMotor.setStatusFramePeriod(StatusFrame.Status_2_Feedback0, 250);

    bottomTowerMotor.setStatusFramePeriod(StatusFrame.Status_1_General, 250);
    bottomTowerMotor.setStatusFramePeriod(StatusFrame.Status_2_Feedback0, 250);
   }
   public void setTowerSpeed(double speed) {
    topTowerMotor.set(speed);
    bottomTowerMotor.set(speed);
   }
   public void setTopTowerSpeed(double speed) {
    topTowerMotor.set(speed);
   }
   public void setBottomTowerSpeed(double speed) {
    bottomTowerMotor.set(speed);
   }
   public void setTowerMaxSpeed() {
    topTowerMotor.set(1.0);
    bottomTowerMotor.set(1.0);
   }
   public void setTowerThirdSpeed() {
    topTowerMotor.set(0.334);
    bottomTowerMotor.set(0.334);
   }
   public void setTowerOffSpeed() {
    topTowerMotor.set(0.0);
    bottomTowerMotor.set(0.0);
   }
   public boolean getBallIsTop() {
    return !topTowerSensor.get();
   }
   public boolean getBallIsBottom() {
    return !bottomTowerSensor.get();
   }

}
