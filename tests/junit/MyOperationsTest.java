package junit;

import pass.MyOperations;
import junit.framework.TestCase;

public class MyOperationsTest extends TestCase{
    private MyOperations myOperations;

    protected void setUp() throws Exception{
        super.setUp();
        myOperations = new MyOperations();
    }

    protected void tearDown() throws Exception{
        super.tearDown();
    }

    public void testModAssign(){
        this.assertEquals(myOperations.modAssign(10,3),1);
        this.assertEquals(myOperations.modAssign(25,3),1);
        this.assertEquals(myOperations.modAssign(0,3),0);
    }

    public void testLogicalOr(){
        this.assertEquals(myOperations.logicalOr(true,false),true);
        this.assertEquals(myOperations.logicalOr(false,true),true);
        this.assertEquals(myOperations.logicalOr(false,false),false);
        this.assertEquals(myOperations.logicalOr(true,true),true);

    }
}