public class Tee extends Yee {
    public String first() {
        return "fo";
    }
    public String second() {
        return "fum" + this.first();
    }
}