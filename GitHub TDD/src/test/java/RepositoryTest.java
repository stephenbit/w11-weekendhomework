import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    private Repository repository1;
    private Repository repository2;
    private Commit commit1;
    private Commit commit2;
    private Commit commit3;
    private Commit commit4;
    private ArrayList commitsList1;
    private ArrayList commitsList2;

    @Before
    public void before() {
        commit1 = new Commit(
                41241,
                "initial commit"
        );
        commit2 = new Commit(
                65769,
                "utilized a superpush"
        );

        commitsList1 = new ArrayList();
        commitsList2 = new ArrayList();

        repository1 = new Repository(
                "GitHub TDD",
                "GitHub test driven development homework",
                false
        );
        repository2 = new Repository(
                "GitHub TDD redo",
                "GitHub test driven development homework (starting over)",
                true
        );
    }

    @Test
    public void canGetRepositoryName() {
        assertEquals("GitHub TDD",
                repository1.getName());
    }

    @Test
    public void canGetRepositoryDescription() {
        assertEquals(
                "GitHub test driven development homework (starting over)",
                repository2.getDescription()
        );
    }

    @Test
    public void canGetType() {
        assertEquals(true, repository2.getIsPublic());
    }

    @Test
    public void canGetCommitsList() {
        commitsList1.add(commit1);
        assertEquals(commit1, getCommitsList());
    }




}
