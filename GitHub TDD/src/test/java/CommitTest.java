import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommitTest {

    private Commit commit1;
    private Commit commit2;


    @Before
    public void before() {
        commit1 = new Commit(41241, "initial commit");
        commit2 = new Commit(65769, "refactored the getScore method");
    }

    @Test
    public void canGetCommitUniqueId() {
        assertEquals(65769, commit2.getCommitUniqueId());
    }

    @Test
    public void canGetCommitMessage() {
        assertEquals("initial commit", commit1.getCommitDescription());
    }


}
