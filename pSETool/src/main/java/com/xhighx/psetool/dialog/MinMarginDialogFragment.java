package com.xhighx.psetool.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;

import com.xhighx.psetool.R;

public class MinMarginDialogFragment extends DialogFragment {

    public MinMarginDialogFragment() {

    }

    

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.dialog_mm_view, null);
        builder.setView(v);
        builder.setTitle("Minimum Margin");
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                getDialog().cancel();

            }
        });


        return builder.create();
    }


}
