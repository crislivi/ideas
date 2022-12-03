package opportunity;

public class ValidatedState implements OpportunityState {

    @Override
    public void prev(Opportunity opportunity) {
        opportunity.setState(new InProcessState());
    }

    @Override
    public void next(Opportunity opportunity) {
        opportunity.setState(new ConfirmedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Validata");
    }
}
