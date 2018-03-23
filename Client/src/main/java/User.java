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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }
}
