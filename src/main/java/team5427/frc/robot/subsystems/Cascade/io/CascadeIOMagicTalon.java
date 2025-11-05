package team5427.frc.robot.subsystems.Cascade.io;

import com.ctre.phoenix6.BaseStatusSignal;
import com.ctre.phoenix6.StatusSignal;
import com.ctre.phoenix6.hardware.CANcoder;
import com.ctre.phoenix6.hardware.ParentDevice;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.units.measure.AngularAcceleration;
import edu.wpi.first.units.measure.AngularVelocity;
import edu.wpi.first.units.measure.Current;
import edu.wpi.first.units.measure.Distance;
import edu.wpi.first.units.measure.LinearAcceleration;
import edu.wpi.first.units.measure.LinearVelocity;
import edu.wpi.first.units.measure.Temperature;
import edu.wpi.first.units.measure.Voltage;
import team5427.frc.robot.subsystems.Cascade.CascadeConstants;
import team5427.lib.motors.MagicSteelTalonFX;
import team5427.lib.motors.MotorConfiguration;

public class CascadeIOMagicTalon implements CascadeIO {
    private MagicSteelTalonFX cascadeMotorMaster;
    private MagicSteelTalonFX cascadeMotorSlave;
    private MagicSteelTalonFX pivotMotorMaster;
    private MagicSteelTalonFX pivotMotorSlave;
    
    private CANcoder pivotCANcoder;

    private StatusSignal<Distance> cascadeDistance;
    private StatusSignal<LinearVelocity> cascadeVelocity;
    private StatusSignal<LinearAcceleration> cascadeAcceleration;
    private StatusSignal<Voltage> cascadeVoltage;
    private StatusSignal<Current> cascadeCurrent;
    private StatusSignal<Temperature> cascadeTemperature;
    private StatusSignal<Rotation2d> pivotDistance;
    private StatusSignal<AngularVelocity> pivotVelocity;
    private StatusSignal<AngularAcceleration> pivotAcceleration;
    private StatusSignal<Voltage> pivotVoltage;
    private StatusSignal<Current> pivotCurrent;
    private StatusSignal<Temperature> pivotTemperature;

    public CascadeIOMagicTalon() {
        cascadeMotorMaster = new MagicSteelTalonFX(CascadeConstants.kCascadeMasterId);
        cascadeMotorSlave = new MagicSteelTalonFX(CascadeConstants.kCascadeSlaveId);
        pivotMotorMaster = new MagicSteelTalonFX(CascadeConstants.kPivotMasterId);
        pivotMotorSlave = new MagicSteelTalonFX(CascadeConstants.kPivotSlaveId);

        cascadeMotorMaster.apply(CascadeConstants.kCascadeDriverConfiguration);
        cascadeMotorSlave.apply(new MotorConfiguration(CascadeConstants.kCascadeDriverConfiguration));
        pivotMotorMaster.apply(CascadeConstants.kPivotConfiguration);
        pivotMotorMaster.apply(new MotorConfiguration(CascadeConstants.kPivotConfiguration));

        pivotCANcoder =
        new CANcoder(
            CascadeConstants.kPivotCANcoderId.getDeviceNumber(),
            CascadeConstants.kPivotCANcoderId.getBus());
        pivotCANcoder.getConfigurator().apply(CascadeConstants.pivotEncoderConfig);


        cascadeCurrent = cascadeMotorMaster.getTalonFX().getStatorCurrent();

        BaseStatusSignal.setUpdateFrequencyForAll(
            50.0,
            cascadeCurrent
        );

        ParentDevice.optimizeBusUtilizationForAll(cascadeMotorMaster.getTalonFX());
    }

    @Override
    public void updateInputs(CascadeIOInputs inputs) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInputs'");
    }

    @Override
    public void setCascadeSetpoint(Distance setpoint) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCascadeSetpoint'");
    }

    @Override
    public void setCascadeEncoderPosition(Distance setpoint) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCascadeEncoderPosition'");
    }

    @Override
    public void setPivotSetpoint(Rotation2d setpoint) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPivotSetpoint'");
    }

    @Override
    public void setCANCoderPosition(Rotation2d angle) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCANCoderPosition'");
    }

    @Override
    public void stopCascadeMotors(boolean stopped) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stopCascadeMotors'");
    }

    @Override
    public void stopPivotMotors(boolean stopped) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stopPivotMotors'");
    }
    
}
