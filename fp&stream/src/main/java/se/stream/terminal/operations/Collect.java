package se.stream.terminal.operations;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * //TODO
 * collect(Collector)：使用 Collector 收集流元素到结果集合中。
 * collect(Supplier, BiConsumer, BiConsumer)：
 * 同上，第一个参数 Supplier 创建了一个新的结果集合，
 * 第二个参数 BiConsumer 将下一个元素收集到结果集合中，
 * 第三个参数 BiConsumer 用于将两个结果集合合并起来。
 * 只有当stream是parallel时 并发时创建多个集合 才会使用第三个参数
 * @author wangjunhao
 **/

public class Collect {

    public static void main(String[] args) {

        Set<Integer> set = new RandomPair().stream()
                .limit(8)
                .map(Pair::getI)
//                .collect(Collectors.toSet());
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);

        List<Integer> list = new RandomPair().stream()
                .limit(8)
                .map(Pair::getI)
                .collect(Collectors.toList());

        System.out.println(list);

        Map<Integer, Character> map =
                new RandomPair().stream()
                        .limit(8)
                        .collect(
                                Collectors.toMap(Pair::getI, Pair::getC));
        System.out.println(map);


        ArrayList<Integer> words =
                new RandomPair().stream()
                        .limit(8)
                        .map(Pair::getI)
                        .collect(ArrayTest::new,
                                ArrayTest::add,
                                ArrayTest::addAll);
        words.stream()
                .forEach(System.out::println);
        words =
                new RandomPair().stream()
                        .limit(8)
                        .parallel()
                        .map(Pair::getI)
                        .collect(ArrayTest::new,
                                ArrayTest::add,
                                ArrayTest::addAll);
        words.stream()
                .forEach(System.out::println);
    }
}

class ArrayTest<E> extends ArrayList<E>{
    public ArrayTest() {
        super();
        System.out.println("ArrayTest");
    }

    @Override
    public boolean add(E e) {
        System.out.println("add(E e)");
        return super.add(e);
    }

    @Override
    public void add(int index, E element) {
        System.out.println("add(int index, E element)");
        super.add(index, element);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        System.out.println("addAll(Collection<? extends E> c)");
        return super.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        System.out.println("addAll(int index, Collection<? extends E> c)");
        return super.addAll(index, c);
    }
}

class Pair {
    public final Character c;
    public final Integer i;
    Pair(Character c, Integer i) {
        this.c = c;
        this.i = i;
    }
    public Character getC() { return c; }
    public Integer getI() { return i; }
    @Override
    public String toString() {
        return "Pair(" + c + ", " + i + ")";
    }
}
class RandomPair {
    Random rand = new Random(45);
    // An infinite iterator of random capital letters:
    Iterator<Character> capChars = rand.ints(63,91)
            .mapToObj(i -> (char)i)
            .iterator();
    public Stream<Pair> stream() {
        return rand.ints(98, 1000).distinct()
                .mapToObj(i -> new Pair(capChars.next(), i));
    }
}

