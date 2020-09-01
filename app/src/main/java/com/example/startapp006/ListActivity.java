package com.example.startapp006;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

//import com.example.startapp006.dummy.LessonsContent;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final List<Items> ITEMS = new ArrayList<Items>();

        ITEMS.add(new Items("Антонов", "Антон", "1@mail.com", "80291111111"));
        ITEMS.add(new Items("Борисов", "Борис", "2@mail.com", "80292222222"));
        ITEMS.add(new Items("Витальев", "Виталий", "3@mail.com", "80293333333"));
        ITEMS.add(new Items("Григорьев", "Григорий", "4@mail.com", "80294444444"));
        ITEMS.add(new Items("Дмитриев", "Дмитрий", "5@mail.com", "80295555555"));
        ITEMS.add(new Items("Егоров", "Егор", "6@mail.com", "80296666666"));
        ITEMS.add(new Items("Кириллов", "Кирилл", "7@mail.com", "80297777777"));
        ITEMS.add(new Items("Леонидов", "Леонид", "8@mail.com", "80298888888"));
        ITEMS.add(new Items("Маратов", "Марат", "9@mail.com", "80299999999"));
        ITEMS.add(new Items("Николаев", "Николай", "10@mail.com", "80441111111"));
        ITEMS.add(new Items("Остапов", "Остап", "11@mail.com", "80442222222"));
        ITEMS.add(new Items("Павлов", "Павел", "12@mail.com", "80443333333"));
        ITEMS.add(new Items("Родионов", "Родион", "13@mail.com", "80444444444"));
        ITEMS.add(new Items("Степанов", "Степан", "14@mail.com", "80445555555"));
        ITEMS.add(new Items("Эдуардов", "Эдуард", "15@mail.com", "80446666666"));
        ITEMS.add(new Items("Юлианов", "Юлиан", "16@mail.com", "804437777777"));
        ITEMS.add(new Items("Яковлев", "Яков", "17@mail.com", "80448888888"));

        RecyclerView list = findViewById(R.id.list);
        list.setAdapter(new MyItemRecyclerViewAdapter(ITEMS));
    }
}