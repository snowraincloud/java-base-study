package creational.prototype;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>使用 cloneable接口 实现原型模式</h1>
 * <p>
 * 浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。<br>
 * 深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
 * </p>
 * @author wangjunhao
 **/
@ToString
public class Prototype implements Cloneable{

    private String msg;
    private Integer integer;
    private int num;
    private List<Integer> list;
    private int[] arr;

    public Prototype shallowClone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
    /**
     * <p>
     * 实现深克隆
     * 基本类型可以直接赋值进性克隆
     * 引用类型 需要进性递归克隆
     * </p>
     * @return 使用克隆创建的一个新对象
     * @throws CloneNotSupportedException
     */
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        Prototype clone = (Prototype) super.clone();
        // 克隆引用类型
        List<Integer> list = new ArrayList<>(this.list);
        clone.setList(list);

        int[] arr = new int[this.arr.length];
        System.arraycopy(this.arr, 0, arr, 0, this.arr.length);
        clone.setArr(arr);

        return clone;
    }

    public String getMsg() {
        return msg;
    }

    public Prototype setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Integer getInteger() {
        return integer;
    }

    public Prototype setInteger(Integer integer) {
        this.integer = integer;
        return this;
    }

    public int getNum() {
        return num;
    }

    public Prototype setNum(int num) {
        this.num = num;
        return this;
    }

    public List<Integer> getList() {
        return list;
    }

    public Prototype setList(List<Integer> list) {
        this.list = list;
        return this;
    }

    public int[] getArr() {
        return arr;
    }

    public Prototype setArr(int[] arr) {
        this.arr = arr;
        return this;
    }
}
