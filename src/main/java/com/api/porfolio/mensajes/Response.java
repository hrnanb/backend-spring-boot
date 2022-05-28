/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.porfolio.mensajes;

/**
 *
 * @author herna
 */
public class Response {

    private String message;

    public String getMessage() {
        return message;
    }

    public Response(String message) {
        super();
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
