package behavioral.interpreter.example;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
public class Test{
    /**
     * 根窗口容器
     */
    private JFrame jFrame;

    /**
     * 当前线段的起点x
     */
    private int xnow;

    /**
     * 当前线段的起点y
     */
    private int ynow;

    /**
     * 构造方法
     */
    public Test(){
        jFrame = new JFrame();
        init();
        //显示窗体
        jFrame.setVisible(true);
    }

    /**
     * 抽取初始化方法
     */
    private void init(){
        //窗口的标题
        jFrame.setTitle("23种设计模式----解释器模式");
        //使用绝对布局
        jFrame.setLayout(null);
        //设置大小
        jFrame.setSize(800, 800);
        //设置初始居中
        jFrame.setLocationRelativeTo(null);
        //设置不可最大化，不可拖动大小
        jFrame.setResizable(false);
        //设置默认关闭方式（有时可能是假关闭）
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //黄色面板
        JPanel topPanel = new JPanel();
        //设置背景色
        topPanel.setBackground(Color.YELLOW);
        //设置黄色面板大小
        topPanel.setSize(jFrame.getSize().width, jFrame.getSize().height/2);
        //设置黄色面板中点为初始点
        xnow = jFrame.getSize().width/2;
        //设置黄色面板中点为初始点
        ynow = jFrame.getSize().height/4;
        //绿色面板
        JPanel botPanel = new JPanel();
        //绿色面板背景
        botPanel.setBackground(Color.GREEN);
        //设置绿色面板大小
        botPanel.setSize(jFrame.getSize().width, jFrame.getSize().height/2);
        //设置绿色面板位置（从哪里开始画）
        botPanel.setLocation(0, jFrame.getSize().height/2);
        //增加文本区控件
        botPanel.add(getJTextArea());
        //把面板加到窗体中
        jFrame.add(topPanel);
        jFrame.add(botPanel);
        //为窗口增加监听方法
        addJFrameCloseListener();
    }

    private JTextArea getJTextArea(){
        JTextArea textArea = new JTextArea();
        //设置文本区的大小
        textArea.setSize(jFrame.getSize().width, jFrame.getSize().height/2);
        //设置文本区自动换行（一行满了换下一行）
        textArea.setLineWrap(true);
        //设置按字符换行（比如每一个字符或者单词的长短不一，不分割字符或者单词进行换行）
        textArea.setWrapStyleWord(true);
        //设置文本区域的背景色
        textArea.setBackground(Color.GREEN);
        //设置文本区域文字的颜色
        textArea.setForeground(Color.BLUE);
        //设置文本区域文字的字体（大小，风格，字体）
        textArea.setFont(getFont());
        //为文本区域增加监听
        addTextAreaListener(textArea);
        return textArea;
    }

    private Font getFont(){
        //创建楷体，实线，23大小的字体
        Font font = new Font("楷体", Font.BOLD, 23);
        return font;
    }

    private void addJFrameCloseListener(){
        //增加窗体监听
        jFrame.addWindowListener(new WindowAdapter() {
            //监听关闭事件
            @Override
            public void windowClosed(WindowEvent e){
                //当窗体关闭后，程序进程也结束
                System.exit(0);
            }
        });
    }

    private void addTextAreaListener(final JTextArea textArea){
        //增加文本区的监听
        textArea.getDocument().addDocumentListener(new DocumentListener() {

            //文本区文本被移除
            @Override
            public void removeUpdate(DocumentEvent e) {
                changedUpdate(e);
            }

            //文本区文本插入
            @Override
            public void insertUpdate(DocumentEvent e) {
                changedUpdate(e);
            }

            //文本区文本改变
            @Override
            public void changedUpdate(DocumentEvent e) {
                char c = textArea.getText().charAt(e.getOffset());
                System.out.println(c);
                draw(c);
            }
        });
    }

    private void draw(char c){
        //获取画图的对象
        Graphics graphics = jFrame.getGraphics();
        //转换为专门画2d图的对象
        Graphics2D graphics2d = (Graphics2D)graphics;
        //设置画图的线的宽度
        graphics2d.setStroke(new BasicStroke(5.0f));
        //设置画图的线的颜色
        graphics2d.setColor(Color.PINK);
        //设置画图的字体
        graphics2d.setFont(getFont());
        //将要画的线段的结束端与开始端相同（点---起点）
        int xnext = xnow;
        int ynext = ynow;
        switch(c){
            //东
            case 'W':
            case 'w':
                xnext = xnow + 10;
                break;
            //南
            case 'S':
            case 's':
                ynext = ynow + 10;
                break;
            //西
            case 'E':
            case 'e':
                xnext = xnow - 10;
                break;
            //北
            case 'N':
            case 'n':
                ynext = ynow - 10;
                break;
            //其他
            default:
                xnext = xnow;
                ynext = ynow;
                break;
        }
        //超出边界的值设置为边界
        xnext = xnext > jFrame.getSize().width ? jFrame.getSize().width : xnext;
        ynext = ynext > jFrame.getSize().height/2 ? jFrame.getSize().height/2 : ynext;
        xnext = xnext < 0 ? 0 : xnext;
        ynext = ynext < 0 ? 0 : ynext;
        //按照起点和终点画线
        graphics2d.drawLine(xnow, ynow, xnext, ynext);
        //把本次线段的终点设置为下一次线段的起点
        xnow = xnext;
        ynow = ynext;
    }

    public static void main(String[] args) {
        new Test();
    }

}
