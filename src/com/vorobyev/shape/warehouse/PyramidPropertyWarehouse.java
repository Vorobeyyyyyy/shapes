package com.vorobyev.shape.warehouse;

import com.vorobyev.shape.entity.PyramidProperty;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class PyramidPropertyWarehouse {
    private static final PyramidPropertyWarehouse instance = new PyramidPropertyWarehouse();

    private final HashMap<Long, PyramidProperty> warehouse = new HashMap<>();

    public static PyramidPropertyWarehouse getInstance(){
        return instance;
    }

    public int size() {
        return warehouse.size();
    }

    public boolean isEmpty() {
        return warehouse.isEmpty();
    }

    public PyramidProperty get(Object key) {
        return warehouse.get(key);
    }

    public boolean containsKey(Object key) {
        return warehouse.containsKey(key);
    }

    public PyramidProperty put(Long key, PyramidProperty value) {
        return warehouse.put(key, value);
    }

    public void putAll(Map<? extends Long, ? extends PyramidProperty> m) {
        warehouse.putAll(m);
    }

    public PyramidProperty remove(Object key) {
        return warehouse.remove(key);
    }

    public void clear() {
        warehouse.clear();
    }

    public boolean containsValue(Object value) {
        return warehouse.containsValue(value);
    }

    public Set<Long> keySet() {
        return warehouse.keySet();
    }

    public Collection<PyramidProperty> values() {
        return warehouse.values();
    }

    public Set<Map.Entry<Long, PyramidProperty>> entrySet() {
        return warehouse.entrySet();
    }

    public PyramidProperty getOrDefault(Object key, PyramidProperty defaultValue) {
        return warehouse.getOrDefault(key, defaultValue);
    }

    public PyramidProperty putIfAbsent(Long key, PyramidProperty value) {
        return warehouse.putIfAbsent(key, value);
    }

    public boolean remove(Object key, Object value) {
        return warehouse.remove(key, value);
    }

    public boolean replace(Long key, PyramidProperty oldValue, PyramidProperty newValue) {
        return warehouse.replace(key, oldValue, newValue);
    }

    public PyramidProperty replace(Long key, PyramidProperty value) {
        return warehouse.replace(key, value);
    }

    public PyramidProperty computeIfAbsent(Long key, Function<? super Long, ? extends PyramidProperty> mappingFunction) {
        return warehouse.computeIfAbsent(key, mappingFunction);
    }

    public PyramidProperty computeIfPresent(Long key, BiFunction<? super Long, ? super PyramidProperty, ? extends PyramidProperty> remappingFunction) {
        return warehouse.computeIfPresent(key, remappingFunction);
    }

    public PyramidProperty compute(Long key, BiFunction<? super Long, ? super PyramidProperty, ? extends PyramidProperty> remappingFunction) {
        return warehouse.compute(key, remappingFunction);
    }

    public PyramidProperty merge(Long key, PyramidProperty value, BiFunction<? super PyramidProperty, ? super PyramidProperty, ? extends PyramidProperty> remappingFunction) {
        return warehouse.merge(key, value, remappingFunction);
    }

    public void forEach(BiConsumer<? super Long, ? super PyramidProperty> action) {
        warehouse.forEach(action);
    }

    public void replaceAll(BiFunction<? super Long, ? super PyramidProperty, ? extends PyramidProperty> function) {
        warehouse.replaceAll(function);
    }
}
