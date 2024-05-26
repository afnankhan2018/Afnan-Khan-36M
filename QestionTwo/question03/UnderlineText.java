// BoldText.java
public class BoldText extends TextDecorator {
    public BoldText(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", bold";
    }
}

// ItalicText.java
public class ItalicText extends TextDecorator {
    public ItalicText(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", italic";
    }
}

// UnderlineText.java
public class UnderlineText extends TextDecorator {
    public UnderlineText(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", underline";
    }
}

// BoldItalicText.java
public class BoldItalicText extends TextDecorator {
    public BoldItalicText(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", bold and italic";
    }
}
