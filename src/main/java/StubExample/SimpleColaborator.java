package StubExample;


public class SimpleColaborator implements Collaborator{
    public boolean isActive() {
        return false; // Tu normalnie by było jakieś odwołanie do zewnętrznego systemu
    }

    public String sendMessage() {
        return null; //tu normalnie by było jakieś wysłanie wiadomości
    }
}
