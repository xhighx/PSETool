package com.xhighx.psetool.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;

import com.xhighx.psetool.R;


public class AboutDialogFragment extends DialogFragment {

    public AboutDialogFragment() {

    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.dialog_about, null));
     //   builder.setIcon(R.drawable.ic_action_aboutinfo);
        builder.setNeutralButton("Close", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                getDialog().cancel();
            }
        });
        return builder.create();
    }


}
