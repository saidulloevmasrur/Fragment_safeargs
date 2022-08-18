package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.fragment.databinding.FragmentSecondBinding
import kotlin.system.measureNanoTime

class SecondFragment() : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!
    private val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext2.setOnClickListener {
            val name = binding.editText2.text.toString()

            if (name.isEmpty()) {
                showText("Surname must not be empty!")
            } else {
                //val surname = requireArguments().getString(SURNAME, null) ?: return@setOnClickListener
                val direction = SecondFragmentDirections.actionSecondFragmentToThirdFragment(args.surname,name)
                findNavController().navigate(direction)
                }
            }
        }

//    companion object{
//
//         private const val SURNAME = "surname_arg"
//
//        fun getBundle(surname: String): Bundle{
//            return Bundle().apply {
//                    putString(SURNAME,surname)
//            }
//        }
//    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun showText(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).show()
    }

}


