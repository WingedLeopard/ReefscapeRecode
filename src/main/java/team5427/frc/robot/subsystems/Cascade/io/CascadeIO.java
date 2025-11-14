package team5427.frc.robot.subsystems.Cascade.io;

import static edu.wpi.first.units.Units.Amp;
import static edu.wpi.first.units.Units.Amps;
import static edu.wpi.first.units.Units.Celsius;
import static edu.wpi.first.units.Units.Meters;
import static edu.wpi.first.units.Units.MetersPerSecond;
import static edu.wpi.first.units.Units.MetersPerSecondPerSecond;
import static edu.wpi.first.units.Units.Radians;
import static edu.wpi.first.units.Units.RadiansPerSecond;
import static edu.wpi.first.units.Units.RadiansPerSecondPerSecond;
import static edu.wpi.first.units.Units.Volts;

import org.littletonrobotics.junction.AutoLog;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.units.measure.AngularAcceleration;
import edu.wpi.first.units.measure.AngularVelocity;
import edu.wpi.first.units.measure.Current;
import edu.wpi.first.units.measure.Distance;
import edu.wpi.first.units.measure.LinearAcceleration;
import edu.wpi.first.units.measure.LinearVelocity;
import edu.wpi.first.units.measure.Temperature;
import edu.wpi.first.units.measure.Voltage;

public interface CascadeIO {
    @AutoLog
    public static class CascadeIOInputs{
        public Distance cascadeDistance = Meters.of(0);
        private LinearVelocity cascadeVelocity = MetersPerSecond.of(0);
        private LinearAcceleration cascadeAcceleration = MetersPerSecondPerSecond.of(0);
        private Voltage cascadVoltage = Volts.of(0);
        private Current cascadCurrent = Amps.of(0);
        private Temperature cascadeTemperature = Celsius.of(0);


        private Rotation2d pivotDistance = new Rotation2d();
        private AngularVelocity pivotVelocity = RadiansPerSecond.of(0);
        private AngularAcceleration pivotAcceleration = RadiansPerSecondPerSecond.of(0);
        private Voltage pivotVoltage = Volts.of(0);
        private Current pivotCurrent = Amps.of(0);
        private Temperature pivotTemperature = Celsius.of(0);
    }

    public void updateInputs(CascadeIOInputs inputs);

    public void setCascadeSetpoint(Distance setpoint);

    public void setCascadeEncoderPosition(Distance setpoint);

    public void setPivotSetpoint(Rotation2d setpoint);

    public void setCANCoderPosition(Rotation2d angle);

    public void stopCascadeMotors(boolean stopped);

    public void stopPivotMotors(boolean stopped);
}
