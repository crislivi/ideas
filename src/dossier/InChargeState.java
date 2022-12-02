package dossier;

public class InChargeState implements DossierState{
    @Override
    public void unassign(Dossier dossier) {
        dossier.setState(new UnassignedState());
    }

    @Override
    public void next(Dossier dossier) {
        dossier.setState(new FinishedState());
    }

    @Override
    public void refuse(Dossier dossier) {

    }

    @Override
    public void printStatus() {
        System.out.println("In carico");
    }
}
