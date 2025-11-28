package com.example.lekcja10

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.lekcja10.data.AppViewModel
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
}