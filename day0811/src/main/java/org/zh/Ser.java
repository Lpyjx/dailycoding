package org.zh;

import javafx.concurrent.Service;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ser {
    public static void main(String[] args) throws IOException {
        ServerSocket ser = new ServerSocket(8899);
        Socket soc = ser.accept();
        InputStream is = soc.getInputStream();
        byte[] bs = new byte[1024];
        int len = is.read(bs);
        System.out.println(new String(bs,0,len));

        OutputStream os = soc.getOutputStream();
        os.write("nihaonihao".getBytes());
        soc.close();
        ser.close();

    }
}
