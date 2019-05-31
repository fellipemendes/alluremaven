import io.qameta.allure.Step;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstTest {

    @Before
    public void TestInitialize(){
        System.out.println("Inicia Teste..Driver");
    }


    @After
    public void TearDownTest(){
        System.out.println("Finaliza Teste..Drive");
    }

    @Step("Teste método 1")
    @Test
    public void Test1(){
        System.out.println("Executa método 1");
    }

    @Step("Teste método 2")
    @Test
    public void Test2(){
        System.out.println("Executa método 2");
    }

}
