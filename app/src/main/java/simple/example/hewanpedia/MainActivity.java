package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnKatak,btnKupu,btnSemut;
    Button btnTentangKami;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }

    private void inisialisasiView() {
        btnKatak = findViewById(R.id.btn_buka_ras_Katak);
        btnKupu = findViewById(R.id.btn_buka_ras_Kupu);
        btnSemut = findViewById(R.id.btn_buka_ras_Semut);
        btnTentangKami = findViewById(R.id.btn_tentang_kami);
        btnKatak.setOnClickListener(view -> bukaGaleri("Katak"));
        btnKupu.setOnClickListener(view -> bukaGaleri("Kupu"));
        btnSemut.setOnClickListener(view -> bukaGaleri("Semut"));
        btnTentangKami.setOnClickListener(view -> onClick(btnTentangKami));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity Katak");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, TentangActivity.class);
        startActivity(intent);
    }

}