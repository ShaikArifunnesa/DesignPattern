package package1;

abstract class Colleague {

    private Mediator mediator;

    Colleague(Mediator m) {
        mediator = m;
    }

    /**
     * Sends a message via the mediator
     *
     * 
     */
    public void send(String message) {
        mediator.send(message, this);
    }

    /**
     * Gets access to the mediator
     *
     *
     */
    public Mediator getMediator() {
        return mediator;
    }

    public abstract void receive(String message);
}