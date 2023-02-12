package mediator;

public abstract class Widget {
    private final Mediator mediator;
    protected String name;

    public Widget(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void changed() {
        mediator.widgetChanged(this);
    }

    public abstract void updateWidget();
    public abstract void queryWidget();
}
