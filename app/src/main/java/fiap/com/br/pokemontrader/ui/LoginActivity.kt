package fiap.com.br.pokemontrader.ui

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.view.ViewCompat
import fiap.com.br.pokemontrader.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private val LOGIN_REQUEST_CODE = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        btn_login.setOnClickListener {
            var intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivityForResult(intent, LOGIN_REQUEST_CODE)
            //realizarLogin(et_login.text.toString(),et_senha.text.toString())
        }

        tv_cadastrar.setOnClickListener{
            //var transition = ActivityOptionsCompat.makeSceneTransitionAnimation(this, tv_cadastrar, ViewCompat.getTransitionName(tv_cadastrar)!!)
            var intent = Intent(this@LoginActivity, CadastroActivity::class.java)
            startActivityForResult(intent, LOGIN_REQUEST_CODE)
        }
    }

    private fun realizarLogin(email: String, senha: String) {
    }
}
