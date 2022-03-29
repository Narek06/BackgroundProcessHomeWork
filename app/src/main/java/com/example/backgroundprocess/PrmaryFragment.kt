package com.example.backgroundprocess

import android.os.Bundle
import android.print.PrintManager
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController


class PrmaryFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_prmary, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editText1 = view.findViewById<EditText>(R.id.app_count)
        val editText2 = view.findViewById<EditText>(R.id.max_app_count)
        val send_btn = view.findViewById<Button>(R.id.send)


        send_btn.setOnClickListener{
            if (editText1.text.length != 0 && editText2.text.length != 0)
                findNavController()
                    .navigate(PrmaryFragmentDirections
                        .actionPrmaryFragmentToSecondaryFragment(
                            editText1.text.toString().toInt(),
                            editText2.text.toString().toInt(),
                        )
                    )
        }


    }
}