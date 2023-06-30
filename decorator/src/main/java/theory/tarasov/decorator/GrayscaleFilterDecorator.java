package theory.tarasov.decorator;

public class GrayscaleFilterDecorator implements ImageFilter{
    private final ImageFilter imageFilter;

    public GrayscaleFilterDecorator(ImageFilter imageFilter) {
        this.imageFilter = imageFilter;
    }

    @Override
    public void applyFilter(String image) {
        imageFilter.applyFilter(image);
        System.out.println("Applying grayscale filter to image: " + image);
    }
}
