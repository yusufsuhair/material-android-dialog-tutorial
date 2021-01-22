package com.yusufsuhair.materialalertdialogtutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mDialog: MaterialAlertDialogBuilder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initDialog()

        btn_dialog.setOnClickListener {
            mDialog.show()
        }
    }

    private fun initDialog() {
        mDialog = MaterialAlertDialogBuilder(this)
                .setTitle("Title")
                .setMessage("This is just a message")
                .setCancelable(true)
                .setNeutralButton("Cancel") { dialog, which ->
                    tv_dialog.text = "Clicked cancel."
                    dialog.dismiss()
                }
                .setNegativeButton("No") { dialog, which ->
                    tv_dialog.text = "Clicked no."
                    dialog.dismiss()
                }
                .setPositiveButton("Yes") { dialog, which ->
                    tv_dialog.text = "Clicked yes."
                    dialog.dismiss()
                }
    }
}