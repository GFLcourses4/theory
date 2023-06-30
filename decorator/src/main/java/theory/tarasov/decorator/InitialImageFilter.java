package theory.tarasov.decorator;

public class InitialImageFilter implements ImageFilter {
    @Override
    public void applyFilter(String image) {
        System.out.println("Applying initial filter to image: " + image);
    }
}
