package other;

public class StringAssistant {
    public static String addIndent(String text){
        return "\t" + String.join("\n|\t", text.split("\n"));
    }
}
