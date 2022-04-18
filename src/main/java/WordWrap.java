public class WordWrap{

    public String wrap(String texToWrap, int maxWidth) {

        if (texToWrap.contains(" ")) {
            String textToFix = texToWrap.replace(" ", "\n");
            return textToFix.replaceAll("(?m)^[ \t]*\r?\n", "");
        }

        if (texToWrap.length() < maxWidth) {
            return texToWrap;
        } else{

            String wrappedText = texToWrap.substring(0, maxWidth) + "\n";
            String lastPartText = texToWrap.substring(maxWidth);
            return wrappedText + wrap(lastPartText, maxWidth).trim();
        }
    }
}