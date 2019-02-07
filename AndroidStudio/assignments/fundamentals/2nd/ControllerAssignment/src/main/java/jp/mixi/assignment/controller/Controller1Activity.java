package jp.mixi.assignment.controller;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * TODO: 課題1
 * {@link Toast#makeText(Context, CharSequence, int)} または
 * {@link Toast#makeText(Context, int, int)} を利用して、各ライフサイクルメソッドがどのような順番で
 * 実行されているかを確認してください。
 * 確認したら、assignments/fundamentals/2nd/Report.md にその順番を記述してください。
 *
 * @author keishin.yokomaku
 */
public class Controller1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller1);
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDeatroy", Toast.LENGTH_SHORT).show();

    }
}
