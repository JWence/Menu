package comida

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.men.R
import com.squareup.picasso.Picasso

import kotlinx.android.synthetic.main.comida_item_activity_main.view.*


class ComidaListAdapter(val comidaItems:MutableList<ComidaItemList>):RecyclerView.Adapter<ComidaListAdapter.ComidaHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComidaHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ComidaHolder(layoutInflater.inflate(R.layout.comida_item_activity_main, parent, false))
    }

    override fun onBindViewHolder(holder: ComidaHolder, position: Int) {
        holder.render(comidaItems[position])
    }

    override fun getItemCount(): Int {
        return comidaItems.size
    }

    class ComidaHolder(val view:View):RecyclerView.ViewHolder(view) {
        fun render(item:ComidaItemList) {
            view.nombre.text = item.nombre
            view.ingredientes.text = item.ingredientes
            view.precio.text = item.precio.toString()
            Picasso.get().load(item.imagen).into(view.imageView)

        }
    }

}