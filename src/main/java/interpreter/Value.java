package interpreter;

public class Value {

    public static Value VOID = new Value(new Object());

    final Object value;
    
    public Value(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        try{
            return Boolean.parseBoolean(value.toString());
        } catch (Exception e){
            return (Boolean)value;
        }
    }

    public Double asDouble() {
        try{
            return Double.parseDouble(value.toString());
        } catch (Exception e){
            return (Double)value;
        }
    }

    public String asString() {
        return String.valueOf(value);
    }

    public boolean isDouble() {
        try{
            Double temp = Double.parseDouble(value.toString());
            if (temp instanceof Double){
                return true;
            }
            else {
                return false;
            }
        } catch (Exception e){
            return value instanceof Double;
        }
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
