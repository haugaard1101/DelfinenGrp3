package Delfinen;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LogTest {

    @Test
    void loadMembers() throws FileNotFoundException {
        DataBase log = new DataBase();
        ArrayList<Member> testList = log.loadMembers();
        assertTrue(testList.size() == 1);
        assertEquals("kasper",testList.get(0).getName());
    }
}