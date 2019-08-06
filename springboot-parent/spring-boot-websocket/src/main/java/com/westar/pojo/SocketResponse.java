package com.westar.pojo;

public class SocketResponse {
    private String responseMsg;

    public SocketResponse(String responseMsg){
        this.responseMsg= responseMsg;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }
}
