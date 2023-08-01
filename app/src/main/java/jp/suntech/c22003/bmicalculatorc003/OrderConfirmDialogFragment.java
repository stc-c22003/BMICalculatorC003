package jp.suntech.c22003.bmicalculatorc003;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class OrderConfirmDialogFragment extends DialogFragment {

    public Dialog onCreateDialog(@NonNull Bundle saveInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("警告");
        builder.setMessage("適切な肥満度を求めるためには、6歳未満の場合にはカウブ指数が、６歳から１５歳まではローレル指数が使われます。本アプリはBMIのみに対応しています。");
        builder.setPositiveButton("確認",new DialogButtonClickListener());
        AlertDialog dialog = builder.create();
        return dialog;
    }

    private class DialogButtonClickListener implements DialogInterface.OnClickListener{

        public void onClick(DialogInterface dialog,int which){
            int view;
            String msq="";
            switch (which){
                case DialogInterface.BUTTON_POSITIVE:
                    msq = "OK";
                    break;
            }
        }
    }
}
