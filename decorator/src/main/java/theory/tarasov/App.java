package theory.tarasov;

import theory.tarasov.decorator.BlurFilterDecorator;
import theory.tarasov.decorator.BrightnessFilterDecorator;
import theory.tarasov.decorator.GrayscaleFilterDecorator;
import theory.tarasov.decorator.InitialImageFilter;

public class App {
    public static void main(String[] args) {
        var decoratedFilter = new GrayscaleFilterDecorator(
                new BlurFilterDecorator(
                        new BrightnessFilterDecorator(
                                new InitialImageFilter()))
        );
        decoratedFilter.applyFilter("image.jpg");
    }
}
