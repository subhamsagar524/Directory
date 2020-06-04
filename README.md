# Directory
Computer Science Workshop 2 (CSE 3141) End-Term Project

# Problem Statement
A program called Directory, which provides a listing of any
directory contained in the current directory. This program prompt the 
user for the name of the directory. It then print a listing of 
that directory. 
The listing should contain the following
information: The full path name of the directory, and then include the
file name, length, and last modified date, and a read/write code for
each file. The read/write code should be an r if the file is readable and
a w if the file is writeable, in that order. Use a “-” to indicate not
readable or not writeable. For example, a file that is readable but not
writable will have the code r-.

![Problem Demo](/images/image.png)

# Problem Analysis(Algorithm)
 - Steps
    1. Input Directory path from the user.
    2. Open the directory.
    3. Check if the directory exists or not.
    4. If Yes! Then store all the files in an File array.
    5. If array contains no files then terminate. If Yes Step 6.
    6. While not the end of array continue Step 7, 8, 9.
    7. Format the raw date.
    8. Read and Write code generation for the file.
    9. Fetch the file name, length, last modified and code.
    10. Display all file details.
    11. Stop

# Flow Chart
![Algorithm Flow Chart](/images/csw.jpeg)

# CODE
```java
import java.io.File;                        // For File Handling.
import java.text.SimpleDateFormat;          // For the Date format of the raw data.
import java.util.Formatter;                 // To display the data.
import java.util.Scanner;                   // For input of the path

public class Directory {

    // Function to print files in the directory.
    static void PrintFiles(File[] filesarr) {

        // Termination Condition
        if(filesarr.length == 0)
            return;

        // For all the files in the directory.
        for(int i = 0; i < filesarr.length; i++)
        {

            // Formatter for the raw date to readable form.
            SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

            // Code generation Read and Write rw, r-, -w, --
            String code = "";
            if(filesarr[i].canRead())
                code += 'r';
            else
                code += '-';
            if(filesarr[i].canWrite())
                code += 'w';
            else
                code += '-';

            // Prints the details of the file using Formatter
            Formatter f = new Formatter();
            f.format("Name: %4$3s    Size: %3$3s    Modified: %2$3s    Code: %s",
                    code, dateformat.format(filesarr[i].lastModified()), filesarr[i].length(), filesarr[i].getName());
            System.out.println(f);
        }
    }

    // Main function (Driver Method)
    public static void main(String[] args) {

        // Getting the main path for the directory to fetch the files.
        System.out.print("Listing for directory : ");
        Scanner sc = new Scanner(System.in);
        String path = sc.next();

        // File Object
        File dir = new File(path);

        // Check if the directory exists and list accordingly.
        if(dir.exists())
        {
            // Array to store all the files in the directory.
            File filesarr[] = dir.listFiles();

            // Print the details of the files in the directory.
            PrintFiles(filesarr);
        }
    }
}
```
# Sample Run

![Input and Output](/images/inputandoutput.jpeg)
