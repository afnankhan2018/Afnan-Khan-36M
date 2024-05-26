// TextDecorator.java
public abstract class TextDecorator extends Text {
    protected Text decoratedText;

    public TextDecorator(Text decoratedText) {
        super(decoratedText.getText());
        this.decoratedText = decoratedText;
    }

    @Override
    public String getDescription() {
        return decoratedText.getDescription();
    }
}
