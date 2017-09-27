package de.desertrockxxx.megaraid;

public class Guest extends User implements IGuest{
    public Guest(int id) {
        super(id);
    }

    @Override
    public void seeTopic() {
        System.out.println("see topics");
    }
}