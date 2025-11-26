package com.example.lekcja10

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.lekcja10.data.AppViewModel
import com.example.lekcja10.databinding.FragmentNewOrderBinding

class NewOrderFragment : Fragment() {

    private var _binding: FragmentNewOrderBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNewOrderBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.BTNNew.setOnClickListener {
            val action = NewOrderFragmentDirections.actionHomeFragmentToMealListFragment()
            findNavController().navigate(action)
        }
    }
}