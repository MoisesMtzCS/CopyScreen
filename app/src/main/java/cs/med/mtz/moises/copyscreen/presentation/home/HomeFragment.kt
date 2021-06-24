package cs.med.mtz.moises.copyscreen.presentation.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import cs.med.mtz.moises.copyscreen.R
import cs.med.mtz.moises.copyscreen.databinding.FragmentHomeBinding
import cs.med.mtz.moises.copyscreen.presentation.home.entity.Design


class HomeFragment : Fragment() {

    /* */
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }

    /** */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    /** */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        execute()
    }

    /** */
    private val list = arrayListOf(
        Design(1, "Diseño de perfil"),
        Design(2, "Diseño de detalles de la compra"),
        Design(3, "Diseño de inicio de sesion"),
    )

    /** */
    private fun execute() {
        defineText()
        fillRecyclerView(list)

    }

    /** */
    private fun defineText() {
        binding.generalDescription.text = getString(R.string.general_description_home)
    }

    /** */
    private fun fillRecyclerView(design: List<Design>) {
        val designAdapter = DesingAdapter(design, ::onDesignClickListener)
        binding.rvDesigns.adapter = designAdapter
        binding.rvDesigns.layoutManager =
            LinearLayoutManager(requireContext())
    }

    /** */
    private fun onDesignClickListener(design: Design) {
        if (design.id == 1) {
            val direction = HomeFragmentDirections
                .actionHomeFragmentToProfileActivity()
            findNavController().navigate(direction)
        }else if(design.id == 2){
            val direction = HomeFragmentDirections
                .actionHomeFragmentToDetailsProduct()
            findNavController().navigate(direction)
        }else {
            val direction = HomeFragmentDirections
                .actionHomeFragmentToLoginActivity()
            findNavController().navigate(direction)
        }
    }

}