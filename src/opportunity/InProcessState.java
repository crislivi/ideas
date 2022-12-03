package opportunity;

public class InProcessState implements OpportunityState {
    @Override
    public void prev(Opportunity opportunity) {
        opportunity.setState(new ToStartState());
    }

    @Override
    public void next(Opportunity opportunity) {
        opportunity.setState(new ValidatedState());
    }

    @Override
    public void printStatus() {
        System.out.println("In lavorazione");
    }
}
