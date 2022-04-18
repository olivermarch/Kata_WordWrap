public class WordWrap{

    static String lineBreak = "\n";

    public String wrap(String texToWrap, int maxWidth) {

        if (texToWrap.length() <= maxWidth) {

            return texToWrap;
        } else{
            if (texToWrap.contains(" ")) {
                return texToWrap.replace(" ", "\n");
            }
       return texToWrap.substring(0, maxWidth) + lineBreak + texToWrap.substring(maxWidth);
        }
    }
}