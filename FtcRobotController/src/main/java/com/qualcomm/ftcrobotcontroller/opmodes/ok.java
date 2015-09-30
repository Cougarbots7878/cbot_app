package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class ok extends OpMode {
    // Comment to test commits
    DcMotor motor1;
    DcMotor motor2;
    @Override
    public void init() {
        motor1 = hardwareMap.dcMotor.get("motor_1");
        motor2 = hardwareMap.dcMotor.get("motor_2");
    }

    @Override
    public void loop() {
        motor1.setPower(1.0);
        motor2.setPower(1.0);

    }
}
