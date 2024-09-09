import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private val _test = MutableLiveData<String>()
    val test: LiveData<String> get() = _test

    fun updateTest(newTest: String) {
        _test.value = newTest
    }
}
