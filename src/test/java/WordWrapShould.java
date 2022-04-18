import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordWrapShould {

    /*
    TODO list
    "hola", 7 -> "hola"
    "hola", 2 -> "ho\nla"
    "holaho", 2 -> "ho\nla\nho"
    "hola fulano", 7 -> "hola\nfulano"
    "hola fulano que tal", 7 -> "hola\nfulano\nque\ntal"
    */
    WordWrap wordWrap = new WordWrap();

    @Test
    public void wrap_one_word(){
        assertEquals("hola", wordWrap.wrap("hola",7));
    }
    @Test
    public void split_one_word(){
        assertEquals("ho\nla", wordWrap.wrap("hola",2));

    }
    @Test
    public void replace_spaces_by_break_lines(){
        assertEquals("hola\nfulano", wordWrap.wrap("hola fulano",7));
        assertEquals("hola\nfulano\nque\ntal", wordWrap.wrap("hola fulano que tal",7));

    }


}
