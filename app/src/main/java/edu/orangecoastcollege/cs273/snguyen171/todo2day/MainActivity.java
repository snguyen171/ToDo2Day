package edu.orangecoastcollege.cs273.snguyen171.todo2day;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // FOR NOW (TEMPORARY), delete the old database, then creat a new one
        this.deleteDatabase(DBHelper.DATABASE_TABLE);
        // Let's make a DBHelper reference:
        DBHelper db = new DBHelper(this);

        // Let's make a new task and add to database:
        db.addTask(new Task(1, "Study for CS273 MidTerm", 0));
        db.addTask(new Task(1, "Study for CS200 MidTerm", 0));
        db.addTask(new Task(1, "Play League of Legends", 0));
        db.addTask(new Task(1, "Get Milk", 0));
        db.addTask(new Task(1, "Master the FragmentManager", 0));
    }
}
