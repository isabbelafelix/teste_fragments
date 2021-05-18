package com.example.novotestefragments

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class CharacterListFragment : Fragment() {

    private lateinit var names: Array<String>
    private lateinit var descriptions: Array<String>
    private lateinit var imageResIds: IntArray

    companion object {
        fun newInstance() = CharacterListFragment()
    }

    internal inner class CharacterListAdapter(context: Context) : RecyclerView.Adapter<ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_list, parent, false
            )
        )

        override fun getItemCount() = names.size

        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
            val character = Character(
                names[position],
                descriptions[position],
                imageResIds[position]
            )
            viewHolder.bind(character)
        }

    }

    internal inner class ViewHolder constructor(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        fun bind(character: Character) {
            View.list_image.setImageResource(character.imageResId)
            itemView.list_name.tex t = character.name
        }
    }
}