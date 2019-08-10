/**
 * @author: tjc
 * @Date: 2019-8-9
 */
public interface Lifecycle {
    public static final String START_EVENT = "start";

    public static final String BEFORE_START_EVENT = "before_start";

    /**
     * 添加监听器
     */
    public void addLifecycleListener(LifecycleListener listener);

    //获取所有监听器

    //删除监听器

    /**
     * 启动
     */

    public void start();

    /**
     * 终止
     */
    public void stop();
}
