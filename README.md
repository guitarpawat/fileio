# File input and output
Testing copying file copying speed by using Java by using HP Envy13.

## Tests
Test by copying Big-Alice-in-Wonderland.txt sized 2,101,560 bytes.

| Type of testing | Total time |
|:----------------|-----------:|
|Copy the file one byte at a time|6.722431 seconds|
|Copy a file using a byte of array of size 1KB|0.066945 seconds|
|Copy a file using a byte of array of size 4KB|0.062273 seconds|
|Copy a file using a byte of array of size 64KB|0.060759 seconds|
|Copy a file using BufferedReader and PrintWriter to copy lines of text|0.117691 seconds|

## Explanation
Reads more bytes at once will copy faster because it will cause less times to do read and write.
In Java, the char type size is two bytes, so
* Copy the file one byte at a time = 0.5 char at a time.
* Copy a file using a byte of array of size 1KB = 512 chars at a time.
* Copy a file using a byte of array of size 4KB = 2048 chars at a time.
* Copy a file using a byte of array of size 64KB = 32768 chars at a time.
The Big-Alice-in-Wonderland.txt has 2 053 280 characters and 48 280 line, so the average is 42.53 characters per line. Therefore :
* Copy a file using BufferedReader and PrintWriter to copy lines of text = 42.53 chars at a time.
As you can see, when you copy more bytes at once, you will copy faster. 
