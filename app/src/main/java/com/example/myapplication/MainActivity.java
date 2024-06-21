import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AnimalAdapter animalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Animal> animalList = generateAnimalList();
        animalAdapter = new AnimalAdapter(animalList);
        recyclerView.setAdapter(animalAdapter);
    }

    private List<Animal> generateAnimalList() {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Собака"));
        animalList.add(new Animal("Банда"));
        animalList.add(new Animal("Кошка"));
        animalList.add(new Animal("Хомяк"));
        animalList.add(new Animal("Лиса"));
        animalList.add(new Animal("Белка"));
        animalList.add(new Animal("Ёжик"));
        animalList.add(new Animal("Лев"));
        animalList.add(new Animal("Орёл"));
        animalList.add(new Animal("Тигр"));
        animalList.add(new Animal("Медведь"));
        animalList.add(new Animal("Курица"));
        animalList.add(new Animal("Лягушка"));
        animalList.add(new Animal("Ястреб"));
        animalList.add(new Animal("Сурок"));
        animalList.add(new Animal("Гепард"));
        return animalList;
    }
}
