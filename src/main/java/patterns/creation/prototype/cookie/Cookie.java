package patterns.creation.prototype.cookie;

import lombok.Data;

@Data
public class Cookie implements Cloneable {
    private int tmp;

    @Override
    public Cookie clone() throws CloneNotSupportedException {
        return (Cookie) super.clone();
    }
}
