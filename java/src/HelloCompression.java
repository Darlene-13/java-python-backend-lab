public class HelloCompression {
    public static void main (String[] args){
        System.out.println("Hello, compression world!");
        System.out.println("Ready to compress some files here.");

        // Let us use some letters to test
        String text = "AAAABBBBCCCCDDDDEEEEFFFF";
        byte[] data = text.getBytes();

        System.out.println("Text: " + text);
        System.out.println("Size:" + data.length + " bytes");
    }
}