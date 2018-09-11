package prova.phs.com.provaphs;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends Activity {

    EditText visor;
    int numero;
    NumberFormat numTela;
    private TextView numeroTentativasTextView;
    private Button zerar;
    private Button adicionar;
    private Button remover;

    @SuppressLint("WrongViewCast")
    public void onCreate(Bundle onSaveInstanceState){
        super.onCreate(onSaveInstanceState);
        setContentView(R.layout.activity_main);
        visor = this.<EditText>findViewById(R.id.visor);
        //visor.setBackgroundColor(Color.blue());

        adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                visor.setText(numTela.format(numero = numero + 1));
                numeroTentativasTextView.setBackgroundColor(Color.GREEN);
            }
        }

        remover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                visor.setText(numero = numero + 1);
                numeroTentativasTextView.setBackgroundColor(Color.RED);
            }
        }

        zerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                visor.setText(numero = 0);
                numeroTentativasTextView.setBackgroundColor(Color.BLUE);
            }
        }
    }
}
