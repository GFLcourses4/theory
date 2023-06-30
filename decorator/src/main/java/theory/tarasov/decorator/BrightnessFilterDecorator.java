package theory.tarasov.decorator;

public class BrightnessFilterDecorator implements ImageFilter {
    private final ImageFilter imageFilter;

    public BrightnessFilterDecorator(ImageFilter imageFilter) {
        this.imageFilter = imageFilter;
    }

    @Override
    public void applyFilter(String image) {
        imageFilter.applyFilter(image);
        System.out.println("Applying brightness filter to image: " + image);
    }
}
