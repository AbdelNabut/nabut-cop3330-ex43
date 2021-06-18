/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) throws IOException {

        // Ask the user for site information
        // create directories and file
        // writer to file

        // code is too simple and short to break up into other methods/classes.

        String siteName, siteAuthor;
        Scanner input = new Scanner(System.in);
        System.out.print("Site name: ");
        siteName = input.nextLine();
        System.out.print("Author: ");
        siteAuthor = input.nextLine();
        File websiteDirectory = new File("./website/" + siteName);
        websiteDirectory.mkdirs();

        System.out.print("Do you want a folder for JavaScript? (y/n) ");
        if(input.next().toLowerCase(Locale.ROOT).equals("y"))
            new File("./website/" + siteName + "/js").mkdirs();

        System.out.print("Do you want a folder for CSS? (y/n) ");
        if(input.next().toLowerCase(Locale.ROOT).equals("y"))
            new File("./website/" + siteName + "/css").mkdirs();

        FileWriter myWriter = new FileWriter(websiteDirectory + "/index.html");
        myWriter.write("<head>\n");
        myWriter.write("<meta name=\"title\" content=\""+ siteName + "\">\n");
        myWriter.write("<meta name=\"author\" content=\""+ siteAuthor + "\">\n");
        myWriter.write("</head>\n");
        myWriter.close();




    }
}
