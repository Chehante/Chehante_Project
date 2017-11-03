package HomeWork;

import java.io.File;

public class CompareCatalogs {

    public static void main(String[] args){
        File dir1 = new File("D:\\ТРТИЛЕК\\Java\\dir1");
        File dir2 = new File("D:\\ТРТИЛЕК\\Java\\dir2");

        List files1 = Utils.toList(dir1.listFiles());
        List files2 = Utils.toList(dir2.listFiles());

        List duplicated = Utils.intersect(files1, files2, new Predicate2() {
            @Override
            public boolean apply(Object a, Object b)  {
                return ((File) a).getName().equals(((File) b).getName()) && ((File) a).length() == ((File) b).length();
            }
        });
        for (Object o : duplicated) {
            System.out.println(o.toString());
        }

        File file = (File)Utils.find(new Predicate() {
            @Override
            public boolean apply(Object obj) {
                return ((File)obj).getName().equals("1.txt");
            }
        }, files1);

        System.out.println(file);

        List listMore1mb = Utils.filter(new Predicate() {
            @Override
            public boolean apply(Object obj) {
                return ((File) obj).length() > 1024*1024;
            }
        }, files1);

        for (Object o : listMore1mb) {
            System.out.println(o.toString());
        }

        List listExspJava = Utils.filter(new Predicate() {
            @Override
            public boolean apply(Object obj) {
                return ((File) obj).getName().endsWith(".vsdx");
            }
        }, files1);

        for (Object o : listExspJava) {
            System.out.println(o.toString());
        }

    }
}

class mFile extends File{
    public mFile(String pathname) {
        super(pathname);
    }



}
