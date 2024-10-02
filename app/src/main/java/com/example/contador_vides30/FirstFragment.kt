package com.example.contador_vides30

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.contador_vides30.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var vidap1=0
    private var venenop1=0
    private var vidap2=0
    private var venenop2=0
    private var _binding: FragmentFirstBinding? = null
    private lateinit var  lifetextviewp1:TextView

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        vidap1=20
        vidap2=20
        venenop1=0
        venenop2=0

        binding.corP1.setOnClickListener(){
            vidap1++
            actulizar()
        }

        binding.p1decrement.setOnClickListener(){
            if (vidap1 != 0) {
                vidap1--
                actulizar()
            }
        }

        binding.pmasbotton2.setOnClickListener(){
            vidap2++
            actulizar()
        }

        binding.pminusboton2.setOnClickListener(){
            if (vidap2 != 0) {
                vidap2--
                actulizar()
            }
        }

        binding.pplusplayer1.setOnClickListener(){
            venenop1++
            actulizar()
        }

        binding.pminusp1.setOnClickListener(){
            if (venenop1 != 0) {
                venenop1--
                actulizar()
            }
        }

        binding.pplusplayer2.setOnClickListener(){
            venenop2++
            actulizar()
        }

        binding.pminusplayer2.setOnClickListener(){
            if (venenop2 != 0) {
                venenop2--
                actulizar()
            }
        }

        binding.arrowDown.setOnClickListener(){
            if (vidap1 != 0) {
                vidap1--
                vidap2++
                actulizar()
            }
        }

        binding.upArrow.setOnClickListener(){
            if (vidap2 != 0) {
                vidap2--
                vidap1++
                actulizar()
            }
        }

        super.onViewCreated(view, savedInstanceState)
    }

    fun actulizar(){
        binding.textViewp1.text = "$vidap1/$venenop1"
        binding.textViewp2.text = "$vidap2/$venenop2"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}