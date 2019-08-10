/**
 * @author: tjc
 * @Date: 2019-8-9
 */
public class SimpleLifecycleListener implements LifecycleListener {
    @Override
    public void lifecycleEvent(LifecycleEvent event) {

        Lifecycle lifecycle = event.getLifecycle();
        if(Lifecycle.START_EVENT.equals(event.getType())) {
            System.out.println("listen start doSomething");
        }
        else if(Lifecycle.BEFORE_START_EVENT.equals(event.getType())) {
            System.out.println("listen before start doSomething");
        }
    }
}
