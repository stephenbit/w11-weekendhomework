import java.util.HashMap;

public class Commit {

    private HashMap<Integer, String> commit;

    public Commit(Integer iD, String message) {
        this.commit.put(iD, message);
    }

    public String getCommitMessage(Integer iD) {
        return commit.get(iD);
    }


}
