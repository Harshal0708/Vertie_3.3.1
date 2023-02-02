package com.vertie.ui.proxyuser

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.vertie.databinding.FragmentProxyuserBinding

class ProxyuserFragment : Fragment() {

    private var _binding: FragmentProxyuserBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val proxyuserViewModel =
            ViewModelProvider(this).get(ProxyuserViewModel::class.java)

        _binding = FragmentProxyuserBinding.inflate(inflater, container, false)
        val root: View = binding.root

        proxyuserViewModel.text.observe(viewLifecycleOwner) {

        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}