import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private Boolean isPublic;
    private ArrayList<Commit> commitsList;

    public Repository(String name, String description, Boolean isPublic, ArrayList commitsList) {
        this.name = name;
        this.description = description;
        this.isPublic = isPublic;
        this.commitsList = commitsList;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }

    public int getCommitListSize() {
        return commitsList.size();
    }

    public void addCommit(Commit commit) {
        this.commitsList.add(commit);
    }

//    public ArrayList<Commit> getCommitsList() {
//        return commitsList;
//    }

}
