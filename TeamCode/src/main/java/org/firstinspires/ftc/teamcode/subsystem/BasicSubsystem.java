/**
 * @author DevMello
 */


package org.firstinspires.ftc.teamcode.subsystem;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import org.firstinspires.ftc.robotcore.external.Telemetry;

//this class is an example subsystem, you can use it as a template for your own subsystems
public class BasicSubsystem extends SubsystemBase {
    //this is where you would declare your subsystem's hardware devices
    //for example:
    private DcMotorEx motor;
    // You can also implement a telemetry function to display the status of your subsystem
    private Telemetry telemetry;


    /**
     *
     * @param motor
     * @param telemetry
     * This method is the constructor for the BasicSubsystem class
     * It takes in the hardware devices you use in your subsystem and assigns them to the variables in the subsystem to be used later
     * It also takes in the telemetry object to be used to display the status of the subsystem
     *
     */
    public BasicSubsystem(DcMotorEx motor, Telemetry telemetry) {
        this.motor = motor;
        this.telemetry = telemetry;
    }

    /**
     * This method is used to display the status of the subsystem
     * It is called in the periodic method of the OpMode
     */

}
