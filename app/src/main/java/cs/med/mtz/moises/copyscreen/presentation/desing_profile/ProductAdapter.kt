package cs.med.mtz.moises.copyscreen.presentation.desing_profile

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cs.med.mtz.moises.copyscreen.databinding.ProductViewHolderBinding

class ProductAdapter(private val products: List<Product>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    /** */
    class ProductViewHolder(var binding: ProductViewHolderBinding) : RecyclerView.ViewHolder(binding.root)

    /** */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = ProductViewHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding)
    }

    /** */
    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product: Product = products[position]
        holder.binding.tvTitle.text = product.title
        holder.binding.tvDescription.text = product.description
        holder.binding.tvDescription2.text = product.description2
    }

    /** */
    override fun getItemCount(): Int {
        return products.size
    }
}