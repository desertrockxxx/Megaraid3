package de.desertrockxxx.megaraid;

public class RegisteredUser extends User implements IRegisteredUser, IGuest{
    private String firstname;
    private String lastname;
    private String username;
    private String password;

    private Topic topic;

    public RegisteredUser(int id, String firstname, String lasstname, String username, String password) {
        super(id);
        this.firstname = firstname;
        this.lastname = lasstname;
        this.username = username;
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLasstname() {
        return lastname;
    }

    public void setLasstname(String lasstname) {
        this.lastname = lasstname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    @Override
    public void createNewTopic() {
        getTopic().setId(1);
        getTopic().setName("Name");
        getTopic().setContent("Content");
    }

    @Override
    public void seeTopic() {
        getTopic().getId();
        getTopic().getName();
        getTopic().getContent();
    }



}
