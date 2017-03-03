package ku.util;

/**
 * Copy a file line-by-line.
 * @author Pawat Nakpiphatkul
 */
public class CopyTask5 extends FileCopyTask {
    
    // Copy size (byte) for each time
    public final int SIZE = 1024*64;
    
    /**
     * Initialize constructor.
     * @param in is infile for copy.
     * @param out is outfile for copy.
     */
    public CopyTask5(String in,String out) {
        super(in,out);
    }
    /**
     * Perform the copy
     */
    @Override
    public void run() {
        FileUtil.bcopy(in, out);
    }
    /**
     * Shows description of the task.
     * @return description of the task.
     */
    @Override
    public String toString() {
        return "Copy a file line-by-line";
    }
}
