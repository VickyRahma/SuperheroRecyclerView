package vickyrahma.rpl.superhero

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuHeaderHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val itemHeader = itemView.findViewById(R.id.tvHeaderItem) as TextView

    fun bindContent(text: String){
        itemHeader.text = text
    }
}