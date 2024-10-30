
/**
 * Files
 */
// import java.io.*;
// class Files{
// public static void main(String[] args) throws IOException {
// DataInputStream dis = new DataInputStream(System.in);
// FileOutputStream fout = new FileOutputStream("nani.txt", true);

// System.out.println("Enter @ to end");
// char ch;
// while((ch = (char)dis.read())!='@')
// fout.write(ch);
// fout.close();
// }
// }

// import java.io.*;
/**
 * Files
 */
// public class Files {

// public static void main(String[] args) throws IOException {
// DataInputStream dis = new DataInputStream(System.in);
// FileOutputStream fout = new FileOutputStream("files2.txt",true);
// BufferedOutputStream bout = new BufferedOutputStream(fout, 1);
// System.out.println("Enter @ to end");
// char ch;
// while((ch = (char)dis.read())!='@')
// bout.write(ch);
// bout.close();
// }
// }

// import java.io.*;
// class Files{
// public static void main(String[] args) throws IOException {
// int ch;
// FileReader fr = null;

// try{
// fr = new FileReader("nani.txt");

// }
// catch(FileNotFoundException fe){
// System.out.println("file not found");
// return;
// }
// while((ch=fr.read())!=-1)
// System.out.print((char)ch);
// fr.close();
// }
// }

import java.io.*;

class Files {
  public static void main(String[] args) throws IOException {
    String st = "hi good morning  how are you";

    FileWriter fw = new FileWriter("nani2.txt");
    for (int i = 0; i < st.length(); i++)
      fw.write(st.charAt(i));
    fw.close();
  }
}

// import java.io.*;
// public class Files {

// public static void main(String[] args) throws IOException {
// int ch;
// FileInputStream fin = new FileInputStream("nani.txt");

// while((ch = fin.read())!=-1)
// System.out.print((char)ch);
// fin.close();
// }
// }
/*
 * import java.io.*;
 * public class Files {
 * 
 * public static void main(String[] args) throws IOException{
 * int ch;
 * FileInputStream fin = new FileInputStream("effi.txt");
 * 
 * while ((ch = fin.read())!=-1)
 * System.out.print((char)ch);
 * fin.close();
 * 
 * }
 * }
 */