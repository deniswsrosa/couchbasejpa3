package com.example.couchbasejpa3;


public class UserVO {

    private String name;
    private String position;
//    private String _class;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

//    public String get_class() {
//        return _class;
//    }
//
//    public void set_class(String _class) {
//        this._class = _class;
//    }


    @Override
    public String toString() {
        return "UserVO{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
