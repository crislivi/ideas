package dossier;

public class AssignedState implements DossierState{
    @Override
    public void unassign(Dossier dossier) {
        dossier.setState(new UnassignedState());
    }

    @Override
    public void next(Dossier dossier) {
        dossier.setState(new InChargeState());
    }

    @Override
    public void refuse(Dossier dossier) {

    }

    @Override
    public void printStatus() {
        System.out.println("Assegnata");
    }
}
