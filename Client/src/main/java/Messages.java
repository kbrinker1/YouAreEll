public class Messages {
    private String sequence;
    private String timestamp;
    private String fromid;
    private String toid;
    private String message;

    public Messages(String sequence, String timestamp, String fromid, String toid, String message) {
        this.sequence = sequence;
        this.timestamp = timestamp;
        this.fromid = fromid;
        this.toid = toid;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Messages{" +
                "sequence='" + sequence + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", fromid='" + fromid + '\'' +
                ", toid='" + toid + '\'' +
                ", message='" + message + '\'' +
                '}';
    }


//timestamp = "2018-03-21T01:00:00.0Z"


}
