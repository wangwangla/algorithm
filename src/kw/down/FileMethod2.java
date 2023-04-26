//package kw.down;
//
//import java.io.*;
//import java.io.File;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.http.HttpEntity;
//import org.apache.http.HttpResponse;
//import org.apache.http.NameValuePair;
//import org.apache.http.client.config.RequestConfig;
//import org.apache.http.client.entity.UrlEncodedFormEntity;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.conn.ssl.NoopHostnameVerifier;
//import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
//import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
//import org.apache.http.entity.StringEntity;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.message.BasicNameValuePair;
//import org.apache.http.ssl.SSLContexts;
//import org.apache.http.util.EntityUtils;
//
//public class FileMethod2 {
//
//
//    public static void main(String[] args) {
//        String url = "https://test.quanjian.com.cn/m/api/search";
////        System.out.println("完成");
//        HashMap<String,String> param = new HashMap<>();
//
//        doPost(url,param);
//    }
//
//
//    public void x(String url,String JSONBody){
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//        //设置超时时间
//        RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(5000).setConnectionRequestTimeout(1000).setSocketTimeout(5000).build();
//        HttpPost httpPost = new HttpPost(url);
//        httpPost.setConfig(requestConfig);
//        httpPost.addHeader("Content-Type", "application/json");
//        httpPost.setEntity(new StringEntity(JSONBody));
//        CloseableHttpResponse response = httpClient.execute(httpPost);
////		System.out.println(response.getStatusLine().getStatusCode() + "\n");
//        HttpEntity entity = response.getEntity();
//        String responseContent = EntityUtils.toString(entity, "UTF-8");
////		System.out.println(responseContent);
//        response.close();
//        httpClient.close();
//    }
//
//    public static String doPost(String url, Map<String, String> param) {
//        // 创建Httpclient对象
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//
//        CloseableHttpResponse response = null;
//
//        String resultString = "";
//        try {
//            // 创建Http Post请求
//            HttpPost httpPost = new HttpPost(url);
//
//            // 创建参数列表
//            if (param != null) {
//                List<NameValuePair> paramList = new ArrayList<>();
//                for (String key : param.keySet()) {
//                    paramList.add(new BasicNameValuePair(key, param.get(key)));
//                }
//                // 模拟表单
//                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(paramList);
//
//                httpPost.setEntity(entity);
//            }
//            // 执行http请求
//            response = httpClient.execute(httpPost);
//
//            resultString = EntityUtils.toString(response.getEntity(), "utf-8");
//            System.out.println(resultString);
//        }
//        catch (Exception e) {
////            log.info(e.getMessage());
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                response.close();
//            }
//            catch (IOException e) {
//                // TODO Auto-generated catch block
////                log.info(e.getMessage());
//                e.printStackTrace();
//            }
//        }
//
//        return resultString;
//    }
//}