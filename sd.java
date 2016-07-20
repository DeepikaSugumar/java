import java.text.BreakIterator;

public class ReverseWord {

    public static void main(String[] args) {
        String source = "piglet quantum";
        BreakIterator boundary = BreakIterator.getWordInstance();
        boundary.setText(source);
        int end = boundary.last();
        StringBuilder sb = new StringBuilder();
        for (int start = boundary.previous(); start != BreakIterator.DONE; end = start, start = boundary.previous()) {
            sb.append(source.substring(start, end));
        }
        String reversed = sb.toString();
        System.err.println("'" + reversed + "'");
    }
}