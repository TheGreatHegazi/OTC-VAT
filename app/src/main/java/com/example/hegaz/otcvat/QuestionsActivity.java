package com.example.hegaz.otcvat;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class QuestionsActivity extends AppCompatActivity {

  private  ListView   myListView;
   String[] Questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.myListView);

        Questions = res.getStringArray(R.array.Questions);

        adapter adapter = new adapter(this, Questions);

        myListView.setAdapter(adapter);


    }
}
