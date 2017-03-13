package StubExample;

public class SimpleService implements Service{

    private Collaborator collaborator;

    public void setCollaborator(Collaborator collaborator) {
        this.collaborator = collaborator;
    }

    public boolean isActive() {
        return collaborator.isActive();
    }
}
