package opportunity;

public class ClosedState implements OpportunityState {
    @Override
    public void prev(Opportunity opportunity) {

    }

    @Override
    public void next(Opportunity opportunity) {

    }

    @Override
    public void printStatus() {
        System.out.println("Chiusa");
    }
}
