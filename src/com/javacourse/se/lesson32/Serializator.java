package com.javacourse.se.lesson32;

import java.io.ObjectOutputStream;
import java.io.*;

public class Serializator
{
    public boolean seroalization(Cat32 cat)
    {
        boolean flag = false;

        File file = new File("D:/Arseniy/FollowTheWhiteRabbit/src/com/javacourse/se/lesson32/cat.data");
        ObjectOutputStream oos = null;

        try
        {
            FileOutputStream fos = new FileOutputStream(file);
            if(fos!=null)
            {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(cat);
                flag = true;
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(oos!=null)
            {
                try
                {
                    oos.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }


        return flag;
    }

    public Cat32 desiarilization() throws InvalidObjectException {
        File file = new File("D:/Arseniy/FollowTheWhiteRabbit/src/com/javacourse/se/lesson32/cat.data");
        ObjectInputStream ois = null;


        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream(file);
            if(fis!=null)
            {
                ois = new ObjectInputStream(fis);
                Cat32 cat32 = (Cat32) ois.readObject();
                return cat32;

            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                ois.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
        throw new InvalidObjectException("йцу");
    }
}
