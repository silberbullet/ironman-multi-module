import Port.LeftArmPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Core {

    private final LeftArmPort leftArmPort;

    public void activate(){
        System.out.println("Core activated");

        leftArmPort.activate();
    }
}
