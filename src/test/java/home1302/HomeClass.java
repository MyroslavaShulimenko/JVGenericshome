package home1302;

import java.util.ArrayList;
import java.util.List;


public class HomeClass<T> {
    private final List<T> list = new ArrayList<>();
    private int capacity;
    int size = 0;
int index;
    public HomeClass(int capacity) {
        this.capacity = capacity;
    }

    public void push(T elem) {
        if (list.size()<capacity){
        list.add(elem);size++;
        } else System.out.println("falsh");

    }

    public T popEnd() {
       if (!list.isEmpty())
        return list.remove(list.size()-1);
        return null;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public T pop(int index) {
        if (!list.isEmpty()){
            if (index <= list.size() - 1) {
                return list.remove(index);
            }
            System.out.println(index + "- size not ");}
            return null;
        }
        public String toString () {
            return list.toString();
        }

        public static void main (String[]args){
            HomeClass<Integer> homeClass = new HomeClass<>(6);
            homeClass.push(5);
            homeClass.push(4);
            homeClass.push(3);
            homeClass.push(2);
            homeClass.push(1);
            homeClass.push(0);
            homeClass.push(11);
            System.out.println(homeClass.toString());
           homeClass.popEnd();
           System.out.println(homeClass.toString());
            homeClass.pop(1);
            System.out.println(homeClass.toString());

            HomeClass<String> homeClassString = new HomeClass<>(6);
            homeClassString.push("fg");
            homeClassString.push("f1");
            homeClassString.push("f2");
            homeClassString.push("f3");
            homeClassString.push("fg");
            homeClassString.push("oo");
            homeClassString.push("fg");
            homeClassString.push("fg");
            homeClassString.push("fg");
            System.out.println(homeClassString.toString());
             homeClassString.popEnd();
            System.out.println(homeClassString.toString());

            homeClassString.pop(2);
            System.out.println(homeClassString.toString());

            homeClassString.pop(8);
            System.out.println(homeClassString.toString());

        }
    }


