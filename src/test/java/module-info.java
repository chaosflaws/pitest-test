module de.chaosflaws.pitest.test {
    requires de.chaosflaws.pitest;
    requires org.junit.jupiter.api;

    opens de.chaosflaws.pitest.test to org.junit.jupiter.api;
}
