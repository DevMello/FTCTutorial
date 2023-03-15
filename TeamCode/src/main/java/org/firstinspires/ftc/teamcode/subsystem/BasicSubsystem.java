/**
 * @author DevMello
 */


package org.firstinspires.ftc.teamcode.subsystem;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import org.firstinspires.ftc.robotcore.external.Telemetry;

/**
 * this class is an example subsystem
 * you can use it as a template for your own subsystems
 * */
public class BasicSubsystem extends SubsystemBase {
    //this is where you would declare your subsystem's hardware devices
    //for example:
    private final DcMotorEx motor;
    // You can also implement a telemetry function to display the status of your subsystem
    private final Telemetry telemetry;

    /**
     *
     * @param motor
     * @param telemetry
     * This method is the constructor for the BasicSubsystem class
     * It takes in the hardware devices you use in your subsystem and assigns them to the variables in the subsystem to be used later
     * It also takes in the telemetry object to be used to display the status of the subsystem
     * On Initialization of the constructor also specify specific properties
     * Ex. Here the motor will be set to breaking
     */
    public BasicSubsystem(DcMotorEx motor, Telemetry telemetry) {
        this.motor = motor;
        this.telemetry = telemetry;
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    /**
     * This method is used to display the status of the subsystem
     * It is called in the periodic method of the OpMode
     * The periodic means this method gets check every loop updating the subsystem
     * This specific function updates the Motor Power
     * it uses a lambda callback function to constantly update the Motor Power for the Subsystem
     */
    @Override
    public void periodic(){
        telemetry.addData("Motor Power", motor::getPower);
    }

    /**
     * This is the first real method of the subsystem
     * This method(when called) sets the power of the motor to 1
     * */
    public void run() {
        motor.setPower(1);
    }
    /**
     * This is the second real method of the subsystem
     * This method(when called) sets the power of the motor to 0
     * */
    public void stop(){
        motor.setPower(0);
    }

}
