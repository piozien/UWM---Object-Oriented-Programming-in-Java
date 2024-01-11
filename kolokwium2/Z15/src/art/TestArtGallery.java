package art;

import java.util.ArrayList;

public class TestArtGallery {
    public static void main(String[] args) {
        ArrayList<String> paintingsA1 = new ArrayList<>();
        paintingsA1.add("paint1");
        paintingsA1.add("paint2");
        paintingsA1.add("paint3");
        paintingsA1.add("paint4");
        paintingsA1.add("paint5");

        ArtGallery a1 = new ArtGallery("Name1", "City1", paintingsA1);
        ContemporaryGallery c1 = new ContemporaryGallery("Name1", "City1", paintingsA1, 1);
        System.out.println(a1);
        a1.addPainting("NewPaiting");
        a1.removePainting("paint3");
        System.out.println(a1);
        System.out.println("-----");
        System.out.println(c1);



    }
}
