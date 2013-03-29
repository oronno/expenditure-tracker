package com.oneous.expendituretracker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.oneous.log4android.Logger;

public class MainActivity extends Activity {

    private static final Logger log = Logger.getLogger(MainActivity.class);

    private Button btnAddExpenditure;
    private Button btnAddMultipleExpenditure;
    private Button btnViewExpenditureList;


    // Listeners...
    private View.OnClickListener btnAddExpenditureListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "button Add Expenditure clicked!", Toast.LENGTH_LONG).show();
        }
    };

    private View.OnClickListener btnAddMultipleExpenditureListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "button Add Multiple Expenditure clicked!", Toast.LENGTH_LONG).show();
        }
    };

    private View.OnClickListener btnViewExpenditureListListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "button 'View Expenditure List' clicked!", Toast.LENGTH_LONG).show();
            }
        };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialize();
        log.verbose("onCreate");
    }

    private void initialize() {
        setContentView(R.layout.main);

        btnAddExpenditure = (Button) findViewById(R.id.btnAddExpenditure);
        btnAddExpenditure.setOnClickListener(btnAddExpenditureListener);

        btnAddMultipleExpenditure = (Button) findViewById(R.id.btnAddMultipleExpenditure);
        btnAddMultipleExpenditure.setOnClickListener(btnAddMultipleExpenditureListener);

        btnViewExpenditureList = (Button) findViewById(R.id.btnViewExpenditureList);
        btnViewExpenditureList.setOnClickListener(btnViewExpenditureListListener);
    }


    //For monitoring activity life cycle
    @Override
    protected void onStart() {
        super.onStart();
        log.verbose("onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        log.verbose("onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        log.verbose("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        log.verbose("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        log.verbose("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        log.verbose("onDestroy");
    }

    @Override
    public void finish() {
        super.finish();
        log.verbose("finish");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        log.verbose("onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        log.verbose("onRestoreInstanceState");
    }
}
