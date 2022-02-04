 package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast = Toast.makeText(applicationContext, "onCreate()", Toast.LENGTH_SHORT)
        toast.show()
    }
     // onStart() del ciclo de vida de app movil
        override fun onStart() {
            super.onStart()
            val toast = Toast.makeText(applicationContext, "se inicio el metodo onStard()",Toast.LENGTH_LONG)
 toast.show()
    }

     override fun onResume() {
         super.onResume()
         val avisoResume= Toast.makeText(applicationContext, "se inicio el metodo onResume()", Toast.LENGTH_LONG)
         avisoResume.show()
     }

     override fun onPause() {
         super.onPause()
         val avisoPausa= Toast.makeText(applicationContext,"La apliacacio ha sido detenida onPause()",Toast.LENGTH_LONG)
         avisoPausa.show()
     }

     override fun onRestart() {
         super.onRestart()
         val avisoRestart= Toast.makeText(applicationContext, "La aplicacion ha sido reiniciada onRestart()", Toast.LENGTH_LONG)
         avisoRestart.show()
     }

     override fun onStop() {
         super.onStop()
         val avisoStop= Toast.makeText(applicationContext, "la aplicacion ha sido destruida onStop()", Toast.LENGTH_LONG)
         avisoStop.show()
     }

     override fun onDestroy() {
         super.onDestroy()
         val avisoDestroy= Toast.makeText(applicationContext, "La aplicacion ha sido destruida onDestroy()",Toast.LENGTH_LONG)
         avisoDestroy.show()
     }
     //este es un comentario
}