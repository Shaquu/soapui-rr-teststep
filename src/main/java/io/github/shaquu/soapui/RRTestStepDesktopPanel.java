package io.github.shaquu.soapui;

import com.eviware.soapui.ui.support.ModelItemDesktopPanel;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.beans.PropertyChangeEvent;
import java.io.IOException;
import java.util.Objects;

public class RRTestStepDesktopPanel extends ModelItemDesktopPanel<RRTestStep>
{

    public RRTestStepDesktopPanel(RRTestStep modelItem )
    {
        super( modelItem );
        buildFX();
    }

    private void buildFX(){
        final JFXPanel fxPanel = new JFXPanel();

        add(fxPanel);

        Platform.runLater(() -> initFX(fxPanel));
    }

    private void initFX(JFXPanel fxPanel) {
        Scene scene = createScene();
        fxPanel.setScene(scene);
    }

    private Scene createScene() {
        Parent root = null;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("teststep.fxml")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert root != null;
        return (new  Scene(root));
    }

    @Override
    public void propertyChange( PropertyChangeEvent evt )
    {
        super.propertyChange( evt );

        /*String newValue = String.valueOf( evt.getNewValue() );
        if( evt.getPropertyName().equals( "subject" ) )
        {
            if( !newValue.equals( subjectField.getText() ) )
                subjectField.setText( newValue );
        }
        else if( evt.getPropertyName().equals( "message" ) )
        {
            if( !newValue.equals( messageField.getText() ) )
                messageField.setText( newValue );
        }*/
    }
}
