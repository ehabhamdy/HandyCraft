package com.team.handycraft.ui;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by Ehab on 6/14/16.
 */
public class ActivityBase extends AppCompatActivity {

    private ProgressDialog mProgressDialog;
    Toolbar mToolbar;



    public void showProgressDialog() {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(this);
            mProgressDialog.setCancelable(false);
            mProgressDialog.setMessage("Loading...");
        }

        mProgressDialog.show();
    }

    public void hideProgressDialog() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }

    public String getUid() {
        return FirebaseAuth.getInstance().getCurrentUser().getUid();
    }

}