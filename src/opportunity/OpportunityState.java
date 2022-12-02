package opportunity;

import dossier.InChargeState;

public interface OpportunityState {
    default void close(Opportunity opportunity) {
        opportunity.setState(new ClosedState());
    }
}
