package dossier;

public class UnassignedState implements DossierState {
    @Override
    public void unassign(Dossier dossier) {}

    @Override
    public void next(Dossier dossier) {
        dossier.setState(new AssignedState());
    }

    @Override
    public void refuse(Dossier dossier) {}

    @Override
    public void printStatus() {
        System.out.println("Da assegnare");
    }
}
