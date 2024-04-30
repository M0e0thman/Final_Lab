import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner
import com.example.k2024_04_21_livedata_volley.MainActivity
import com.example.k2024_04_21_livedata_volley.view_models.UrlViewModel


@RunWith(MockitoJUnitRunner::class)
class MainActivityTest {

    @Test
    fun testLoadMetadata() {
        val uriViewModel: UrlViewModel = Mockito.mock(UrlViewModel::class.java)
        val mainActivity = MainActivity()

        mainActivity.loadMetadata(uriViewModel)

        Mockito.verify(uriViewModel).nextImageNumber()
    }

}
