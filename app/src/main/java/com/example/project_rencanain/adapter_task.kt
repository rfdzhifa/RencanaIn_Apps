package com.example.project_rencanain
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class adapter_task (private val context: Context, private val rencanain: List<item_task>, val listener: (item_task) -> Unit)
    :RecyclerView.Adapter<adapter_task.ViewHolderTask>(){
    class ViewHolderTask (view: View): RecyclerView.ViewHolder (view){

        val title_task = view.findViewById<TextView>(R.id.title_task)
        val date = view.findViewById<TextView>(R.id.date)

        fun bindView(rencanain: item_task, listener: (item_task) -> Unit) {

            title_task.text = rencanain.title_task
            date.text = rencanain.date

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderTask {
        return ViewHolderTask(
            LayoutInflater.from(context).inflate(R.layout.item_task, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolderTask, position: Int) {
        holder.bindView(rencanain[position], listener)
    }

    override fun getItemCount(): Int = rencanain.size
    }

private fun Switch.setSwitchTypeface(switchButton: Int) {

}
