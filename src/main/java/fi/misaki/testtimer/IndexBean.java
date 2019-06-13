package fi.misaki.testtimer;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class IndexBean implements Serializable {

    private static final long serialVersionUID = -2897306455314138065L;

    @Inject
    private TestLogic testLogic;

    public String getText() {
        return testLogic.getText();
    }
}
