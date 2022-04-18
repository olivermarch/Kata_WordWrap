import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordWrapShould {

    /*
    TODO list
    ("hola", 7) -> "hola"
    */
    WordWrap wordWrap = new WordWrap();

    @Test
    public void wrap_one_word(){

        assertEquals("hola", wordWrap.wrap("hola",7));
    }

}
