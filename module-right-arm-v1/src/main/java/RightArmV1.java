public class RightArmV1 {

    public void activate() {
        RightArm rightArm = new RightArm();
        RightHand rightHand = new RightHand();
        RightShoulder rightShoulder = new RightShoulder();

        System.out.println("Right Arm Version 1");

        rightArm.activate();
        rightHand.activate();
        rightShoulder.activate();
    }
}
