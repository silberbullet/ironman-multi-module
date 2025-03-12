public class LeftArmV1 implements Lef  {
    public void activate() {
        LeftArm leftArm = new LeftArm();
        LeftHand leftHand = new LeftHand();
        LeftShoulder leftShoulder = new LeftShoulder();

        leftArm.activate();
        leftHand.activate();
        leftShoulder.activate();
    }
}
