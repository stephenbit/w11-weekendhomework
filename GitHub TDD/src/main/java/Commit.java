public class Commit {

  private Commit commit;
  private int uniqueId;
  private String description;

  public Commit(int uniqueId, String description) {
      this.uniqueId = uniqueId;
      this.description = description;
  }

  public int getCommitUniqueId() {
      return uniqueId;
  }


    public String getCommitDescription() {
      return description;
    }
}
