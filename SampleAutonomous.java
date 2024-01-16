/* Created by Phil Malone. 2023.
    This class illustrates my simplified Odometry Strategy.
    It implements basic straight line motions but with heading and drift controls to limit drift.
    See the readme for a link to a video tutorial explaining the operation and limitations of the code.
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

/*
 * This OpMode illustrates an autonomous opmode using Essential Mecanum functions
 * All robot functions are performed by an external "EssentialMecanumRobot" class that manages all hardware interactions.
 * Pure Drive or Strafe motions are maintained using drive-motor encoders
 * The IMU gyro is used to stabilize the heading during all motions
 */

@Autonomous(name="Sample Autonomous", group = "Mr. Phil")
public class SampleAutonomous extends LinearOpMode
{
    // get an instance of the "Robot" class.
    private EssentialMecanumRobot robot = new EssentialMecanumRobot(this);

    @Override public void runOpMode()
    {
        // Initialize the robot hardware & Turn on telemetry
        robot.initialize(true);

        // Wait for driver to press start
        telemetry.addData(">", "Touch Play to run Auto");
        telemetry.update();

        waitForStart();
        robot.resetHeading();  // Reset heading to set a baseline for Auto

        // Run Auto if stop was not pressed.
        // Note, this example takes about 24 seconds to execute
        if (opModeIsActive())
        {
            // Drive a small rectangle, turning at each corner
            robot.drive(  12, 0.60, 0.25);
            robot.turnTo(90, 0.45, 0.5);
            robot.drive(  24, 0.60, 0.25);
            robot.turnTo(180, 0.45, 0.5);
            robot.drive(  12, 0.60, 0.25);
            robot.turnTo(270, 0.45, 0.5);
            robot.drive(  24, 0.60, 0.25);
            robot.turnTo(0, 0.45, 0.5);

            sleep(500);  // Pause between rectangles

            // Drive the path again without turning.
            robot.drive(  12, 0.60, 0.15);
            robot.strafe( 24, 0.60, 0.15);
            robot.drive( -12, 0.60, 0.15);
            robot.strafe( -24, 0.60, 0.15);
        }
    }
}
