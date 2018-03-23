public class User {

        private String userid;
        private String name;
        private String github;


    public User(String userid, String name, String github) {
        this.userid = userid;
        this.name = name;
        this.github = github;
    }

    public User(String name, String github) {
        this.name = name;
        this.github = github;
    }


    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", name='" + name + '\'' +
                ", github='" + github + '\'' +
                '}';
    }
}
