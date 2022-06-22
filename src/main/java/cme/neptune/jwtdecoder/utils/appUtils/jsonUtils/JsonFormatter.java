/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cme.neptune.jwtdecoder.utils.appUtils.jsonUtils;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author elie.abdallah
 */
public class JsonFormatter {

    public static String format(final JSONObject object) throws JSONException {
        final JsonVisitor visitor = new JsonVisitor(4, ' ');
        visitor.visit(object, 0);
        return visitor.toString();
    }
}
