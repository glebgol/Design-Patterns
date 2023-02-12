package mediator;

public class WidgetList extends Widget {
    public WidgetList(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void updateWidget() {
        System.out.println(name + " list update!");
    }

    @Override
    public void queryWidget() {
        System.out.println(name + " list queried!");
    }
}
