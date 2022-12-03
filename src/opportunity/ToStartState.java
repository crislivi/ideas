package opportunity;

public class ToStartState implements OpportunityState {
    @Override
    public void prev(Opportunity opportunity) {

    }

    @Override
    public void next(Opportunity opportunity) {
        opportunity.setState(new InProcessState());
    }

    @Override
    public void printStatus() {
        System.out.println("Da avviare");
    }
}
