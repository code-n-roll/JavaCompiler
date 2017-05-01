package junit;

import junit.framework.TestCase;
import pass.DivisionByModule;

public class DivisionByModuleTest extends TestCase {
    private DivisionByModule divisionByModule;

    protected void setUp() throws Exception {
        super.setUp();
        divisionByModule = new DivisionByModule();
    }

    protected void tearDown() throws Exception{
        super.tearDown();
    }

    public void testModule(){
        this.assertEquals(divisionByModule.divideByModule(20,10), 0);
        this.assertEquals(divisionByModule.divideByModule(20,15), 5);
        this.assertEquals(divisionByModule.divideByModule(5, 20), 5);
    }
}