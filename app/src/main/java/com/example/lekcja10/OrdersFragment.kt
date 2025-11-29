package com.example.lekcja10

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavDirections
import androidx.navigation.findNavController
import com.example.lekcja10.data.AppViewModel
import com.example.lekcja10.data.ItemType
import com.example.lekcja10.databinding.FragmentOrdersBinding
import java.util.Locale
import kotlin.getValue

class OrdersFragment : Fragment() {

    private var _binding: FragmentOrdersBinding? = null
    private val binding get() = _binding!!

    private val sharedViewModel: AppViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOrdersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sharedViewModel.mealList.observe(viewLifecycleOwner) { orders ->
            orders.forEach { order ->
                val item = LinearLayout(requireContext()).apply {

                    val params = LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                    ).apply {
                        setMargins(32, 32, 32, 32)
                    }
                    val bg = GradientDrawable().apply {
                        cornerRadius = 25f
                        setColor(0xFF943C23.toInt())
                    }
                    orientation = LinearLayout.VERTICAL
                    setPadding(32, 32, 32, 32)

                    layoutParams = params
                    background = bg

                    addView(TextView(requireContext()).apply {
                        text = order.name ?: "Zamówienie"
                        textSize = 24f
                        setTextColor(Color.WHITE)
                    })
                    addView(TextView(requireContext()).apply {
                        text = "Zupa: " + (order.soup?.name ?: "Brak Zupy")
                        textSize = 18f
                        setTextColor(Color.WHITE)
                    })
                    addView(TextView(requireContext()).apply {
                        text = "Drugie Danie: " + (order.second?.name ?: "Brak Drugiego Dania")
                        textSize = 18f
                        setTextColor(Color.WHITE)
                    })
                    addView(TextView(requireContext()).apply {
                        text = "Napój: " + (order.drink?.name ?: "Brak Napoju")
                        textSize = 18f
                        setTextColor(Color.WHITE)
                    })
                }

                binding.myOrders.addView(item)
            }
        }
    }
}