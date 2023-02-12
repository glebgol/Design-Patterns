package mediator;

public class Edit extends Widget {
    public Edit(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void updateWidget() {
        System.out.println(name + " is update!");
    }

    @Override
    public void queryWidget() {
        System.out.println(name + " is queried!");
    }
}
