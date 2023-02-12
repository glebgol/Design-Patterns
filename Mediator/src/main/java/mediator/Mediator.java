package mediator;


public class Mediator implements IMediator {
    protected final Integer COMPONENT_COUNT = 4;
    public Widget[] widgets;

    public Mediator() {
        widgets = new Widget[COMPONENT_COUNT];
        widgets[0] = new Edit(this, "filter");
        widgets[1] = new WidgetList(this, "dir");
        widgets[2] = new WidgetList(this, "file");
        widgets[3] = new Edit(this, "selection");
    }

    public void handleEvent(Widgets which) {
        widgets[which.ordinal()].changed();
        System.out.println();
    }

    public void widgetChanged(Widget theChangedWidget) {
        if (theChangedWidget == widgets[Widgets.FilterEdit.ordinal()]) {
            theChangedWidget.queryWidget();

            widgets[Widgets.SelectionEdit.ordinal()].updateWidget();
            widgets[Widgets.DirList.ordinal()].updateWidget();
            widgets[Widgets.FileList.ordinal()].updateWidget();
        }
        else if (theChangedWidget == widgets[Widgets.SelectionEdit.ordinal()]) {
            theChangedWidget.queryWidget();

            widgets[Widgets.FilterEdit.ordinal()].updateWidget();
            widgets[Widgets.DirList.ordinal()].updateWidget();
            widgets[Widgets.FileList.ordinal()].updateWidget();
        }
        else if (theChangedWidget == widgets[Widgets.FileList.ordinal()]) {
            theChangedWidget.queryWidget();

            widgets[Widgets.FilterEdit.ordinal()].updateWidget();
            widgets[Widgets.DirList.ordinal()].updateWidget();
            widgets[Widgets.SelectionEdit.ordinal()].updateWidget();
        }
        else {
            theChangedWidget.queryWidget();

            widgets[Widgets.FilterEdit.ordinal()].updateWidget();
            widgets[Widgets.FileList.ordinal()].updateWidget();
            widgets[Widgets.SelectionEdit.ordinal()].updateWidget();
        }
    }
}
