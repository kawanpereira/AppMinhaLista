package devandroid.kawan.appminhalista.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.kawan.appminhalista.R;
import devandroid.kawan.appminhalista.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
    }
}