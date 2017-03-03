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
