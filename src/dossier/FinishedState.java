package dossier;

public class FinishedState implements DossierState {
    @Override
    public void unassign(Dossier dossier) {
        dossier.setState(new UnassignedState());
    }

    @Override
    public void next(Dossier dossier) {
        dossier.setState(new ValidatedState());
    }

    @Override
    public void refuse(Dossier dossier) {
        dossier.setState(new InChargeState());
    }

    @Override
    public void printStatus() {
        System.out.println("Terminata");
    }
}
