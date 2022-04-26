package test;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
public class ComponentTest {
    public static void main(String[] args) {
        IComponent scrollbarText = new ScrollbarDirect(new TextView());
        IComponent blackBorderText = new BlackBorderDirect(new TextView());
        IComponent blackBorderScrollbarText = new BlackBorderDirect(scrollbarText);

        scrollbarText.display();
        System.out.println("-----");
        blackBorderText.display();
        System.out.println("-----");
        blackBorderScrollbarText.display();
        System.out.println("-----");

        IComponent scrollbarPicture = new ScrollbarDirect(new PictureView());
        IComponent blackBorderPicture = new BlackBorderDirect(new PictureView());
        IComponent blackBorderScrollbarPicture = new BlackBorderDirect(scrollbarPicture);

        scrollbarPicture.display();
        System.out.println("-----");
        blackBorderPicture.display();
        System.out.println("-----");
        blackBorderScrollbarPicture.display();
        System.out.println("-----");

    }
}
