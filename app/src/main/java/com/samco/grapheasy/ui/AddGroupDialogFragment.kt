package com.samco.grapheasy.ui

import androidx.fragment.app.Fragment
import com.samco.grapheasy.R


class AddGroupDialogFragment : NameInputDialogFragment() {
    private lateinit var listener: AddGroupDialogListener

    interface AddGroupDialogListener {
        fun onAddGroup(name: String)
        fun getAddGroupHintText(): String
        fun getAddGroupTitleText(): String
    }

    override fun registerListener(parentFragment: Fragment?) {
        listener = parentFragment as AddGroupDialogListener
    }

    override fun getPositiveButtonName(): String = getString(R.string.add)

    override fun onPositiveClicked(name: String) = listener.onAddGroup(name)

    override fun getNameInputHint(): String = listener.getAddGroupHintText()

    override fun getTitleText(): String = listener.getAddGroupTitleText()

    override fun getNameInputText(): String = ""
}