package cs.med.mtz.moises.copyscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cs.med.mtz.moises.copyscreen.databinding.ActivityMain2Binding
import cs.med.mtz.moises.copyscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /* */
    private val binding by lazy { ActivityMain2Binding.inflate(layoutInflater) }

    /** */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}