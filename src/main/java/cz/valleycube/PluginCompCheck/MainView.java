package cz.valleycube.PluginCompCheck;

import ch.qos.logback.core.Layout;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
@CssImport("./templates/styles.css")
public class MainView extends VerticalLayout {

    public MainView() {


        this.setSizeFull();
        this.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        this.setAlignItems(FlexComponent.Alignment.CENTER);

        Div titleDIV = new Div();
        Div gifDIV = new Div();

        var title = new H1("Plugin Compatibility Checker");
        var subtitle = new H2("Coming soon...");

        Image gif = new Image("https://www.valleycube.cz/settings.gif", "Settings");

        gif.setMaxWidth("25%");

        gifDIV.add(gif);
        titleDIV.add(title, subtitle);

        titleDIV.setClassName("uvod");
        gifDIV.setClassName("uvod");
        gifDIV.setClassName("div");

        this.add(gifDIV, titleDIV);
    }
}
