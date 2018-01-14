package mohamed.com.switchsider;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {
    ImageSwitcher imageSwitcher;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageSwitcher=(ImageSwitcher)findViewById(R.id.imageSwitcher);
        imageSwitcher
                .setFactory(new ViewSwitcher.ViewFactory() {
                    @Override
                    public View makeView() {
                        ImageView imageView=new ImageView(getApplicationContext());
                        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,ActionBar.LayoutParams.WRAP_CONTENT));
                        imageView.setImageResource(R.drawable.t);
                        return imageView;
                    }
                });

        Animation in= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);

        Animation out= AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        imageSwitcher.setInAnimation(in);
        imageSwitcher.setOutAnimation(out);


    }


    public void prev(View view) {
        imageSwitcher.setImageResource(R.drawable.a);

    }

    public void nextImg(View view) {
        imageSwitcher.setImageResource(R.drawable.a);
    }
}
