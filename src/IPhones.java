public class IPhones implements Smartphones, IOS {
    @Override
    public void getOperationSystem() {
        System.out.println("Operation System iOS");

    }

    @Override
    public void call() {
        System.out.println("0999226460");

    }

    @Override
    public void sms() {
        System.out.println("Hello Teacher");

    }

    @Override
    public void internet() {
        System.out.println("IP: 217.77.220.150");

    }
}
