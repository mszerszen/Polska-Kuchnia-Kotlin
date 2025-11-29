package com.example.lekcja10

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.lekcja10.data.AppViewModel
import com.example.lekcja10.databinding.FragmentOrderSummaryBinding
import java.util.Locale
import kotlin.getValue

class OrderSummaryFragment : Fragment() {

    private var _binding: FragmentOrderSummaryBinding? = null
    private val binding get() = _binding!!

    private val sharedViewModel: AppViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOrderSummaryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.soup.text = "Zupa: " + (sharedViewModel.currentMeal.value.soup?.name ?: "Brak Zupy")
        binding.meal.text = "Drugie Danie: " + (sharedViewModel.currentMeal.value.second?.name ?: "Brak Drugiego Dania")
        binding.drink.text = "Napój: " + (sharedViewModel.currentMeal.value.drink?.name ?: "Brak Napoju")
        binding.BTNAdd.text = "Złóż Zamówienie (" + getFormattedTotal() + ")"

        binding.BTNAdd.setOnClickListener {
            sharedViewModel.setCurrentMealName(binding.TextEditName.text.toString())
            sharedViewModel.addMeal()
            findNavController().navigate(OrderSummaryFragmentDirections.actionOrderSummaryFragmentToHomeFragment())
        }
    }

    private fun getFormattedTotal(): String {
        val total: Double = (sharedViewModel.currentMeal.value.soup?.price ?: 0.0) + (sharedViewModel.currentMeal.value.second?.price ?: 0.0) + (sharedViewModel.currentMeal.value.drink?.price ?: 0.0)

        return String.format(Locale("pl", "PL"), "%.2f zł", total)
    }
}