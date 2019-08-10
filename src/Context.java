/**
 * @author: tjc
 * @Date: 2019-8-8
 */
public class Context implements Lifecycle {

    public static final String START_EVENT = "start";

    LifecycleSupport lifecycle = new LifecycleSupport(this);

    @Override
    public void addLifecycleListener(LifecycleListener listener) {
        lifecycle.addLifecycleListener(listener);
    }

    public void start() {
        lifecycle.fireLifecycleEvent(START_EVENT, null);
    }

    @Override
    public void stop() {

    }

    public static void main(String[] args) {
        Context context = new Context();
        //加载监听器
        context.addLifecycleListener(new SimpleLifecycleListener());
        context.start();
    }
}
