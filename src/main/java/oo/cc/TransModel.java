package oo.cc;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

/**
 * Created by laiis on 2017/5/31.
 */
public class TransModel {

    public static void main(String[] args) {
        String testJson = "{\"title\":\"Hahahaha\",\"message\":\"oiasudfiouasfh\"}";

        Type type = new TypeToken<TestModel>() {
        }.getType();

        Gson gson = new Gson();
        TestModel testModel = gson.fromJson(testJson, type);
        System.out.println(testModel.getTitle() + " , " + testModel.getMessage());

    }
}
