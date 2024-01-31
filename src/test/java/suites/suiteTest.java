package suites;

import Allure.MyExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import tests.canaisDeAtendimentoTest;
import tests.medicoTest;
import static core.driverFactory.killDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(MyExtension.class)
public class suiteTest {

    @AfterAll
    public static void finalizarTudo() {
        killDriver();
    }



    @Nested
    @DisplayName("medicoTest")
    class MedicoTest extends medicoTest {

    }

    @Nested
    @DisplayName("canaisDeAtendimentoTest")
    class CanaisDeAtendimentoTest extends canaisDeAtendimentoTest {
    }
}

