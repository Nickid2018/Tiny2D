package io.github.nickid2018.tiny2d.gui;

import io.github.nickid2018.tiny2d.window.Window;

public abstract class RenderComponent {

    private int x, y;
    private int width, height;

    public RenderComponent(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void render(GuiRenderContext context) {
    }

    public void onComponentShapeChanged() {
    }

    public void onWindowResize(Window window) {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
