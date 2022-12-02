package opportunity;

public class Opportunity {

    private OpportunityState state = new ToStartState();

    public OpportunityState getState() {
        return state;
    }

    public void setState(OpportunityState state) {
        this.state = state;
    }

    public void close() {
        state.close(this);
    }
}
