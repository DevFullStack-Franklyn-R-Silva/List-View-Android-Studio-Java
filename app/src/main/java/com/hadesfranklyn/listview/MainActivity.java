package com.hadesfranklyn.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] itens = {"Água Branca", "Anadia", "Arapiraca", "Atalaia", "Barra de Santo Antônio", "Barra de São Miguel", "Batalha", "Belém", "Belo Monte", "Boca da Mata",
            "Branquinha", "Cacimbinhas", "Cajueiro", "Campestre", "Campo Alegre", "Campo Grande", "Canapi", "Capela", "Carneiros", "Chã Preta", "Coité do Noia",
            "Colônia Leopoldina", "Coqueiro Seco", "Coruripe", "Craíbas", "Delmiro Gouveia", "Dois Riachos", "Estrela de Alagoas", "Feira Grande", "Feliz Deserto", "Flexeiras",
            "Girau do Ponciano", "Ibateguara", "Igaci", "Igreja Nova", "Inhapi", "Jacaré dos Homens", "Jacuípe", "Japaratinga", "Jaramataia", "Jequiá da Praia", "Joaquim Gomes", "Jundiá", "Junqueiro",
            "Lagoa da Canoa", "Limoeiro de Anadia", "Maceió", "Major Izidoro", "Mar Vermelho", "Maragogi", "Maravilha", "Marechal Deodoro", "Maribondo", "Mata Grande", "Matriz de Camaragibe", "Messias",
            "Minador do Negrão", "Monteirópolis", "Murici", "Novo Lino", "Olho d'Água das Flores", "Olho d'Água do Casado", "Olho d'Água Grande", "Olivença", "Ouro Branco", "Palestina", "Palmeira dos Índios",
            "Pão de Açúcar", "Pariconha", "Paripueira", "Passo de Camaragibe", "Paulo Jacinto", "Penedo", "Piaçabuçu", "Pilar", "Pindoba", "Piranhas", "Poço das Trincheiras", "Porto Calvo",
            "Porto de Pedras", "Porto Real do Colégio", "Quebrangulo", "Rio Largo", "Roteiro", "Santa Luzia do Norte", "Santana do Ipanema", "Santana do Mundaú", "São Brás", "São José da Laje",
            "São José da Tapera", "São Luís do Quitunde", "São Miguel dos Campos", "São Miguel dos Milagres", "São Sebastião", "Satuba", "Senador Rui Palmeira", "Tanque d'Arca", "Taquarana",
            "Teotônio Vilela", "Traipu", "União dos Palmares", "Viçosa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listLocais);

        // Cria adaptador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        // Adiciona adaptador para a lista
        listLocais.setAdapter(adaptador);

        // Adiciona clique na lista
        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String valorSelecionado = listLocais.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(), valorSelecionado, Toast.LENGTH_LONG).show();
            }
        });
    }

}