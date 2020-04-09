package com.example.ramen;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

public class DetailDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInsatnaceState) {
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(getActivity());
        alertBuilder.setTitle(R.string.detailDialog_title);
        alertBuilder.setMessage(R.string.detailDialog_msg);
        alertBuilder.setPositiveButton(R.string.detailDialog_btn_ok, new DialogButtonClickListener());
        alertBuilder.setNegativeButton(R.string.detailDialog_btn_ng, new DialogButtonClickListener());
        //alertBuilder.setPositiveButton(R.string.detailDialog_btn_nt, new DialogButtonClickListener());

        //Generate Dialog obj
        AlertDialog dialog = alertBuilder.create();
        return dialog;
    }

    //ダイアログのボタンをタップした時の処理
    private class DialogButtonClickListener implements DialogInterface.OnClickListener {
        @Override
        public void OnClick(DialogInterface dialog, int which) {
            String msg = "";
            //タップされたものによって分岐
            switch(which) {
                case DialogInterface.BUTTON_POSITIVE:
                    msg = getString(R.string.detailDialog_msg_ok);
                    break;
                case DialogInterface.BUTTON_NEGATIVE:
                    msg = getString(R.string.detailDialog_msg_ng);
                    break;
            }
            //Toast(動作確認用、削除するかは未定)
            Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
        }
    }
}
