package com.example.lekcja10

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.example.lekcja10.data.AppViewModel
import com.example.lekcja10.data.ItemType
import com.example.lekcja10.data.Meal
import com.example.lekcja10.data.MenuItem
import com.example.lekcja10.databinding.FragmentCustomMealBinding

class CustomMealFragment : Fragment() {

    private var _binding: FragmentCustomMealBinding? = null
    private val binding get() = _binding!!

    private val sharedViewModel: AppViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCustomMealBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.BTNAdd.setOnClickListener {
            var action: NavDirections? = null
            when(sharedViewModel.currentStep.value) {
                ItemType.SOUP -> {
                    action = CustomMealFragmentDirections.actionCustomMealFragmentToMealListFragment()
                    sharedViewModel.setCurrentMealData(
                        MenuItem(
                            name = binding.TextEditName.text.toString(),
                            description = binding.TextEditDesc.text.toString(),
                            type = ItemType.SOUP,
                            price = 20.0,
                            image = null
                        ),
                        ItemType.SOUP
                    )
                    sharedViewModel.setCurrentStep(ItemType.MEAL)
                }
                ItemType.MEAL -> {
                    action = CustomMealFragmentDirections.actionCustomMealFragmentToMealListFragment()
                    sharedViewModel.setCurrentMealData(
                        MenuItem(
                            name = binding.TextEditName.text.toString(),
                            description = binding.TextEditDesc.text.toString(),
                            type = ItemType.MEAL,
                            price = 20.0,
                            image = null
                        ),
                        ItemType.MEAL
                    )
                    sharedViewModel.setCurrentStep(ItemType.DRINK)
                }
                else -> {
                    action = CustomMealFragmentDirections.actionCustomMealFragmentToOrderSummaryFragment()
                    sharedViewModel.setCurrentMealData(
                        MenuItem(
                            name = binding.TextEditName.text.toString(),
                            description = binding.TextEditDesc.text.toString(),
                            type = ItemType.DRINK,
                            price = 20.0,
                            image = null
                        ),
                        ItemType.DRINK
                    )
                }
            }

            findNavController().navigate(action)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}