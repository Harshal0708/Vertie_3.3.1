package com.vertie.ui.history

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.vertie.activity.QuestionActivity
import com.vertie.databinding.FragmentHistoryBinding
import com.vertie.javacode.activities.MeasurementIntroActivity

class HistoryFragment : Fragment() {

    private var _binding: FragmentHistoryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val historyViewModel =
            ViewModelProvider(this).get(HistoryViewModel::class.java)

        _binding = FragmentHistoryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        historyViewModel.text.observe(viewLifecycleOwner) {

        }

        val button_add_manual : ConstraintLayout = binding.buttonAddManual
        button_add_manual.setOnClickListener {
            activity?.let{
                val intent = Intent (it, QuestionActivity::class.java)
                it.startActivity(intent)
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}