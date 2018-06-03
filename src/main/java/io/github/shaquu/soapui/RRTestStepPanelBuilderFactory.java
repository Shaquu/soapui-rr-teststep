package io.github.shaquu.soapui;

import com.eviware.soapui.impl.EmptyPanelBuilder;
import com.eviware.soapui.model.PanelBuilder;
import com.eviware.soapui.model.util.PanelBuilderFactory;
import com.eviware.soapui.ui.desktop.DesktopPanel;

public class RRTestStepPanelBuilderFactory implements PanelBuilderFactory<RRTestStep>
{
    @Override
    public PanelBuilder<RRTestStep> createPanelBuilder()
    {
        return new EMailTestStepPanelBuilder();
    }

    @Override
    public Class<RRTestStep> getTargetModelItem()
    {
        return RRTestStep.class;
    }

    public static class EMailTestStepPanelBuilder extends EmptyPanelBuilder<RRTestStep>
    {
        @Override
        public DesktopPanel buildDesktopPanel( RRTestStep modelItem )
        {
            return new RRTestStepDesktopPanel( modelItem );
        }

        @Override
        public boolean hasDesktopPanel()
        {
            return true;
        }
    }
}