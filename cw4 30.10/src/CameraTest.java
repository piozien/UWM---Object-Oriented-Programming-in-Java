public class CameraTest {
    public static void main(String[] args) {
        Camera c1 = new Camera();
        c1.setMegapixels(100);
        String status = c1.upgrade(15);
        System.out.println(status);

    }
}
class Camera{
    private int megapixels;

    public void setMegapixels(int megapixels) {
        this.megapixels = megapixels;
    }
    public String upgrade(int megapixels){
        this.megapixels += megapixels;
        return "Camera upgrade to: " + this.megapixels;
    }
}
