package com.example.milizaapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog


class SecondFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val _view = inflater.inflate(R.layout.fragment_second, container, false)
        val btnShow = _view.findViewById<Button>(R.id.btnShow)
        btnShow.setOnClickListener {
            showButtonSheet()
        }

        return _view
    }

    fun showButtonSheet() {
        val bottomSheetDialog = BottomSheetDialog(requireContext())
        val bottomSheetView = layoutInflater.inflate(R.layout.buttonsheet, null)
        val btnClose = bottomSheetView.findViewById<Button>(R.id.ButtonSheet1)

        2   // Set a click listener for the button in the bottom sheet
        btnClose.setOnClickListener {
            bottomSheetDialog.dismiss() // Close the bottom sheet when the button is clicked
        }

        bottomSheetDialog.setContentView(bottomSheetView)
        bottomSheetDialog.show()
    }


}