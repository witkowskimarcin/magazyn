package com.example.parsers;

import com.example.model.Order;
import com.example.model.Product;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class OrderParser {
    public static Order orderParser(String orderJson) {

        JSONObject jsonObject = new JSONObject(orderJson);

        Gson g = new Gson();
        Order o = g.fromJson(orderJson, Order.class);

        return o;


    }

    public static  JSONObject orderToJson(Order order){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("id",order.getId());
        jsonObject.put("user",order.getUser());
        jsonObject.put("principal",order.getPrincipal());
        jsonObject.put("products",order.getUsedProductList());
        return  jsonObject;

    }


}
