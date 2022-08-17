package org.zh;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Soc {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.52.171", 8899);
        OutputStream os = socket.getOutputStream();
        os.write("hello World".getBytes());
        InputStream is = socket.getInputStream();
        byte[] b = new byte[1024];
        int bs = is.read(b);
        System.out.println(new String(b,0,bs));
        socket.close();
    }
}
