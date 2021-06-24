package cs.med.mtz.moises.copyscreen.presentation.desing_details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cs.med.mtz.moises.copyscreen.R
import cs.med.mtz.moises.copyscreen.databinding.ActivityDetailsProductsBinding


class DetailsProduct : AppCompatActivity() {

    /* */
    private val binding by lazy { ActivityDetailsProductsBinding.inflate(layoutInflater) }

    /** */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupViews()
    }

    /** */
    private fun setupViews() {
        binding.tvTitle.text = getString(R.string.title_products_details)
        binding.tvPrice.text = getString(R.string.price_of_product_details)
        binding.tvColor.text = getString(R.string.color_of_product_details)
        binding.tvDescription.text = getString(R.string.description_of_product_details)
    }
}