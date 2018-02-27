package com.example.prince.rndstuff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ProgressBar progressBar;
    private boolean progressflag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initviews();
    }

    private void initviews() {
        progressBar=(ProgressBar)findViewById(R.id.progressBar);


         findViewById(R.id.progressbar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.progressbar:
                if(progressflag){
                    progressflag=false;
                    progressBar.setVisibility(View.GONE);
                }else {
                    progressflag=true;
                progressBar.setVisibility(View.VISIBLE);
                }
                break;

           /* case R.id.progressbar:

                break;*/
        }

    }
}
