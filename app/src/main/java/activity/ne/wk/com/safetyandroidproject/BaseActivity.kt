package activity.ne.wk.com.safetyandroidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
