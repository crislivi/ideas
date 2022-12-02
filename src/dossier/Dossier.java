package dossier;

public class Dossier {
    private DossierState state = new UnassignedState();

    public DossierState getState() {
        return state;
    }

    public void setState(DossierState state) {
        this.state = state;
    }

    public void unassign() {
        state.unassign(this);
    }

    public void next() {
        state.next(this);
    }

    public void refuse() {
        state.refuse(this);
    }

    public void printStatus() {
        state.printStatus();
    }

}
