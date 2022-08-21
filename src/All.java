public class All {
    public static void main(String[] args) {
        Smartphones androids = new Androids();
        Smartphones iPhones = new IPhones();

        Smartphones[] smartphone = new Smartphones[]{
                new Androids(), new IPhones()
        };

        for (Smartphones smartphones : smartphone) {
            smartphones.getOperationSystem();
            smartphones.call();
            smartphones.sms();
            smartphones.internet();

        }
    }

}

