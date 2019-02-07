package jp.mixi.assignment.res;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class StringResourceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_resource);

        // TODO 1 個のものと、複数個のものの両方を並べて表示するため、両方用の TextView を取り出し、リソースへアクセスして表示する
        TextView tv1 = (TextView) findViewById(R.id.PluralsTextForOne);
        TextView tv2 = (TextView) findViewById(R.id.PluralsTextForOther);

        tv1.setText(getString(R.string.string_resource_name));
        tv2.setText(getString(R.string.string_resource_name));
    }
}
