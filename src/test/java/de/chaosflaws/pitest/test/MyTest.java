package de.chaosflaws.pitest.test;

import de.chaosflaws.pitest.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyTest {
    @Test
    void test_main() {
        Assertions.assertFalse(new Main().someMethod());
    }
}
