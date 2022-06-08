package capstone.project.tahun.kedua.daurnusantara.ui.profil

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfilViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Profil Fragment"
    }
    val text: LiveData<String> = _text
}