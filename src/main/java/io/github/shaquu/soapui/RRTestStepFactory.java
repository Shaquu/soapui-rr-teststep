package io.github.shaquu.soapui;

import com.eviware.soapui.config.TestStepConfig;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestStep;
import com.eviware.soapui.impl.wsdl.teststeps.registry.WsdlTestStepFactory;
import com.eviware.soapui.support.UISupport;

public class RRTestStepFactory extends WsdlTestStepFactory
{
    static final String defaultIconPath = "test.png";
    private static final String stepId = "request-response-test";
    private static final String name = "Request Response TestStep";
    private static final String description = "request-response-test";

    public RRTestStepFactory()
    {
        super( stepId, name, description, defaultIconPath );
        UISupport.addResourceClassLoader(getClass().getClassLoader());
    }

    public WsdlTestStep buildTestStep( WsdlTestCase testCase, TestStepConfig config, boolean forLoadTest )
    {
        return new RRTestStep( testCase, config, forLoadTest );
    }

    public TestStepConfig createNewTestStep( WsdlTestCase testCase, String name )
    {
        TestStepConfig testStepConfig = TestStepConfig.Factory.newInstance();
        testStepConfig.setType( stepId );
        testStepConfig.setName( name );
        return testStepConfig;
    }

    public boolean canCreate()
    {
        return true;
    }
}
