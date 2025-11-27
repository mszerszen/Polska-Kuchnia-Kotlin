package com.example.lekcja10

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.marginEnd
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavDirections
import com.example.lekcja10.data.AppViewModel
import com.example.lekcja10.data.Data
import com.example.lekcja10.data.ItemType
import com.example.lekcja10.databinding.FragmentMealListBinding
import java.util.Locale

class MealListFragment : Fragment() {

    private var _binding: FragmentMealListBinding? = null
    private val binding get() = _binding!!

    private val sharedViewModel: AppViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMealListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.TextViewLabel.text = "Wybierz " + when(sharedViewModel.currentStep.value) {
            ItemType.SOUP -> "Zupę"
            ItemType.MEAL -> "Drugie Danie"
            else -> "Napój"
        }

        Data.Data.forEach {
            if(it.type == sharedViewModel.currentStep.value) {
                val item = LinearLayout(requireContext()).apply {

                    val params = LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                    ).apply {
                        setMargins(16, 16, 16, 16)
                    }
                    val bg = GradientDrawable().apply {
                        cornerRadius = 25f
                        setColor(0xFF943C23.toInt())
                    }
                    orientation = LinearLayout.HORIZONTAL
                    setPadding(16, 16, 16, 16)

                    layoutParams = params
                    background = bg


                    addView(ImageView(context).apply {
                        layoutParams = LinearLayout.LayoutParams(400, 400)
                        scaleType = ImageView.ScaleType.CENTER_CROP
                        if(it.image != null) {
                            setImageResource(it.image)
                        }
                        background = GradientDrawable().apply {
                            cornerRadius = 9f
                            setColor(0xFFFFFFFF.toInt())
                        }
                        clipToOutline = true
                    })
                    addView(LinearLayout(requireContext()).apply {
                        layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
                        setPadding(32, 16, 32, 16)
                        orientation = LinearLayout.VERTICAL

                        addView(TextView(requireContext()).apply {
                            text = it.name
                            textSize = 18f
                            setTextColor(Color.WHITE)
                        })
                        addView(TextView(requireContext()).apply {
                            text = String.format(Locale("pl", "PL"), "%.2f zł", it.price)
                            textSize = 12f
                            setTextColor(Color.WHITE)
                        })
                        addView(TextView(requireContext()).apply {
                            text = it.description
                            textSize = 15f
                            setTextColor(Color.WHITE)
                            setPadding(0, 16, 0, 0)
                        })
                    })

                    val current = it
                    var action: NavDirections? = null
                    setOnClickListener {
                        sharedViewModel.setCurrentMealData(current, current.type)
                        when(current.type) {
                            ItemType.SOUP -> {
                                action = MealListFragmentDirections.actionMealListFragmentSelf()
                            }
                        }
                    }
                }

                binding.meals.addView(item)
            }
        }
    }
}