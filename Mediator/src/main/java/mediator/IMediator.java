package mediator;

public interface IMediator {
    void handleEvent(Widgets which);
    void widgetChanged(Widget theChangedWidget);
}
