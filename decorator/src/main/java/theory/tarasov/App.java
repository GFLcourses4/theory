package theory.tarasov;

import theory.tarasov.decorator.BlurFilterDecorator;
import theory.tarasov.decorator.BrightnessFilterDecorator;
import theory.tarasov.decorator.GrayscaleFilterDecorator;
import theory.tarasov.decorator.InitialImageFilter;
import theory.tarasov.inheritancedecorator.BaseMessage;
import theory.tarasov.inheritancedecorator.FormattingDecorator;
import theory.tarasov.inheritancedecorator.SignatureDecorator;

public class App {
    public static void main(String[] args) {
        new GrayscaleFilterDecorator(new BlurFilterDecorator(new BrightnessFilterDecorator(new InitialImageFilter()))).applyFilter("image.jpg");
        System.out.println();
        new BlurFilterDecorator(new BrightnessFilterDecorator(new GrayscaleFilterDecorator(new InitialImageFilter()))).applyFilter("another image.jpg");
        System.out.println();
        new SignatureDecorator(new FormattingDecorator(new BaseMessage("some message")), "best regards").send();
        System.out.println();
        new FormattingDecorator(new SignatureDecorator(new BaseMessage("some other message"), "best regards")).send();
    }
}
