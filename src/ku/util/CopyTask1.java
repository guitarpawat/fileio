package ku.util;

/**
 * Copy a file byte-by-byte.
 * @author Pawat Nakpiphatkul
 */
public class CopyTask1 extends FileCopyTask {
    
    /**
     * Initialize constructor.
     * @param in is infile for copy.
     * @param out is outfile for copy.
     */
    public CopyTask1(String in,String out) {
        super(in,out);
    }
    /**
     * Perform the copy
     */
    @Override
    public void run() {
        FileUtil.copy(in, out);
    }
    /**
     * Shows description of the task.
     * @return description of the task.
     */
    @Override
    public String toString() {
        return "Copy a file byte-by-byte";
    }
}
