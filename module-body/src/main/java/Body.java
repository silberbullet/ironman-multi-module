import Port.LeftArmPort;

import java.util.ServiceLoader;

public class Body {

    public static void main(String[] args) {
        RightArmV1 rightArm = new RightArmV1();
        Core core = new Core();

        // ServiceLoader를 사용하여 LeftArmPort 구현체 자동 주입
        LeftArmPort leftArm = ServiceLoader.load(LeftArmPort.class)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No LeftArm implementation found"));

        core.activate();
        rightArm.activate();
        leftArm.activate();
    }
}
