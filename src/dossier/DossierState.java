package dossier;

public interface DossierState {

    void unassign(Dossier dossier);
    void next(Dossier dossier);
    void refuse(Dossier dossier);

    void printStatus();
}
