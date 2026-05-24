/*
By Mara Dimitroff 5/23/2026
This program is a basic set up for an autonomous program. It initializes 4 motors and 1 servo.
Students can use this code as a quick copy-paste start for any auto code.
 */

package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "BlankTeleOp")
public class BlankTeleOp extends LinearOpMode {

    private DcMotor fLeft, bLeft, fRight, bRight;
    private CRServo servo1;

    @Override
    public void runOpMode() {

        fLeft  = hardwareMap.get(DcMotor.class, "fLeft");
        bLeft  = hardwareMap.get(DcMotor.class, "bLeft");
        fRight = hardwareMap.get(DcMotor.class, "fRight");
        bRight = hardwareMap.get(DcMotor.class, "bRight");

        servo1  = hardwareMap.get(CRServo.class, "ServoOne");

        fLeft.setDirection(DcMotor.Direction.FORWARD);
        bLeft.setDirection(DcMotor.Direction.FORWARD);
        fRight.setDirection(DcMotor.Direction.REVERSE);
        bRight.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();


    }


}
