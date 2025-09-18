package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation
// TODO Step 3a: Provide Adapter Parent
class NumberDisplayAdapter(private val items: Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NumberViewHolder {
        val textView = TextView(parent.context)
        return NumberViewHolder(textView)
                                //parent.context
    }

    override fun onBindViewHolder(
        holder: NumberViewHolder,
        position: Int
    ) {
        holder.textView.text = items[position].toString()
    }

    override fun getItemCount(): Int {
        return items.size
    }



    // TODO Step 3b: Complete function definitions for adapter


}