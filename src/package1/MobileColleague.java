package package1;
class MobileColleague extends Colleague {

    MobileColleague(Mediator m) {
        super(m);
    }

    public void receive(String message) {
        System.out.println("Mobile Received: " + message);
    }
}