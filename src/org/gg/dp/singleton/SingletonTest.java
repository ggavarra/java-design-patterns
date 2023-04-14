package org.gg.dp.singleton;

import org.apache.commons.lang3.function.Failable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class SingletonTest {

    @Test
    public void proveReflectionCanBreakSingletonPatten() {

        //EagerSingleton instance;

        Constructor<?>[] declaredConstructors = EagerSingleton.class.getDeclaredConstructors();
        //handling checked exceptions in Lambda - use either Lombok sneakyThrows or Failable.stream form apache.commons.lang
        Failable.stream(Arrays.asList(declaredConstructors)).forEach(constructor -> {
            constructor.setAccessible(true);
            EagerSingleton instance = (EagerSingleton) constructor.newInstance();
            Assertions.assertNotNull(instance);

        });

    }
}
