package models;

public abstract class Profile {
    private String name;
    private Picture profilePicture;
    private User user;

    public Profile(User user) {
        this.user = user;
    }

    public Profile(String name, Picture profilePicture, User user) {
        this.name = name;
        this.profilePicture = profilePicture;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Picture getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Picture profilePicture) {
        this.profilePicture = profilePicture;
    }

    public void publishNotification() {
        System.out.println("Notification published.");
    }
}
