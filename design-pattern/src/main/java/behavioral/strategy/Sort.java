package behavioral.strategy;

/**
 * <h1>策略封装</h1>
 * @author wangjunhao
 **/
public class Sort implements ISort{
    private ISort sort;

    Sort(ISort sort) {
        this.sort = sort;
    }

    @Override
    public void sort(int[] arr) {
        sort.sort(arr);
    }

    // 客户端通过此方法设置不同的策略
    public void setSort(ISort sort) {
        this.sort = sort;
    }
}
