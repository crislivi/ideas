package opportunity;

import dossier.InChargeState;

public interface OpportunityState {

    void prev(Opportunity opportunity);
    void next(Opportunity opportunity);
    default void close(Opportunity opportunity) {
        opportunity.setState(new ClosedState());
    }
    void printStatus();

}
