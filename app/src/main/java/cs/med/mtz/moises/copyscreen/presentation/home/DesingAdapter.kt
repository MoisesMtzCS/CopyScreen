package cs.med.mtz.moises.copyscreen.presentation.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cs.med.mtz.moises.copyscreen.databinding.DesingViewHolderBinding
import cs.med.mtz.moises.copyscreen.presentation.home.entity.Design

class DesingAdapter(
    private val designs: List<Design>,
    private val onSongActionClick: (Design) -> Unit,
) :
    RecyclerView.Adapter<DesingAdapter.DesingViewHolder>() {

    class DesingViewHolder(var binding: DesingViewHolderBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DesingViewHolder {
        val binding =
            DesingViewHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DesingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DesingViewHolder, position: Int) {
        val design: Design = designs[position]
        holder.binding.tvDescription.text = design.description

        holder.itemView.setOnClickListener {
            onSongActionClick(design)
        }
    }

    override fun getItemCount(): Int {
        return designs.size
    }
}