# Directory
Computer Science Workshop 2 (CSE 3141) End-Term Project

# Problem Statement
Write a program called Directory, which provides a listing of any
directory contained in the current directory. This program should
prompt the user for the name of the directory. It should then print a
listing of that directory. The listing should contain the following
information: The full path name of the directory, and then include the
file name, length, and last modified date, and a read/write code for
each file. The read/write code should be an r if the file is readable and
a w if the file is writeable, in that order. Use a “-” to indicate not
readable or not writeable. For example, a file that is readable but not
writable will have the code r-.

![Problem Demo](/images/image.png)

Note that the File.lastModified() returns a long, which gives the modifi-
cation time of the file. This number can’t easily be converted into a
date, so just report its value.

# Flow Chart
![Algorithm Flow Chart](/images/csw.jpeg)

# CODE
```rb
# src/Directory.java
```
