package org.gg.dp.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EnumSingletonTest {

    @Test
    public void proveReflectionCanBreakSingletonPatten() {

        EnumSingleton instance=EnumSingleton.INSTANCE;
        Assertions.assertNotNull(instance);


    }
}