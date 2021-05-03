package com.doubts;

import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;

class MP3 implements Comparable<MP3> {
    String name;
    MP3(String name)
    {
        this.name=name;
    }
    public int compareTo(MP3 mp3)
    {
         return this.name.compareTo(mp3.name);
    }
    @Override
    public String toString() {
        return "MP3 [name=" + name + "]";
    }
}

 

public class TreeDemo {
    public static void main(String[] args)
    {
        Set<MP3> set=new TreeSet<MP3>();
        set.add(new MP3("O Carol"));
        set.add(new MP3("smash"));
        set.add(new MP3("chance"));
        set.add(new MP3("race"));
        set.add(new MP3("smash"));
        set.add(new MP3("life"));
        set.add(new MP3("O Carol"));
        set.add(new MP3("smash"));
        set.add(new MP3("smash"));
//        Collections.sort(set);
        
        
//        The method sort(List<T>) in the type Collections 
//        is not applicable for the arguments (Set<MP3>)
        
        System.out.println(set);
        
    }

 

}