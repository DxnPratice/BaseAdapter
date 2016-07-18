package weather.newer.com.baseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listview;//视图；
    ArrayList<Car > data;//数据
    CarAdapter adapter;//适配器


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview= (ListView) findViewById(R.id.listView);
        data=new ArrayList<>();
     Car car1=new Car("这是一辆吉普车",R.drawable.jeep,"吉普");
     Car car2=new Car("这是一辆沃尔沃",R.drawable.volvo,"沃尔沃");
     Car car3=new Car("这是一辆奥迪车",R.drawable.audi,"奥迪");
     Car car4=new Car("这是一辆福特车",R.drawable.ford,"福特");
        data.add(car1);
        data.add(car2);
        data.add(car3);
        data.add(car4);

        for(int i=0;i<20;i++)
{
    Car car5=new Car("这是一辆沃尔沃",R.drawable.volvo,"沃尔沃");
    data.add(car5);
}
        adapter=new CarAdapter(data,this);
        listview.setAdapter(adapter);

    }
}
