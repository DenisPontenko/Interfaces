public class Androids implements Smartphones, LinuxOS {

    @Override
    public void getOperationSystem() {
        System.out.println("Operation System Linux OS");

    }

    @Override
    public void call() {
        System.out.println("0638518545");
    }

    @Override
    public void sms() {
        System.out.println("Hello World");

    }

    @Override
    public void internet() {
        System.out.println("IP: 195.62.15.212");

    }

}
