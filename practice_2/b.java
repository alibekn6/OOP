class StartTriangle {
    private int width;

    StartTriangle(int width) {
        this.width = width;
    }
    

    public String toString() {
        String result = "";

        for (int i = 1; i <= width; i++) {
            for (int j = 0; j < i; j++) {
                result += "[*]";
            }
            if (i < width) result += "\n";
        }
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        StartTriangle st = new StartTriangle(5);
        System.out.println(st.toString());
        
    }
}