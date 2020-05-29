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
