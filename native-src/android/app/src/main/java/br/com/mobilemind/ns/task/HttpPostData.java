package br.com.mobilemind.ns.task;    

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.io.Serializable;

public class HttpPostData implements Serializable{
    public String identifier;
    public String fileSrc;
    public String result;
    public String jsonKey;
    protected Map<String, String> json;
    protected Map<String, String> responseHeaders;


    public HttpPostData(String fileSrc, String jsonKey) {
        this.fileSrc = fileSrc;
        this.jsonKey = jsonKey;
        this.responseHeaders = new HashMap<String, String>();
        json = new HashMap<String, String>();
    }

    public HttpPostData addJsonValue(String key, String value) {
        json.put(key, value);
        return this;
    }

    public String[] getHeaderNames() {
        Set<String> names = this.responseHeaders.keySet();
        return names.toArray(new String[names.size()]);
    }

    public String getHeaderValue(String name) {
        return this.responseHeaders.get(name);
    }

    public Map<String, String> getHeaders() {
        return this.responseHeaders;
    }

}