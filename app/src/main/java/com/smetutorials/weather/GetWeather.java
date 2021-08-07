package com.smetutorials.weather;


import android.os.AsyncTask;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetWeather extends AsyncTask<String,Void,String>
{

    URL url;
    HttpURLConnection conn;
    String result="";
    @Override
    protected String doInBackground(String...urls)
    {
        try {
            url = new URL(urls[0]);
            conn= (HttpURLConnection) url.openConnection();
            InputStream in=conn.getInputStream();
            InputStreamReader reader=new InputStreamReader(in);
            int dataOut=reader.read();
            while(dataOut!=-1)
            {
                char data=(char)dataOut;
                result+=data;
                dataOut=reader.read();
            }
            System.out.println("data weather"+result);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }
}
