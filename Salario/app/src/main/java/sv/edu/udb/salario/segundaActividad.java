package sv.edu.udb.salario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class segundaActividad extends AppCompatActivity {
    private TextView tvNombre;
    private TextView tvHoras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);
        tvNombre=(TextView)findViewById(R.id.textViewNombre);
        tvHoras=(TextView)findViewById(R.id.textViewHoras);

        Bundle bundle=getIntent().getExtras();
        String nombre=bundle.getString("txtNombre");
        String horas=bundle.getString("txtHoras");

        tvNombre.setText(nombre);
        tvHoras.setText(horas);

    }

}