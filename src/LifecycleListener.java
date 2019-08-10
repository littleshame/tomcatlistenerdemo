/**
 * @author: tjc
 * @Date: 2019-8-9
 */
public interface LifecycleListener {
    /**
     * 具体逻辑中，根据不同的生命周期类型，执行不同的逻辑
     * @param event
     */
    public void lifecycleEvent(LifecycleEvent event);
}
