package weather.newer.com.baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by windows on 2016/7/18.
 */
public  class CarAdapter  extends BaseAdapter {
    /**
     * 数据（依赖数据）
     */
    private ArrayList<Car> data;

    /**
     * 上下文（访问应用程序中各种资源）
     */
    private Context context;

    /**
     * 布局实例化服务
     */
    private LayoutInflater layoutInflater;
    //
    public CarAdapter(ArrayList<Car > data,Context context){
        this.data=data;
        this.context=context;
        layoutInflater=LayoutInflater.from(context);
    }
    @Override
    /**
     *
     * 获取数据总共有多少项
     */
    public int getCount() {
     return data.size();
    }

    /**
     *
     *
     * @param position  获取指定位置的数据项
     * @return
     */
    @Override
    public Car  getItem(int position) {
        return data.get(position);
    }

    /**
     *
     * 获取指定位置的id,如果和数据库无关的话，不用理会
     * @param position
     * @return
     */
    @Override
    public long getItemId(int position) {
        return 0;
    }

    /**
     *
     * 返回视图项，即每一个列表项长什么样子
     * @param position
     * @param convertView
     * @param parent
     * @return
     */

   /* public View getView(int position, View convertView, ViewGroup parent) {
        //第一个模板
        //加载布局文件，确定每一项应该长什么样子
        View v=layoutInflater.inflate(R.layout.car_item,parent,false);
        ImageView imageView= (ImageView) v.findViewById(R.id.imageView);
        TextView textView= (TextView) v.findViewById(R.id.textView);
        TextView  textView2= (TextView) v.findViewById(R.id.textView2);
        Car car=data.get(position);
        imageView.setImageResource(car.getLogo());
        textView.setText(car.getTitle());
        textView2.setText(car.getInfo());


        return v;
    }*/
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //第二个模板
        ViewHolder holder;//用来保存列表项的结构
        if(convertView==null){
            //如果列表项为空。加载列表项
            convertView=layoutInflater.inflate(R.layout.car_item,parent,false);
            holder=new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
        }
      Car car=data.get(position);
        holder.binddata(car);


        return convertView;
    }
    //用来保存视图项，视图项都是一样的，只是需要加载数据就可以了
    public class ViewHolder{
        ImageView imageview;
        TextView textView;
        TextView textview2;
        ViewHolder(View v){
            imageview= (ImageView) v.findViewById(R.id.imageView);
            textView= (TextView) v.findViewById(R.id.textView);
            textview2= (TextView) v.findViewById(R.id.textView2);

        }

        public void binddata(Car car) {
            imageview.setImageResource(car.getLogo());
            textView.setText(car.getTitle());
            textView.setText(car.getInfo());


        }
    }
}
