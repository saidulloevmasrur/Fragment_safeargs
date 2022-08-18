package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.fragment.databinding.FragmentThirdBinding
import java.util.stream.Stream

class ThirdFragment(
) : Fragment() {
    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!
//    private val args:ThirdFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val args: Bundle = requireArguments()
//        val surname = args.getString(SURNAME)
//        val name = args.getString(NAME)
        val args = ThirdFragmentArgs.fromBundle(requireArguments())
        binding.text3.text = "Hello, ${args.surname} ${args.name}"
//        requireArguments()
    }


//    companion object{
//
//         const val SURNAME = "surname_arg"
//         const val NAME = "name_arg"
//
//        fun getBundle(surname:String,name:String):Bundle{
//            return Bundle().apply {
//                putString(SURNAME,surname)
//                putString(NAME,name)
//            }
//        }
//
//    }
}