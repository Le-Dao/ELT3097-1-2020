package com.example.duolingo2;

        import androidx.annotation.LayoutRes;
        import androidx.appcompat.app.AppCompatActivity;

        import android.annotation.SuppressLint;
        import android.content.DialogInterface;
        import android.content.res.Resources;
        import android.graphics.Color;
        import android.graphics.drawable.Drawable;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageButton;
        import android.widget.LinearLayout;
        import android.widget.TextView;

        import java.util.ArrayList;

        import static android.graphics.Color.WHITE;

public class MainActivity extends AppCompatActivity {
    Button buttoncheck;
    ImageButton buttonanswer1, buttonanswer2, buttonanswer3, buttonanswer4;
    TextView textView;
    LinearLayout linearLayout;
    boolean setcheck;
    ArrayList<ImageButton> imageButtonArray = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonanswer1 = findViewById(R.id.answer1);
        buttonanswer2 = findViewById(R.id.answer2);
        buttonanswer3 = findViewById(R.id.answer3);
        buttonanswer4 = findViewById(R.id.answer4);
        buttoncheck = (Button) findViewById(R.id.check_button);
        textView = (TextView) findViewById(R.id.textView);
        linearLayout = findViewById(R.id.layoutend);
        buttoncheck.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttoncheck.setText("Tiếp tục");
                if (setcheck==false){
                    buttoncheck.setBackground(getDrawable(R.drawable.button_answer_false));
                    textView.setTextColor(getColor(R.color.RED));
                    textView.setText("Đáp án đúng: fruit");
                    linearLayout.setBackgroundColor(getColor(R.color.Pink));
                    buttonanswer1.setEnabled(false);
                    buttonanswer2.setEnabled(false);
                    buttonanswer3.setEnabled(false);
                    buttonanswer4.setEnabled(false);
                } else {
                    textView.setTextColor(getColor(R.color.GREEN));
                    textView.setText("Làm tốt lắm!");
                    linearLayout.setBackgroundColor(getColor(R.color.XANHNHAT));
                    buttonanswer1.setEnabled(false);
                    buttonanswer2.setEnabled(false);
                    buttonanswer3.setEnabled(false);
                    buttonanswer4.setEnabled(false);
                }
            }
        });
        buttonanswer1.setOnClickListener(ClickAnswer);
        buttonanswer2.setOnClickListener(ClickAnswer);
        buttonanswer3.setOnClickListener(ClickAnswer);
        buttonanswer4.setOnClickListener(ClickAnswer);
    }
        View.OnClickListener ClickAnswer = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                boolean check = buttoncheck.isEnabled();
                switch (id) {
                    case R.id.answer1: {
                        buttonanswer1.setBackground(getDrawable(R.drawable.button_choose_answer));
                        buttoncheck.setEnabled(!check);
                        buttoncheck.setTextColor(WHITE);
                        buttoncheck.setBackground(getDrawable(R.drawable.button_task_continue));
                        setcheck = false;
                        v.clearAnimation();
                        break;
                    }
                    case R.id.answer2: {
                        buttonanswer2.setBackground(getDrawable(R.drawable.button_choose_answer));
                        buttoncheck.setEnabled(!check);
                        buttoncheck.setTextColor(WHITE);
                        buttoncheck.setBackground(getDrawable(R.drawable.button_task_continue));
                        setcheck = false;
                        v.clearAnimation();
                        break;
                    }
                    case R.id.answer3: {
                        buttonanswer3.setBackground(getDrawable(R.drawable.button_choose_answer));
                        buttoncheck.setEnabled(!check);
                        buttoncheck.setTextColor(WHITE);
                        buttoncheck.setBackground(getDrawable(R.drawable.button_task_continue));
                        setcheck = false;
                        v.clearAnimation();
                        break;
                    }
                    case R.id.answer4: {
                        buttonanswer4.setBackground(getDrawable(R.drawable.button_choose_answer));
                        buttoncheck.setEnabled(!check);
                        buttoncheck.setTextColor(WHITE);
                        buttoncheck.setBackground(getDrawable(R.drawable.button_task_continue));
                        setcheck = true;
                        break;
                    }
                }
            }
        };
}