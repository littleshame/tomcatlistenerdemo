/**
 * @author: tjc
 * @Date: 2019-8-9
 */
public class LifecycleEvent {
    private Object data;
    private Lifecycle lifecycle;
    private String type;

    public LifecycleEvent(Lifecycle lifecycle, String type, Object data) {
        this.lifecycle = lifecycle;
        this.data = data;
        this.type = type;
    }

    public Object getData() {
        return data;
    }

    public Lifecycle getLifecycle() {
        return lifecycle;
    }

    public String getType() {
        return type;
    }
}
