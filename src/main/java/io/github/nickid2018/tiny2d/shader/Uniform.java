package io.github.nickid2018.tiny2d.shader;

import static org.lwjgl.opengl.GL30.*;

public class Uniform {

    private final String name;
    private final int location;

    public Uniform(String name, int location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setMatrix4fv(boolean transpose, float[] value) {
        glUniformMatrix4fv(location, transpose, value);
    }
}
