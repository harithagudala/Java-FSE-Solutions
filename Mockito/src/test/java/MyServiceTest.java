import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class MyServiceTest {


    // Exercise 1: Mocking and Stubbing
    @Test
    public void testExternalApi() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        when(mockApi.getData())
                .thenReturn("Mock Data");

        MyService service = new MyService(mockApi);

        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }



    // Exercise 2: Verifying Interactions
    @Test
    public void testVerifyInteraction() {

        // Step 1: Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);


        // Step 2: Create service with mock
        MyService service = new MyService(mockApi);


        // Step 3: Call service method
        service.fetchData();


        // Step 4: Verify API method was called
        verify(mockApi).getData();

    }

}