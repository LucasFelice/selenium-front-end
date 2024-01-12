package suites;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.canaisDeAtendimentoTest;
import tests.medicoTest;

import static core.driverFactory.killDriver;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        medicoTest.class,
        canaisDeAtendimentoTest.class
})

public class suiteTest {
    @AfterClass
    public static void finalizarTudo() {
        killDriver();
    }
}
