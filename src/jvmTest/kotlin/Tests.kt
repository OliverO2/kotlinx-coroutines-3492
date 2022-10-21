import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.withContext
import org.junit.jupiter.api.Test
import reactor.blockhound.BlockHound

class Tests {
    init {
        BlockHound.install()
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun test1() = runTest {
        withContext(Dispatchers.Default) {
            runBlocking {
                delay(1000)
            }
        }
    }
}
