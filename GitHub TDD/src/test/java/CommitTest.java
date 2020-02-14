import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    private Commit commit1;
    private Commit commit2;


    @Before
    public void before() {
        commit1 = new Commit(41241, "initial commit");
        commit2 = new Commit(65769, "new commit");
    }

    @Test
    public void canGetCommitMessage() {
        assertEquals("new commit", commit2.getCommitMessage(65769));
    }


}
