import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private Boolean isPublic;
    private ArrayList<Commit> commitsList;

    public Repository(String name, String description, Boolean isPublic) {
        this.name = name;
        this.description = description;
        this.isPublic = isPublic;
        this.commitsList = new ArrayList<Commit>();
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

    private ArrayList<Commit> getCommitsList() {
        return commitsList;
    }

}
