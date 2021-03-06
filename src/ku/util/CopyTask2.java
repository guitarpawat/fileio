package ku.util;

/**
 * Copy a file using a byte of array of size 1KB.
 * @author Pawat Nakpiphatkul
 */
public class CopyTask2 extends FileCopyTask {
    
    // Copy size (byte) for each time
    public final int SIZE = 1024;
    
    /**
     * Initialize constructor.
     * @param in is infile for copy.
     * @param out is outfile for copy.
     */
    public CopyTask2(String in,String out) {
        super(in,out);
    }
    /**
     * Perform the copy
     */
    @Override
    public void run() {
        FileUtil.copy(in, out,SIZE);
    }
    /**
     * Shows description of the task.
     * @return description of the task.
     */
    @Override
    public String toString() {
        return "Copy a file using a byte of array of size 1KB";
    }
}
