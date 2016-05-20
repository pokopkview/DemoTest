package ad.joyplus.com.myapplicationaa;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.joyplus.adkey.Ad;
import com.joyplus.adkey.AdRequest;
import com.joyplus.adkey.AdkeyUtil.AdkeyData;
import com.joyplus.adkey.BannerAd;
import com.joyplus.adkey.RequestRichMediaAd;
import com.joyplus.adkey.request.Report;
import com.joyplus.adkey.request.Request;
import com.joyplus.adkey.video.RichMediaAd;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {
    private RichMediaAd bannerAd;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_show = (Button) findViewById(R.id.bt_show);
        final Request request = new Request(MainActivity.this, "6ef97da9678a6a588ba705c03bc72365");
        new Thread() {
            @Override
            public void run() {
                bannerAd = request.getRichMediaAd();
                //bannerAd = request.getBannerAd();
            }
        }.start();
        AdkeyData.setDeBug(true);


        bt_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Report report = new Report(MainActivity.this);
                // report.report(bannerAd);
                Request request1 = new Request(MainActivity.this,"7119b84b00329bb44f342bbe5b3562cb");
                //RichMediaAd ad = (RichMediaAd) getAd(RequestRichMediaAd.class);
                RichMediaAd ad = (RichMediaAd) request1.getAd(RequestRichMediaAd.class);
                System.out.println(ad.toString() + "--RichMediaAd");

                //getAd(BannerAd.class);
//                String info = "0,1460514622088&1,1460514622088&2,1460514622099&3,1460514622100&0,1460514622111&1,1460514622122&2,1460514622099&3,1460514622100&0,1460514622111&1,1460514622122&2,1460514622099&3,1460514622100&0,1460514622111&1,1460514622122&2,1460514622099&3,1460514622100&0,1460514622111&1,1460514622122&2,1460514622099&3,1460514622100&0,1460514622111&1,1460514622122&2,1460514622099&3,1460514622100";
//                List<String> lists = new ArrayList<>();
//                String info1  = "http://g.dtv.cn.miaozhen.com/x/k=4000111&p=2hdqE&ns=__IP__&m1=__ANDROIDID1__&m1a=__ANDROIDID__&m2=__IMEI__&m4=__AAID__&m6=__MAC1__&m6a=__MAC__&rt=2&nd=__DRA__&nt=__TIME__&o=,http://g.dtv.cn.miaozhen.com/x/k=4000113&p=2hdqE&ns=__IP__&m1=__ANDROIDID1__&m1a=__ANDROIDID__&m2=__IMEI__&m4=__AAID__&m6=__MAC1__&m6a=__MAC__&rt=2&nd=__DRA__&nt=__TIME__&o=,http://g.dtv.cn.miaozhen.com/x/k=4000113&p=2hdqE&ns=__IP__&m1=__ANDROIDID1__&m1a=__ANDROIDID__&m2=__IMEI__&m4=__AAID__&m6=__MAC1__&m6a=__MAC__&rt=2&nd=__DRA__&nt=__TIME__&o=,http://g.dtv.cn.miaozhen.com/x/k=4000113&p=2hdqE&ns=__IP__&m1=__ANDROIDID1__&m1a=__ANDROIDID__&m2=__IMEI__&m4=__AAID__&m6=__MAC1__&m6a=__MAC__&rt=2&nd=__DRA__&nt=__TIME__&o=";
//                String info2  = null;
//                String info3  = "http://g.dtv.cn.miaozhen.com/x/k=4000111&p=2hdqE&ns=__IP__&m1=__ANDROIDID1__&m1a=__ANDROIDID__&m2=__IMEI__&m4=__AAID__&m6=__MAC1__&m6a=__MAC__&rt=2&nd=__DRA__&nt=__TIME__&o=,http://g.dtv.cn.miaozhen.com/x/k=4000113&p=2hdqE&ns=__IP__&m1=__ANDROIDID1__&m1a=__ANDROIDID__&m2=__IMEI__&m4=__AAID__&m6=__MAC1__&m6a=__MAC__&rt=2&nd=__DRA__&nt=__TIME__&o=,http://g.dtv.cn.miaozhen.com/x/k=4000113&p=2hdqE&ns=__IP__&m1=__ANDROIDID1__&m1a=__ANDROIDID__&m2=__IMEI__&m4=__AAID__&m6=__MAC1__&m6a=__MAC__&rt=2&nd=__DRA__&nt=__TIME__&o=,http://g.dtv.cn.miaozhen.com/x/k=4000113&p=2hdqE&ns=__IP__&m1=__ANDROIDID1__&m1a=__ANDROIDID__&m2=__IMEI__&m4=__AAID__&m6=__MAC1__&m6a=__MAC__&rt=2&nd=__DRA__&nt=__TIME__&o=";
//                lists.add(info1);
//                lists.add(info2);
//                lists.add(info3);
//                lists.add(info1);
//                lists.add(info2);
//                lists.add(info3);
//                lists.add(info1);
//                lists.add(info2);
//                lists.add(info3);
//                lists.add(info1);
//                lists.add(info2);
//                lists.add(info3);
//                lists.add(info1);
//                lists.add(info2);
//                lists.add(info3);
//                lists.add(info1);
//                lists.add(info2);
//                lists.add(info3);
//                lists.add(info1);
//                lists.add(info2);
//                lists.add(info3);
//                lists.add(info1);
//                lists.add(info2);
//                lists.add(info3);
//                report.reportBinner(info, lists, new IReportCallBack() {
//                    @Override
//                    public void ReportState(String s) {
//                        //tv_msg.setText(s);
//                        System.out.println(s);
//                    }
//                });
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public Ad getsAd(Class cla) {
        BannerAd methodTest = new BannerAd();
        try {
            Object object = cla.newInstance();
            Method[] method1 = cla.getMethods();
            for (int i = 0; i < method1.length; i++) {


                Method method = method1[i];


                System.out.println("名称：" + method.getName());   //方法名称
                System.out.println("是否允许带有可变参数变量:" + method.isVarArgs());//
                System.out.println("入口参数类型依次为：");
                Class[] parameterTypes = method.getParameterTypes();//获得方法所有的参数类型
                for (int j = 0; j < parameterTypes.length; j++) {
                    System.out.println("parameterTypes[" + j + "]" + parameterTypes[j]);
                }
                System.out.println("返回值类型：" + method.getReturnType()); //获得方法返回值类型
                System.out.println("可能抛出异常类型有：");
                Class[] exceptionTypes = method.getExceptionTypes();  //获得可能抛出的所有异常类型
                for (int j = 0; j < exceptionTypes.length; j++) {
                    System.out.println("exceptionTypes[" + j + "]" + exceptionTypes[j]);
                }
                boolean isTurn = true;
                System.out.println("Accessible:" + method.isAccessible());
                System.out.println("GenericReturnType:" + method.getGenericReturnType());
//                while(isTurn)     //调用类中的方法
//                {
//                    try
//                    {
//                        isTurn = false;
//                        if(i==0)   //请注意生成的顺序，可以先把这些语句注释掉，看下顺序再另行执行。
//                        {
//                            method.invoke(methodTest);
//                        }    else if(i==1)
//                        {
//                            System.out.println("返回值：" + method.invoke(methodTest,168));
//                        }else if(i==2)
//                        {
//                            System.out.println("返回值：" + method.invoke(methodTest,"7",5));
//                        }else if(i==3)
//                        {
//                            Object[] parameters = new Object[]{new String[]{"M","W","Q"}};
//                            System.out.println("返回值："+method.invoke(methodTest, parameters));
//                        }
//                    }catch(Exception e)
//                    {
//                        System.out.println("在执行方法时抛出异常,执行setAccessible()方法");
//                        method.setAccessible(true);
//                        isTurn = true;
//                    }
//                }
                System.out.println("****************");
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Ad getAd(Class cla) {
        try {
            Object ob = null;
            AdRequest adRequest = new AdRequest();
            adRequest.setMACAddress("");
            adRequest.setRequestURL("http://42.62.105.254/advapi/v1/mdrequest");
            Object object = cla.newInstance();
            Method[] method = cla.getMethods();//获取到sendRequest的方法
            //使用Method并返回相应的对象
            for (int i = 0; i < method.length; i++) {
                if ("sendRequest".equals(method[i].getName())) {
                    ob = method[i].invoke(object, adRequest);
                    System.out.println(method[i].invoke(object, adRequest)+"--Method");
                }
            }


            return (Ad) ob;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://ad.joyplus.com.myapplicationaa/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://ad.joyplus.com.myapplicationaa/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
