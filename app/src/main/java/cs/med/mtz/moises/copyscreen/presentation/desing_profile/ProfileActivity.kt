package cs.med.mtz.moises.copyscreen.presentation.desing_profile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cs.med.mtz.moises.copyscreen.R
import cs.med.mtz.moises.copyscreen.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    /* */
    private val binding by lazy { ActivityProfileBinding.inflate(layoutInflater) }

    /** */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        execute()
    }
    /** */
    private fun execute(){
        defineText()
        fillRecyclerView(list)
    }

    /** */
    private  fun defineText(){
        binding.tvName.text = getString(R.string.name_profile)
        binding.tvDateOfBirth.text = getString(R.string.date_of_birth_profile)
        binding.tvHobbies.text = getString(R.string.description_hobbies_profile)
    }

    /** */
    private val list = arrayListOf<Product>(
        Product("Braun","portable radio","T 22"),
        Product("Braun","portable radio","T 22"),
    )

    /** */
    private fun fillRecyclerView(product: List<Product>) {
        val songAdapter = ProductAdapter(product )
        binding.rvProduct.adapter = songAdapter
        binding.rvProduct.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
    }
}