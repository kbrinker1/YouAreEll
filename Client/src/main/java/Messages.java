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

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getFromid() {
        return fromid;
    }

    public void setFromid(String fromid) {
        this.fromid = fromid;
    }

    public String getToid() {
        return toid;
    }

    public void setToid(String toid) {
        this.toid = toid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


//timestamp = "2018-03-21T01:00:00.0Z"


}
