package gov.jbb.missaonascente.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import gov.jbb.missaonascente.R;
import gov.jbb.missaonascente.controller.AchievementController;
import gov.jbb.missaonascente.model.Achievement;

public class AchievementsScreenActivity extends AppCompatActivity {
    private ArrayList<Achievement> achievements;
    private RecyclerView recyclerView;
    private AchievementController achievementController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements_screen);

        recyclerView = (RecyclerView) findViewById(R.id.achievementsRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);

        achievementController = new AchievementController(this);
        achievements = achievementController.getAllAchievements(this);
    }

    @Override
    protected void onResume(){
        super.onResume();
        recyclerView.setAdapter(new AchievementAdapter(this, achievements));
    }
}