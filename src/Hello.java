public class Hello {

    String message = "안녕하세요";

    public Hello() {
        this("안녕하세요");
    }

    public Hello(String message) {
        this.message = message;
    }

    public void say() {
        System.out.println(message);
    }
}
