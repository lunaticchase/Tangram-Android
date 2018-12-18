package com.tmall.wireless.tangram.core.protocol;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.tmall.wireless.tangram.TangramEngine;
import com.tmall.wireless.tangram.dataparser.concrete.ComponentInfo;

import org.json.JSONObject;

import java.util.List;

public abstract class ElementRenderService {

    abstract public void init(TangramEngine tangramEngine);

    abstract public View createView(Context context, ViewGroup parent, ComponentInfo info);

    abstract public boolean mountView(JSONObject json, View view);

    abstract public void unmountView(JSONObject json, View view);

    abstract public void destroy();

    abstract public String getSDKBizName();

    abstract public ComponentInfo onParseComponentInfo(ComponentInfo info);

    abstract public void onDownloadComponentInfo(List<ComponentInfo> componentInfoList);

    public String getItemViewType(String type) {
        return null;
    }
}