package theory.tarasov.decorator;

public class BlurFilterDecorator implements ImageFilter {
    private final ImageFilter imageFilter;

    public BlurFilterDecorator(ImageFilter imageFilter) {
        this.imageFilter = imageFilter;
    }

    @Override
    public void applyFilter(String image) {
        imageFilter.applyFilter(image);
        System.out.println("Applying blur filter to image: " + image);
    }
}
