package io.github.nickid2018.tiny2d.gui;

import io.github.nickid2018.tiny2d.RenderThreadOnly;
import io.github.nickid2018.tiny2d.window.Window;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Screen extends RenderComponent {

    protected final LinkedHashMap<String, RenderComponent> components = new LinkedHashMap<>();

    public Screen(Window window) {
        super(window);
    }

    @Override
    public void render(GuiRenderContext context) {
        for (RenderComponent component : components.values())
            component.render(context);
    }

    @Override
    public void onWindowResize() {
        components.values().forEach(RenderComponent::onWindowResize);
    }

    @SuppressWarnings("unchecked")
    public <T extends RenderComponent> T getComponent(String name) {
        return (T) components.get(name);
    }

    public Map<String, RenderComponent> getComponents() {
        return components;
    }
}
