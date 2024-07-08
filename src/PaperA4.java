public class PaperA4 implements Printable,Drawable{
    @Override
    public void print() {
        System.out.println("Print A4 paper");
    }

    @Override
    public void draw() {
        System.out.println("Draw A4 paper");
    }
}
