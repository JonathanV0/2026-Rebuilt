// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import frc.robot.Constants;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class FeederSubsys extends SubsystemBase {
  /** Creates a new FeederSubsys. */
  public FeederSubsys() {
    indexerMotor0.getConfigurator().apply(Constants.Configs.FEEDER_CONFIG);
    indexerMotor1.getConfigurator().apply(Constants.Configs.FEEDER_CONFIG);
  }

  public void setSpeed(FeederSpeed speed) {
    indexerMotor0.set(speed.value);
    indexerMotor1.set(speed.value);
  }

  public enum FeederSpeed {
    NONE(0),
    MOVEUP(0.5),
    MOVEBACK(-0.5);
    public final double value;
    FeederSpeed(double value) {
      this.value = value;
    }
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
