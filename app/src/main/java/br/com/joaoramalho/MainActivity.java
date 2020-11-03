package br.com.joaoramalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button botaoCaixinhaVibracao;
    private Button botaoAgendarEntrevista;
    private Button botaoCancelarEntrevista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.pegaBotoes();
        this.pegaEventoDaCaixinhaDeVibracao();
        this.pegaEventoDaAgendarEntrevista();
        this.pegaEventoDeCancelarAgendamento();
    }

    private void pegaEventoDeCancelarAgendamento() {
        this.botaoCancelarEntrevista.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, CancelarAgendamentoActivity.class));
        });
    }

    private void pegaEventoDaAgendarEntrevista() {
        this.botaoAgendarEntrevista.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AgendarEntrevistaActivity.class));
        });
    }

    private void pegaEventoDaCaixinhaDeVibracao() {
        this.botaoCaixinhaVibracao.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, CaixinhaDeVibracaoActivity.class));
        });
    }

    private void pegaBotoes() {
        this.botaoCaixinhaVibracao = findViewById(R.id.caixinha_vibracao_main);
        this.botaoAgendarEntrevista = findViewById(R.id.agendar_entrevista_main);
        this.botaoCancelarEntrevista = findViewById(R.id.cancelar_entrevista_main);
    }
}