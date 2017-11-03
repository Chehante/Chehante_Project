package HomeWork;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public final class Utils extends Object {

    public static Object find(Predicate prdct, List list) {

        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            Object o = itr.next();
            if (prdct.apply(o))
                return o;
        }
        return  null;

    }

    public static List filter(Predicate prdct, List list){

        Iterator itr = list.iterator();

        if (ArrayList.class == list.getClass()) {
            ArrayList arrayList = (ArrayList) list;
            ArrayList newArrayList = new ArrayList(new Object[arrayList.arrayObjects.length]);
            while (itr.hasNext()) {
                Object o = itr.next();
                if (prdct.apply(o))
                    newArrayList.add(o);
            }
            return newArrayList;
        } else if (LinkedList.class == list.getClass()) {
            LinkedList newLinkedList = new LinkedList();
            while (itr.hasNext()) {
                Object o = itr.next();
                if (prdct.apply(o))
                    newLinkedList.add(o);
            }
            return newLinkedList;

        }

        return  null;
    }

    public static List transform(Transformer trnsfmr, List list){

        Iterator itr = list.iterator();

        if (ArrayList.class == list.getClass()) {
            ArrayList arrayList = (ArrayList) list;
            ArrayList newArrayList = new ArrayList(new Object[arrayList.arrayObjects.length]);
            while (itr.hasNext()) {
                Object o = itr.next();
                newArrayList.add(trnsfmr.transform(o));
            }
            return newArrayList;
        } else if (LinkedList.class == list.getClass()) {
            LinkedList newLinkedList = new LinkedList();
            while (itr.hasNext()) {
                Object o = itr.next();
                newLinkedList.add(trnsfmr.transform(o));
            }
            return newLinkedList;

        }

        return  null;
    }

    public static void main(String[] args) {

        //ArrayList
//        ArrayList list = makeBasicArrList();
//
//        System.out.println(Arrays.toString(list.arrayObjects));
//
//        Object o = Utils.find(new Predicate() {
//            @Override
//            public boolean apply(Object obj) {
//                return new Integer(1).equals(obj);
//            }
//        }, list);
//
//        System.out.println(o);
//
//        List newList = Utils.filter(new Predicate() {
//            @Override
//            public boolean apply(Object obj) {
//                return obj.toString().length() == 1;
//            }
//        }, list);
//
//        ArrayList newArrayList = (ArrayList)newList;
//
//        System.out.println(Arrays.toString(newArrayList.arrayObjects));
//
//        List newTransformedList = Utils.transform(new Transformer() {
//            @Override
//            public Object transform(Object obj) {
//                return obj.toString() + obj.toString();
//            }
//        }, list);
//
//        ArrayList newTransformedArrayList = (ArrayList)newTransformedList;
//
//        System.out.println(Arrays.toString(newTransformedArrayList.arrayObjects));
//
//
//        //LinkedList
//        LinkedList list2 = makeBasicLinkedList();
//
//        list2.printList();
//
//        Object o2 = Utils.find(new Predicate() {
//            @Override
//            public boolean apply(Object obj) {
//                return new Integer(1).equals(obj);
//            }
//        }, list2);
//
//        System.out.println(o2);
//
//        List newList2 = Utils.filter(new Predicate() {
//            @Override
//            public boolean apply(Object obj) {
//                return obj.toString().length() == 1;
//            }
//        }, list2);
//
//        LinkedList newLinkedList = (LinkedList) newList2;
//        newLinkedList.printList();
//
//        List newTransformedList2 = Utils.transform(new Transformer() {
//            @Override
//            public Object transform(Object obj) {
//                return obj.toString() + obj.toString();
//            }
//        }, list2);
//
//        LinkedList newTransformedLinkedList = (LinkedList) newTransformedList2;
//        newTransformedLinkedList.printList();

        ArrayList arr1 = makeBasicArrList();
        ArrayList arr2 = makeBasicArrList();

        System.out.println(Arrays.toString(arr1.arrayObjects));
        System.out.println(Arrays.toString(arr2.arrayObjects));

        Predicate2 pr2 = new Predicate2() {
            @Override
            public boolean apply(Object a, Object b) {
                return a.equals(b);
            }
        };

        LinkedList finalList = (LinkedList)intersect(arr1, arr2, pr2);
        finalList.printList();

        LinkedList finalList2 = (LinkedList)difference(arr1, arr2, pr2);
        finalList2.printList();

    }

    public static ArrayList makeBasicArrList() {
        ArrayList arrList = new ArrayList(new Object[10]);

        Random rndm = new Random();

        for (int i = 0; i < 10; i++) {
            arrList.add(rndm.nextInt(13));
        }

        return arrList;
    }

    public static LinkedList makeBasicLinkedList() {
        LinkedList lnkdLst = new LinkedList();
        Random rndm = new Random();

        for (int i = 0; i < 10; i++) {
            lnkdLst.add(rndm.nextInt(13));
        }

        return lnkdLst;
    }

    public static List toList(Object[] arr){
        List list = new LinkedList();

        for(Object o : arr){
            list.add(o);
        }

        return list;
    }

    public static List intersect(List list1, List list2, Predicate2 pred){

        List finalList = new LinkedList();
        for (Object o : list1){
            for (Object b : list2){
                if ((pred == null && o.equals(b)) || pred.apply(o, b))
                    finalList.add(b);
            }
        }
        return finalList;
    }

    public static List difference(List list1, List list2, Predicate2 pred){

        List finalList = new LinkedList();
        for (Object o : list1){
            boolean add = true;
            for (Object b : list2){
                if ((pred == null && o.equals(b)) || pred.apply(o, b)) {
                    add = false;
                    break;
                }
            }
            if (add)
            finalList.add(o);
        }
        return finalList;
    }
}
