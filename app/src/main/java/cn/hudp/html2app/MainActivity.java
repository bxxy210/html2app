package cn.hudp.html2app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        wv = (WebView) findViewById(R.id.wv);

        wv.getSettings().setJavaScriptEnabled(true);//开启Js支持
        wv.loadUrl("file:///android_asset/test.html");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String color = "#cccccc";//颜色
                wv.loadUrl("javascript: changeColor('"+color+"');");//调用HTML5页     面中的JS方法
            }
        });
    }

    class JSInterface1{
        public void show(){};
    }
}
