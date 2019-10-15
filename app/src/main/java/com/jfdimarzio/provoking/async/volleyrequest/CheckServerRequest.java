package com.jfdimarzio.provoking.async.volleyrequest;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.jfdimarzio.provoking.BaseActivity;
import com.jfdimarzio.provoking.util.consts.IntentActionConsts;

import timber.log.Timber;

public class CheckServerRequest {

    /**
     * 目前拿來檢查 網路連線狀態
     * @param activity
     * @return
     */
    public static StringRequest checkConnectRequest(final BaseActivity activity)
    {

        String url = activity.getmPreferenceUtils().getServerTimeUrl();


        StringRequest jsonObjectRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Intent intent = new Intent(IntentActionConsts.CheckServerConnect);
                intent.putExtra(IntentActionConsts.KEY_CHECK_SERVER_CONNECT, true);

                final LocalBroadcastManager broadcastManager = LocalBroadcastManager.getInstance(activity);
                broadcastManager.sendBroadcast(intent);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Intent intent = new Intent(IntentActionConsts.CheckServerConnect);
                intent.putExtra(IntentActionConsts.KEY_CHECK_SERVER_CONNECT, false);

                final LocalBroadcastManager broadcastManager = LocalBroadcastManager.getInstance(activity);
                broadcastManager.sendBroadcast(intent);

                Timber.w("checkConnectRequest VolleyError:%s",error.getMessage());

            }
        });
        return jsonObjectRequest;
    }

}
