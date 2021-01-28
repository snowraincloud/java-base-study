package se.extend;

/**
 * 测试父类构造函数 调用 被子类覆盖的方法
 * result:
 * Base-construct
 * Construct-cover
 * Construct-construct
 * @author wangjunhao
 **/

class Base{
   public Base(){
      System.out.println("Base-construct");
      cover();
   }

   public void cover(){
      System.out.println("Base-cover");
   }
}

public class Construct extends Base{

   public Construct(){
      super();
      System.out.println("Construct-construct");
   }

   @Override
   public void cover() {
      System.out.println("Construct-cover");
   }

   public static void main(String[] args) {
      new Construct();
   }
}
