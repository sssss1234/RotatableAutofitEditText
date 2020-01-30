package com.example.totalitycorpassignmentsomesh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.autofit.et.lib.AutoFitEditText;
import com.autofit.et.lib.AutoFitEditTextUtil;

public class MainActivity extends AppCompatActivity {
    private AutoFitEditText mEditText;
    private RelativeLayout mview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = findViewById(R.id.id_activityMain_EditText);
        mview=findViewById(R.id.relativelayout);
        runAutoSizeTextView();
    }
    public void runAutoSizeTextView() {
        mEditText.setEnabled(true);
        mEditText.setFocusableInTouchMode(true);
        mEditText.setFocusable(true);
        mEditText.setEnableSizeCache(false);
        mEditText.setMovementMethod(null);
        //mAutoFitEditText.setMaxHeight();
       // mAutoFitEditText.setMinTextSize(16f);
        AutoFitEditTextUtil.setNormalization(this, mview, mEditText);
    }

}

//took reference from GITHUB
