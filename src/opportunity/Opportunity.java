package opportunity;

public class Opportunity {

    private OpportunityState state = new ToStartState();

    public OpportunityState getState() {
        return state;
    }

    public void setState(OpportunityState state) {
        this.state = state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void close() {
        state.close(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
