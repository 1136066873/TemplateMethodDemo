package com.heguodong.template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 *
 * 适用情景
 *①多个子类有公有的方法，并且基本逻辑基本相同时
 *②重要负责的算法可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现。
 *③重构时，模板方法模式是一个经常使用的模式，把相同的代码抽到父类中，然后通过钩子方法约束其行为
 *
 * 优点
 模板方法模式通过把不变的行为搬移到超类，去除了子类中的重复代码。
 子类实现算法的某些细节，有助于算法的扩展。
 通过一个父类调用子类实现的操作，通过子类扩展增加新的行为，符合“开放-封闭原则”。

 缺点
 每个不同的实现都需要定义一个子类，这会导致类的个数的增加，设计更加抽象。
 而且模板方法会带来代码阅读的难度，会让用户觉得难以理解。

 借鉴 https://blog.csdn.net/jason0539/article/details/45037535
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        text.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.text:

                Student student = new Student();
                student.prepareGotoSchool();

                Teacher teacher = new Teacher();
                teacher.prepareGotoSchool();

                break;
        }
    }
}
