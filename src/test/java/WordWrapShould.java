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
    public void split_one_word_in_any_width(){
        assertEquals("ho\nla", wordWrap.wrap("hola",2));
        assertEquals("ho\nla\nho\nla", wordWrap.wrap("holahola",2));
    }
    @Test
    public void replace_spaces_by_break_lines(){
        assertEquals("uno\ndos\ntres", wordWrap.wrap("uno dos  tres",3));

    }




}
