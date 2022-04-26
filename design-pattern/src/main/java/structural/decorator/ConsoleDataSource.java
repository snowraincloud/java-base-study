package structural.decorator;

import java.util.Scanner;

/**
 * <h1>控制台 读取写入</h1>
 * @author wangjunhao
 **/
public class ConsoleDataSource implements DataSource{

    @Override
    public void writeData(String data) {
        System.out.println(data);
    }

    @Override
    public String readData() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数据：");
        String res = in.nextLine();

        in.close();
        return res;
    }
}
