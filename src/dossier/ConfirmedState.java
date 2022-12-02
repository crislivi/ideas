package dossier;

public class ConfirmedState implements DossierState {
    @Override
    public void unassign(Dossier dossier) {

    }

    @Override
    public void next(Dossier dossier) {

    }

    @Override
    public void refuse(Dossier dossier) {
        dossier.setState(new InChargeState());
    }

    @Override
    public void printStatus() {
        System.out.println("Confermata");
    }
}
