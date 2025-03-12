import Port.LeftArmPort;

public class LeftArmV2 implements LeftArmPort {
    @Override
    public void activate() {
        LeftArm leftArm = new LeftArm();
        LeftHand leftHand = new LeftHand();
        LeftShoulder leftShoulder = new LeftShoulder();

        System.out.println("Left Arm Version 2");
        
        leftArm.activate();
        leftHand.activate();
        leftShoulder.activate();
    }
}
