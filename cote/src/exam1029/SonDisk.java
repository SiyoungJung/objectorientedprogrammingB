package exam1029;

public class SonDisk implements Usb{
    long size;
    long currentSize;

    @Override
    public String read() {
        return  currentSize + " 사용중, " + (size - currentSize) + " 남음";
    }

    @Override
    public void write(String dataSize) {
        int len = dataSize.length();
        if(size - currentSize > len) {
            currentSize += dataSize.length();
        }
    }

    public SonDisk() {
        size = 8589934592L;
    }

    public SonDisk(int size) {
        this.size = (size * 1073741824);
        currentSize = 0;
    }
}
