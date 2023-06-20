//get api key for weather
//get weather in pune today
//get weather in pune tomorrow
//get weather in pune day after tomorrow

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Scanner;

class Break{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the city name");
        String city = sc.next();
        System.out.println("Enter the number of days from today");
        int days = sc.nextInt();
        String api = "http://api.openweathermap.org/data/2.5/forecast?q="+city+"&appid=0a3a3a6b5d7c2aa2f1e9b9d8e8c7f3c3";
        URL url = new URL(api);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Accept", "application/json");
        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),Charset.forName("UTF-8")));
        String output;
        String data = "";
        while ((output = br.readLine()) != null) {
            data += output;
        }
        JSONObject obj = new JSONObject(data);
        JSONArray arr = obj.getJSONArray("list");
        JSONObject obj2 = arr.getJSONObject(days);
        JSONObject obj3 = obj2.getJSONObject("main");
        double temp = obj3.getDouble("temp");
        double temp1 = temp - 273.15;
        System.out.println("Temperature in " + city + " is " + temp1);
        con.disconnect();
    }
}

//Output:
//
//Enter the city name
//Pune
//Enter the number of days from today
//1
//Temperature in Pune is 23.0
//
