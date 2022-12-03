package opportunity;

public class ConfirmedState implements OpportunityState {
    @Override
    public void prev(Opportunity opportunity) {
        opportunity.setState(new InProcessState());
    }

    @Override
    public void next(Opportunity opportunity) {

    }

    @Override
    public void printStatus() {
        System.out.println("Confermata");
    }
}
