package team5427.frc.robot.subsystems.Cascade;

<<<<<<< HEAD
import static edu.wpi.first.units.Units.Meters;

=======
>>>>>>> 6d83ad46936f182255bcda14755f4daae85f50d3
import org.littletonrobotics.junction.Logger;

import edu.wpi.first.units.measure.Distance;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team5427.frc.robot.subsystems.Cascade.io.CascadeIO;
<<<<<<< HEAD
import team5427.frc.robot.subsystems.Cascade.io.CascadeIOMagicTalons;
import team5427.frc.robot.subsystems.Cascade.io.CascadeIO.CascadeIOInputs;
import team5427.frc.robot.subsystems.Cascade.io.CascadeIOInputsAutoLogged;

public class CascadeSubsystem extends SubsystemBase{

    private CascadeIO io;
    private CascadeIOInputsAutoLogged inputs;
=======
import team5427.frc.robot.subsystems.Cascade.io.CascadeIOInputsAutoLogged;
import team5427.frc.robot.subsystems.Cascade.io.CascadeIOMagicTalon;

public class CascadeSubsystem extends SubsystemBase {
    private CascadeIO io;
    private CascadeIOInputsAutoLogged inputs;
    
>>>>>>> 6d83ad46936f182255bcda14755f4daae85f50d3
    private static CascadeSubsystem m_instance;

    private Distance setpoint;

<<<<<<< HEAD
   public static CascadeSubsystem getInstance(){
    if(m_instance == null){
        m_instance = new CascadeSubsystem();
    }
    return m_instance;
   }
   
    public CascadeSubsystem(){
        io = new CascadeIOMagicTalons();
        inputs = new CascadeIOInputsAutoLogged();

   }


    @Override
    public void periodic(){
=======
    public static CascadeSubsystem getInstance() {
        if (m_instance==null)
            m_instance = new CascadeSubsystem();
        return m_instance;
    }

    public CascadeSubsystem() {
        io = new CascadeIOMagicTalon();
        inputs = new CascadeIOInputsAutoLogged();
    }

    @Override
    public void periodic() {
>>>>>>> 6d83ad46936f182255bcda14755f4daae85f50d3
        io.updateInputs(inputs);
        Logger.processInputs("Inputs AutoLogged", inputs);
        io.setCascadeSetpoint(setpoint);
    }
<<<<<<< HEAD
    public void setSetPoint(Distance setpoint){
        this.setpoint = setpoint;
    }
    public void setEncoderPosition(Distance setpoint){
        this.setpoint = setpoint;
    }
    public boolean cascadeGoal(){
        return inputs.cascadeDistance.minus(setpoint).in(Meters) < 0.1;
    }
    //put io override methods in here like above
=======

    public void setSetpoint(Distance setpoint) {
        this.setpoint = setpoint;
    }
>>>>>>> 6d83ad46936f182255bcda14755f4daae85f50d3
}
