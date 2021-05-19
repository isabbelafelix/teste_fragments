package com.example.novotestefragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class CharacterDetailFragment : Fragment() {

    companion object {
        fun newInstance() = CharacterDetailFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_detail, container, false)

        val character = arguments?.getSerializable("detail") as Character

        view.findViewById<ImageView>(R.id.image).setImageResource(character.imageResId)
        view.findViewById<TextView>(R.id.name).text = character.name
        view.findViewById<TextView>(R.id.description).text = character.description
        return view
    }
}