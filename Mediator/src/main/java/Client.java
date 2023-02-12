import mediator.IMediator;
import mediator.Mediator;
import mediator.Widgets;

public class Client {
    public static void main(String[] args) {
        IMediator mediator = new Mediator();

        mediator.handleEvent(Widgets.FileList);
        mediator.handleEvent(Widgets.DirList);
        mediator.handleEvent(Widgets.SelectionEdit);
        mediator.handleEvent(Widgets.FilterEdit);
    }
}
