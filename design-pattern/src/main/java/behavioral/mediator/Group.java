package behavioral.mediator;

import java.util.HashSet;
import java.util.Set;

/**
 * <h1>群聊</h1>
 *
 * @author wangjunhao
 **/
public class Group {
    private Set<People> peoples = new HashSet<>();

    public boolean add(People people){
        return peoples.add(people);
    }

    public boolean remove(People people){
        return peoples.remove(people);
    }

    public void notify(String msg){
        peoples.forEach(p -> p.receive(msg));
    }
}
