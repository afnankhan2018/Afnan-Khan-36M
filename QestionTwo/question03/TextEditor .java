// TextEditor.java
public class TextEditor {
    public static void main(String[] args) {
        Text myText = new Text("I am a DP");
        System.out.println(myText.getDescription());

        Text boldText = new BoldText(myText);
        System.out.println(boldText.getDescription());

        Text boldItalicText = new BoldItalicText(boldText);
        System.out.println(boldItalicText.getDescription());

        Text underlineText = new UnderlineText(boldItalicText);
        System.out.println(underlineText.getDescription());
    }
}
