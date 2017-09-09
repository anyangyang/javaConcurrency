package waitAndNitify.test6;

import java.util.Date;

public class InheritableThreadLocalTest extends  InheritableThreadLocal{

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
