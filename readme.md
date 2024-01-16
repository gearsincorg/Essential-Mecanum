## Phil's Essential Mecanum

This tutorial presents what I consider the bare essentials for a successful Mecanum Drive system.  It provides stabilized heading for clean strafing, and provides basic drive commands for autonomous.  

Background:  I attend a lot of FTC competitions and I continue to see teams (especially rookies) struggle with controlling Mecanum drive robots in both Teleop and Auto.

The lure of an Omnidirectional robot is strong, but many new factors arise when a team transitions from a basic differential drive to an omni drive.  These include:

1) Many existing code samples don't apply to an Omni robot
2) Omni drive code requires some additional math calculations
3) Omni drive robots need more gamepad inputs for the additional axis of motion (strafing)
4) Omni robots need better motor-speed control to deal with weight imbalances on the robot
5) Omni robots have the undesirable tendency to rotate with strafing
6) Determining distances traveled in Auto is more difficult with an Omni drive.

This tutorial illustrates how my teams solve these problems without taking the next step of adding dead-wheel Odometry Modules.
Our approach is to use the robot's existing built-in sensors like motor encoders and the IMU's Gyro.

To try this code in *Android Studio*:  Simply copy the three Java files into your lowest-level teamcode folder and build your project.

To try this code in *OnBotJava*:  Use the "Upload" button to transfer all three files into your "Project Files" region, and then just do a "Build Everything".

I hope you find this helpful.

Mr. Phil.