package com.bootcamp.demo;

public class ValidationException  {
    private String type;
    private String title;
    //private Enum status;
    private String status;
    private String detail;
// Solo añadimos type y estatus porque los otros los vamos a dejar fijos
    public ValidationException(String type, String status, String title, String detail) {
        this.type = type;
        this.status = status;
        this.title = title;
        this.detail = detail;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    /*
    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

 */
}
