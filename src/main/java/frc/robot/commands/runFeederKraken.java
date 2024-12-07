// runKraken

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Feeder;

public class runFeederKraken extends Command {
  Feeder m_kraken;
  double m_speed;

  public runFeederKraken(Feeder kraken, double speed) {
    this.m_kraken = kraken;
    this.m_speed = speed;
    addRequirements(m_kraken);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    m_kraken.run(m_speed);
  }

  @Override
  public void end(boolean interrupted) {
    m_kraken.run(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}