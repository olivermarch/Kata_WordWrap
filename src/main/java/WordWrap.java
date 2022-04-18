public class WordWrap{

    public String wrap(String texToWrap, int maxWidth) {

        if (texToWrap.length() < maxWidth) {

            return texToWrap;

        } else{
        return null;
        }

    }
}