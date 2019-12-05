package src.reflect;

import src.proxy.UserDao;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectClass{
    //创建对象
    public static void reflectClass(){
        try {
            Class<?> reflectClass = Class.forName("src.proxy.UserDao");
            UserDao userDao = (UserDao) reflectClass.newInstance();
            userDao.setAge(10);
            userDao.setName("Lunar");
            System.out.println(userDao.getName()+":"+userDao.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取构造器
    public static void reflectConstructor(){
        try {
            Class<?> reflectConstructor = Class.forName("src.proxy.UserDao");
            Constructor<?> ObjectConstructor = reflectConstructor.getDeclaredConstructor(int.class,String.class);
            ObjectConstructor.setAccessible(true);//若构造器是私有，则需要设置该属性
            UserDao userDao = (UserDao)ObjectConstructor.newInstance(11,"lina");
            System.out.println(userDao.getName()+":"+userDao.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取属性
    public static void reflectField(){
        try {
            Class<?> reflectField = Class.forName("src.proxy.UserDao");
            UserDao userDao = (UserDao)reflectField.newInstance();
            userDao.setAge(12);
            userDao.setName("ice");
            Field[] ObjectFields = reflectField.getDeclaredFields();
            for (Field field: ObjectFields){
                field.setAccessible(true);
                System.out.print(field.get(userDao));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}