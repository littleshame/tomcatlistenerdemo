/**
 * @author: tjc
 * @Date: 2019-8-8
 */
public class LifecycleSupport {

    private Lifecycle lifecycle;

    private LifecycleListener[] listeners = new LifecycleListener[0];

    public LifecycleSupport(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public void addLifecycleListener(LifecycleListener listener){
        LifecycleListener[] res = new LifecycleListener[listeners.length + 1];
        System.arraycopy(listeners,0,res,0,listeners.length);
        res[listeners.length] = listener;
        listeners = res;
    }

    /**
     * 根据传入的生命周期类型，执行监听事件
     * 轮询拥有的监听器，执行每个监听器在该生命周期的事件
     * @param type 生命周期类型
     * @param data
     */
    public void fireLifecycleEvent(String type, Object data) {
        LifecycleEvent event = new LifecycleEvent(lifecycle, type, data);
        //执行监听
        for(LifecycleListener listener : listeners) {
            listener.lifecycleEvent(event);
        }
    }
}
