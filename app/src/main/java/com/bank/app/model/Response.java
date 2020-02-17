package com.bank.app.model;

public class Response
{
     private boolean response;

    public Response(boolean response) {
        this.response = response;
    }

    public Response() {
    }

    public boolean isResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Response{" +
                "response=" + response +
                '}';
    }
}
