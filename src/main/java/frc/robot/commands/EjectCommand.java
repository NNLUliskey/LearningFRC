package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.TowerSubsystem;

public class EjectCommand extends CommandBase{
    IntakeSubsystem intakeSubsystem;
    TowerSubsystem towerSubsystem;
    public EjectCommand(IntakeSubsystem intakeSubsystem, TowerSubsystem towerSubsystem) {
        this.intakeSubsystem = intakeSubsystem;
        this.towerSubsystem = towerSubsystem;
        addRequirements(towerSubsystem,intakeSubsystem);
    }
    @Override
    public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intakeSubsystem.setCustomPower(-0.15);
    towerSubsystem.setTowerSpeed(-0.75);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    towerSubsystem.setTowerOffSpeed();
    intakeSubsystem.setMotorStopped();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;

}
}
