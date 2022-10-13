package io.github.nickid2018.tiny2d.gui;

import io.github.nickid2018.tiny2d.window.Window;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Screen extends RenderComponent {

    protected final LinkedHashMap<String, RenderComponent> components = new LinkedHashMap<>();

    public Screen() {
        super(0, 0, -1, -1);
    }

    @Override
    public void render(GuiRenderContext context) {
        for (RenderComponent component : components.values())
            component.render(context);
    }

    @Override
    public void onWindowResize(Window window) {
        setWidth(window.getWidth());
        setHeight(window.getHeight());
        components.values().forEach(c -> c.onWindowResize(window));
    }

    public Map<String, RenderComponent> getComponents() {
        return components;
    }
}
