package com.learning.factory;

public class MusicFactory {

public MusicFactory getInstance(String type){
    switch (type){
        case "pop":
            return new Pop();
        case "hip hop":
            return new HipHop();
        default:
            return null;
    }

}
}
