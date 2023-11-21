package com.example.projecte_janf_marior;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class movies extends AppCompatActivity {

    ListView lista;

    String[][] datos = {
            {"Alimañas", "Pep Anton Gómez", "84'", "9", "ALIMAÑAS és una comèdia negra per a tots els públics protagonitzada per dos germans molt diferents, Carlos i Paco, interpretats per Carlos Areces i el mateix Jordi Sánchez, als quals els uneix l'ambició per heretar un edifici propietat de la seva anciana mare, edifici al que tots dos tenen posades totes les seves esperances per millorar la seva precària situació econòmica."},
            {"Black Friday", "J Eli Roth", "87'", "7", "Després d'un Black Friday en què es produeixen disturbis que acaben en tragèdia, un misteriós assassí terroritza Plymouth, a Massachusetts."},
            {"El exorcista", "David Gordon Green", "110'", "8", "Des que va morir la seva dona embarassada al terratrèmol d'Haití fa dotze anys, Victor Fielding (interpretat per Leslie Odom, Jr., guanyador d'un Tony i nominat a un Oscar; UNA NOCHE EN MIAMI, HAMILTON) s'ha encarregat de cuidar Angela (Lidya Jewett, la sèrie CHICAS BUENAS), la filla de tots dos. Però quan Angela i la seva amiga Katherine (la nouvinguda Olivia Marcum) desapareixen en un bosc durant tres dies i al tornar no recorden res del que els va passar, es desferma una sèrie d'esdeveniments que obligaran Victor a enfrontar-se a la cúspide del mal. Desesperat i aterrit, decideix demanar ajuda a Chris MacNeil, l'única persona que ha estat testimoni d'una cosa semblant."},
            {"El favor del Pacífico", "Juana Macías", "97'", "7", "Els Gallardo són una família rica i respectada que estiueja en una preciosa masia cuidada fins al més mínim detall per Amparito, la estimadíssima Tata, que, per als tres fills de la família, Teresa, Benja i Aura, ha estat com una segona mare. Quan reben la trista notícia de la seva mort, els tres germans viatgen al poble per donar-li el darrer adéu i retrobar-se amb Tomàs, únic fill de la difunta. El que no esperaven és que l'última voluntat d'Amparito fos ser enterrada al panteó familiar. Els Gallardo ho tenen clar: ni de broma! Després de negar-se a complir aquest favor, reben el llegat d'Amparito: unes cartes en què la família no trobarà un amable comiat, sinó una venjança en forma de draps bruts i veritats feridores que faran que tot salti pels aires. La mare que va parir la Tata!"},
            {"El chico y la garza", " Hayao Miyazaki", "123'", "9", "Un jove anomenat Mahito, que enyora la seva mare, s'aventura en un món compartit pels vius i els morts. Allà, la mort arriba a la fi i la vida troba un nou començament. Una fantasia semiautobiogràfica sobre la vida, la mort i la creació, en homenatge a l'amistat, de la ment de Hayao Miyazaki."},
            {"Five Nights at Freddy's","Emma Tammi", "109'", "8", "L'aterridor i exitós joc de por es converteix en un esdeveniment cinematogràfic quan Blumhouse, la productora de M3GAN, BLACK PHONE i L'HOME INVISIBLE porta FIVE NIGHTS AT FREDDY'S a la gran pantalla. La pel·lícula gira al voltant d'un turmentat guàrdia de seguretat que comença a treballar a Freddy Fazbear's Pizza. En la primera nit de feina, s'adona que no serà gens fàcil superar el torn de nit a la pizzeria."}
    };

    int[] datosImg = {R.drawable.fnaf,R.drawable.blacfriday,R.drawable.alima_as,R.drawable.elchicoygarza,R.drawable.elfavor,R.drawable.elexorcista};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        lista=(ListView) findViewById(R.id.lvLista);

        lista.setAdapter(new LlistaMovies(this,datos,datosImg));

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent visorDetalles = new Intent(view.getContext(), detallsMovies.class);
                visorDetalles.putExtra("TIT", datos[position][0]);
                visorDetalles.putExtra("DET", datos[position][4]);
                startActivity(visorDetalles);
            }
        });

    }
}