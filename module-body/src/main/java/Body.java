import Port.LeftArmPort;

import java.util.ServiceLoader;

public class Body {
    public static void main(String[] args) {
        // 모듈 등록
        Core core = new Core();
        RightArmV1 rightArm = new RightArmV1();
        LeftArmPort leftArm = ServiceLoader.load(LeftArmPort.class)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No LeftArm implementation found"));

        // 아이언맨 실행
        core.activate();
        rightArm.activate();
        leftArm.activate();
    }
}
