import lombok.RequiredArgsConstructor;


public class Body {

    private final Core core;

    // Body 클래스의 activate 메서드
    public void activate() {
        System.out.println("Body Activated!");
        core.activate();
    }

    public static void main(String[] args) {

    }
}
