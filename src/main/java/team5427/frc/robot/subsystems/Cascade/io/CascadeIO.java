package team5427.frc.robot.subsystems.Cascade.io;

<<<<<<< HEAD
import static edu.wpi.first.units.Units.Amp;
=======
>>>>>>> 6d83ad46936f182255bcda14755f4daae85f50d3
import static edu.wpi.first.units.Units.Amps;
import static edu.wpi.first.units.Units.Celsius;
import static edu.wpi.first.units.Units.Meters;
import static edu.wpi.first.units.Units.MetersPerSecond;
import static edu.wpi.first.units.Units.MetersPerSecondPerSecond;
<<<<<<< HEAD
import static edu.wpi.first.units.Units.Radians;
=======
>>>>>>> 6d83ad46936f182255bcda14755f4daae85f50d3
import static edu.wpi.first.units.Units.RadiansPerSecond;
import static edu.wpi.first.units.Units.RadiansPerSecondPerSecond;
import static edu.wpi.first.units.Units.Volts;

import org.littletonrobotics.junction.AutoLog;

import edu.wpi.first.math.geometry.Rotation2d;
<<<<<<< HEAD
=======
import edu.wpi.first.units.measure.Angle;
>>>>>>> 6d83ad46936f182255bcda14755f4daae85f50d3
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
<<<<<<< HEAD
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
=======
    public static class CascadeIOInputs {
        public Distance cascadeMasterDistance = Meters.of(0);
        public LinearVelocity cascadeMasterVelocity = MetersPerSecond.of(0);
        public LinearAcceleration cascadeMasterAcceleration = MetersPerSecondPerSecond.of(0);
        public Voltage cascadeMasterVoltage = Volts.of(0);
        public Current cascadeMasterCurrent = Amps.of(0);
        public Temperature cascadeMasterTemperature = Celsius.of(0);

        public Distance cascadeSlaveDistance = Meters.of(0);
        public LinearVelocity cascadeSlaveVelocity = MetersPerSecond.of(0);
        public LinearAcceleration cascadeSlaveAcceleration = MetersPerSecondPerSecond.of(0);
        public Voltage cascadeSlaveVoltage = Volts.of(0);
        public Current cascadeSlaveCurrent = Amps.of(0);
        public Temperature cascadeSlaveTemperature = Celsius.of(0);
        
        public Rotation2d pivotMasterDistance = new Rotation2d();
        public AngularVelocity pivotMasterVelocity = RadiansPerSecond.of(0);
        public AngularAcceleration pivotMasterAcceleration = RadiansPerSecondPerSecond.of(0);
        public Voltage pivotMasterVoltage = Volts.of(0);
        public Current pivotMasterCurrent = Amps.of(0);
        public Temperature pivotMasterTemperature = Celsius.of(0);

        public Rotation2d pivotSlaveDistance = new Rotation2d();
        public AngularVelocity pivotSlaveVelocity = RadiansPerSecond.of(0);
        public AngularAcceleration pivotSlaveAcceleration = RadiansPerSecondPerSecond.of(0);
        public Voltage pivotSlaveVoltage = Volts.of(0);
        public Current pivotSlaveCurrent = Amps.of(0);
        public Temperature pivotSlaveTemperature = Celsius.of(0);
>>>>>>> 6d83ad46936f182255bcda14755f4daae85f50d3
    }

    public void updateInputs(CascadeIOInputs inputs);

    public void setCascadeSetpoint(Distance setpoint);

    public void setCascadeEncoderPosition(Distance setpoint);
<<<<<<< HEAD

    public void setPivotSetpoint(Rotation2d setpoint);

    public void setCANCoderPosition(Rotation2d angle);

    public void stopCascadeMotors(boolean stopped);

=======
    
    public void setPivotSetpoint(Rotation2d setpoint);
    
    public void setCANCoderPosition(Rotation2d angle);
    
    public void stopCascadeMotors(boolean stopped);
    
>>>>>>> 6d83ad46936f182255bcda14755f4daae85f50d3
    public void stopPivotMotors(boolean stopped);
}
