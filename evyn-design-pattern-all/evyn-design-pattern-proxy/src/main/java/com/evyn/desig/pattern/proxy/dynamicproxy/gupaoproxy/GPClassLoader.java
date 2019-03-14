package com.evyn.desig.pattern.proxy.dynamicproxy.gupaoproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.logging.FileHandler;

/**
 * @ClassName GPClassLoader
 * @Description:
 * @Author xyw
 * @Date 2019/3/10 21:45
 * @Version 1.0
 */
public class GPClassLoader extends ClassLoader {

    private File classPathFile;

    public GPClassLoader() {
        //String classPath = GPClassLoader.class.getName()
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        String className = GPClassLoader.class.getPackage().getName() + "." + name;
        if(classPathFile != null){
            File classFile = new File(classPathFile, name.replaceAll("\\.", "/") + ".class");
            if(classFile.exists()){
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try {
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] buffer = new byte[1024];
                    int len;
                    while((len = in.read(buffer)) != -1){
                        //out.write(buffer, 0, );
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
