// Intake and Feeder Motor Test
// Version 1

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import frc.robot.subsystems.Feeder;
import frc.robot.subsystems.Intake;

import frc.robot.commands.intaking;

public class RobotContainer {
  Joystick ps5 = new Joystick(0);
  Feeder feederKraken = new Feeder();
  Intake intakeKraken = new Intake();

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(ps5, 1).whileTrue(new intaking(intakeKraken, 0.7, feederKraken, 1));
    new JoystickButton(ps5, 2).whileTrue(new intaking(intakeKraken, -0.7, feederKraken, -1));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
