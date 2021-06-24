package cs.med.mtz.moises.copyscreen.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cs.med.mtz.moises.copyscreen.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    /** */
    private val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }

    /** */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}