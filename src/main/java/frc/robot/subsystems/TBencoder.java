// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.CANBus;
import com.ctre.phoenix6.hardware.CANcoder;

public class TBencoder extends SubsystemBase {

    private final CANcoder hoodEncoder =
        new CANcoder(1, new CANBus("11256"));

    public TBencoder() {
    }

    public double getAngleDegrees() {
        return hoodEncoder
            .getAbsolutePosition()
            .getValueAsDouble() * 360.0;
    }

    @Override
    public void periodic() {
    SmartDashboard.putNumber("Angle", getAngleDegrees());
    }
}