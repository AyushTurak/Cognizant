import org.junit.Test;
import org.mockito.Mockito;

public class MyServiceTest {
    @Test
    public void verifyExternalApi() {
        ExternalApi externalApi = Mockito.mock(ExternalApi.class);
        MyService myService = new MyService(externalApi);
        myService.fetchData();
        myService.fetchData();

        Mockito.verify(externalApi, Mockito.times(2)).getData();
    }
}
