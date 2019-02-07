package jp.mixi.practice.resourcemanagement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by takafumi.nanao on 2015/02/05.
 */
public class AnimationPracticeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_practice);

        TextView tv1 = (TextView) findViewById(R.id.anime_view);

        Animation anim =  AnimationUtils.loadAnimation(this, R.anim.anime1);

        tv1.startAnimation(anim);

    }
}
