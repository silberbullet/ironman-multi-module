import Port.LeftArmPort;

public class LeftArmV1 implements LeftArmPort {
    @Override
    public void activate() {
        LeftArm leftArm = new LeftArm();
        LeftHand leftHand = new LeftHand();
        LeftShoulder leftShoulder = new LeftShoulder();

        System.out.println("Left Arm Version 1");

        leftArm.activate();
        leftHand.activate();
        leftShoulder.activate();
    }
}
